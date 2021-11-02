package br.com.bloodblue.bluebank.controller;

import br.com.bloodblue.bluebank.dto.ClienteDto;
import br.com.bloodblue.bluebank.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/listar")
    public ResponseEntity<List<ClienteDto>> findAll() {
        List<ClienteDto> listaDto = clienteService.findAll();
        return ResponseEntity.ok().body(listaDto);

    }

    @GetMapping("/listar/cpf/{cpf}")
    public ResponseEntity<ClienteDto> findByCpf(@PathVariable String cpf) {
        ClienteDto dto = clienteService.findByCpf(cpf);
        return ResponseEntity.ok().body(dto);

    }

    @GetMapping("/listar/nome/{nome}")
    public ResponseEntity<List<ClienteDto>> findByNome(@PathVariable String nome) {
        List<ClienteDto> listDto = clienteService.findByNomeCompleto(nome);
        return ResponseEntity.ok().body(listDto);
    }

    @PostMapping("/salvar")
    public ResponseEntity<ClienteDto> insert(@RequestBody ClienteDto dto) {
        dto = clienteService.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping("/editar/{cpf}")
    public ResponseEntity<ClienteDto> update(@PathVariable String cpf, @RequestBody ClienteDto dto) {
        dto = clienteService.update(cpf, dto);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping("/excluir/{cpf}")
    public ResponseEntity<ClienteDto> delete(@PathVariable String cpf) {
        clienteService.delete(cpf);
        return ResponseEntity.noContent().build();
    }

}
