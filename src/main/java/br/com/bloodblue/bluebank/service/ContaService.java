package br.com.bloodblue.bluebank.service;

import br.com.bloodblue.bluebank.dto.ExtratoDto;
import br.com.bloodblue.bluebank.entity.Cliente;
import br.com.bloodblue.bluebank.entity.Conta;
import br.com.bloodblue.bluebank.entity.Extrato;
import br.com.bloodblue.bluebank.entity.Operacao;
import br.com.bloodblue.bluebank.repository.ClienteRepository;
import br.com.bloodblue.bluebank.repository.ContaRepository;
import br.com.bloodblue.bluebank.repository.ExtratoRepository;
import br.com.bloodblue.bluebank.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    @Autowired
    private ExtratoRepository extratoRepository;

    @Autowired
    private ClienteRepository clienteRepository;


    @Transactional(readOnly = true)
    public List<ExtratoDto> findAllExtrato(String numConta) {
        Optional<Conta> obj = contaRepository.findByNumeroConta(numConta);
        Conta conta = obj.orElseThrow(() -> new ResourceNotFoundException("Conta não encontrada!"));
        List<Extrato> list = conta.getExtratos();
        return list.stream().map(x -> new ExtratoDto(x)).collect(Collectors.toList());
    }


    @Transactional
    public Extrato depositar(Double valor, String numConta) {
        Optional<Conta> obj = contaRepository.findByNumeroConta(numConta);
        Conta conta = obj.orElseThrow(() -> new ResourceNotFoundException("Conta não encontrada!"));
        conta.depositar(valor);

        Cliente cliente = clienteRepository.findByConta(conta);

        Extrato extrato = new Extrato();
        extrato.setOperacao(Operacao.CREDITO);
        extrato.setNome("POR: " + cliente.getNomeCompleto());
        extrato.setValor(valor);
        extrato.setMomento(Instant.now());

        conta.getExtratos().add(extrato);
        extratoRepository.save(extrato);
        return extrato;
    }

    @Transactional
    public Extrato sacar(Double valor, String numConta) {
        Optional<Conta> obj = contaRepository.findByNumeroConta(numConta);
        Conta conta = obj.orElseThrow(() -> new ResourceNotFoundException("Conta não encontrada!"));
        conta.sacar(valor);

        Cliente cliente = clienteRepository.findByConta(conta);

        Extrato extrato = new Extrato();
        extrato.setOperacao(Operacao.DEBITO);
        extrato.setNome("POR: " + cliente.getNomeCompleto());
        extrato.setValor(valor);
        extrato.setMomento(Instant.now());

        conta.getExtratos().add(extrato);
        extratoRepository.save(extrato);
        return extrato;
    }

    @Transactional
    public Extrato transferir(String numContaOrigem, String numContaDestino, Double valor) {
        Optional<Conta> objOrigem = contaRepository.findByNumeroConta(numContaOrigem);
        Conta contaOrigem = objOrigem.orElseThrow(() -> new ResourceNotFoundException("Conta não encontrada!"));

        Optional<Conta> objDestino = contaRepository.findByNumeroConta(numContaDestino);
        Conta contaDestino = objDestino.orElseThrow(() -> new ResourceNotFoundException("Conta não encontrada!"));

        Cliente clienteOrigem = clienteRepository.findByConta(contaOrigem);
        Cliente clienteDestino = clienteRepository.findByConta(contaDestino);

        contaOrigem.sacar(valor);
        contaDestino.depositar(valor);

        Extrato extratoOrigem = new Extrato();
        extratoOrigem.setOperacao(Operacao.PIX_ENVIADO);
        extratoOrigem.setNome("PARA: " + clienteDestino.getNomeCompleto());
        extratoOrigem.setValor(valor);
        extratoOrigem.setMomento(Instant.now());
        contaOrigem.getExtratos().add(extratoOrigem);

        Extrato extratoDestino = new Extrato();
        extratoDestino.setOperacao(Operacao.PIX_RECEBIDO);
        extratoDestino.setNome("POR: " + clienteOrigem.getNomeCompleto());
        extratoDestino.setValor(valor);
        extratoDestino.setMomento(Instant.now());
        contaDestino.getExtratos().add(extratoDestino);

        extratoRepository.save(extratoOrigem);
        extratoRepository.save(extratoDestino);

        return extratoOrigem;
    }

}
