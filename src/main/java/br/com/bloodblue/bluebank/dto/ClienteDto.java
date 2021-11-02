package br.com.bloodblue.bluebank.dto;

import br.com.bloodblue.bluebank.entity.Cliente;
import br.com.bloodblue.bluebank.entity.Endereco;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

public class ClienteDto implements Serializable {

    private Long id;
    private String nomeCompleto;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private String telefone;
    private String email;
    private Endereco endereco;
    //Conta conta;

    public ClienteDto() {

    }

    public ClienteDto(Long id, String nomeCompleto, String cpf, String rg, LocalDate dataNascimento, String telefone, String email, Endereco endereco) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }


    public ClienteDto(Cliente cliente) {
        id = cliente.getId();
        nomeCompleto = cliente.getNomeCompleto();
        cpf = cliente.getCpf();
        rg = cliente.getRg();
        dataNascimento = cliente.getDataNascimento();
        telefone = cliente.getTelefone();
        email = cliente.getEmail();
        endereco = cliente.getEndereco();
    }

    public Long getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ClienteDto other = (ClienteDto) obj;
        return Objects.equals(id, other.id);
    }


}
