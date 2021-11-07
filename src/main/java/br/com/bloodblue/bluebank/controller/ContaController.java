package br.com.bloodblue.bluebank.controller;

import br.com.bloodblue.bluebank.dto.ExtratoDto;
import br.com.bloodblue.bluebank.entity.Extrato;
import br.com.bloodblue.bluebank.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api-bluebank/v1/conta")
public class ContaController {

    @Autowired
    private ContaService contaService;


    @GetMapping("/extrato/{numConta}")
    public ResponseEntity<List<ExtratoDto>> findAllExtratos(@PathVariable String numConta) {
        List<ExtratoDto> listaDto = contaService.findAllExtrato(numConta);
        return ResponseEntity.ok().body(listaDto);

    }


    @PostMapping("/deposito")
    public ResponseEntity<Extrato> deposito(@RequestParam(value = "numConta") String numConta, @RequestParam(value = "valor") Double valor) {
        Extrato extrato = contaService.depositar(valor, numConta);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(extrato.getId()).toUri();
        return ResponseEntity.created(uri).body(extrato);
    }

    @PostMapping("/saque")
    public ResponseEntity<Extrato> saque(@RequestParam(value = "numConta") String numConta, @RequestParam(value = "valor") Double valor) {
        Extrato extrato = contaService.sacar(valor, numConta);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(extrato.getId()).toUri();
        return ResponseEntity.created(uri).body(extrato);
    }

    @PostMapping("/transfere")
    public ResponseEntity<Extrato> transfere(@RequestParam(value = "numContaOrigem") String numContaOrigem,
                                             @RequestParam(value = "numContaDestino") String numContaDestino,
                                             @RequestParam(value = "valor") Double valor) {

        Extrato extrato = contaService.transferir(numContaOrigem, numContaDestino, valor);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(extrato.getId()).toUri();
        return ResponseEntity.created(uri).body(extrato);
    }


}
