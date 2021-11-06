package br.com.bloodblue.bluebank.service;

import br.com.bloodblue.bluebank.dto.ClienteDto;
import br.com.bloodblue.bluebank.entity.Cliente;
import br.com.bloodblue.bluebank.repository.ClienteRepository;
import br.com.bloodblue.bluebank.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    @Transactional(readOnly = true)
    public List<ClienteDto> findAll() {
        List<Cliente> list = clienteRepository.findAll();
        return list.stream().map(x -> new ClienteDto(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public ClienteDto findByCpf(String cpf) {
        Optional<Cliente> obj = clienteRepository.findByCpf(cpf);
        Cliente entity = obj.orElseThrow(() -> new ResourceNotFoundException("Cliente não encontrado!"));
        return new ClienteDto(entity);

    }

    @Transactional(readOnly = true)
    public List<ClienteDto> findByNomeCompleto(String nomeCompleto) {
        Optional<List<Cliente>> obj = clienteRepository.findByNome(nomeCompleto);
        List<Cliente> list = obj.orElseThrow(() -> new ResourceNotFoundException("Cliente não encontrado"));
        return list.stream().map(x -> new ClienteDto(x)).collect(Collectors.toList());
    }

    @Transactional
    public ClienteDto insert(ClienteDto dto) {
        Cliente entity = new Cliente();
        copyDtoToEntity(dto, entity);

        try {
            entity = clienteRepository.save(entity);
        } catch (DataIntegrityViolationException e) {
            throw new ResourceNotFoundException("Erro de insert cliente: cpf " + entity.getCpf());
        }
        return new ClienteDto(entity);
    }

    @Transactional
    public ClienteDto update(String cpf, ClienteDto dto) {

        try {
            Optional<Cliente> obj = clienteRepository.findByCpf(cpf);
            Cliente entity = obj.orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado"));
            copyDtoToEntity(dto, entity);
            entity = clienteRepository.save(entity);
            return new ClienteDto(entity);

        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Cliente não encontrado: cpf " + cpf);
        }
    }

    @Transactional
    public void delete(String cpf) {
        Long id = -1l;

        try {
            id = clienteRepository.findByCpf(cpf).get().getId();
            clienteRepository.deleteById(id);

        } catch (NoSuchElementException e) {
            throw new ResourceNotFoundException("Cliente não encontrado");

        } catch (EmptyResultDataAccessException e) {
            throw new EmptyResultDataAccessException("Cliente não encontrado", id.intValue());

        } catch (DataIntegrityViolationException e) {
            throw new DataIntegrityViolationException("Erro de integridade");
        }


    }


    private void copyDtoToEntity(ClienteDto dto, Cliente entity) {
        entity.setNomeCompleto(dto.getNomeCompleto());
        entity.setCpf(dto.getCpf());
        entity.setRg(dto.getRg());
        entity.setDataNascimento(dto.getDataNascimento());
        entity.setTelefone(dto.getTelefone());
        entity.setEmail(dto.getEmail());
        entity.setEndereco(dto.getEndereco());
    }

    private void copyEntityToDto(Cliente entity, ClienteDto dto) {
        dto.setNomeCompleto(entity.getNomeCompleto());
        dto.setCpf(entity.getCpf());
        dto.setRg(entity.getRg());
        dto.setDataNascimento(entity.getDataNascimento());
        dto.setTelefone(entity.getTelefone());
        dto.setEmail(entity.getEmail());
        dto.setEndereco(entity.getEndereco());
    }


}
