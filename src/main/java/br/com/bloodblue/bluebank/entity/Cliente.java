/*
* @author Isaque Silva
* @Date 01/11/2021 14:43
* @Objetivo : Entidade do cliente para ser transicionado via DTO para persistir em banco de dados
* */

package br.com.bloodblue.bluebank.entity;
import java.time.LocalDate;
import java.util.Objects;

public class Cliente {

    //Atributos
    private Long id;
    private String nomeCompleto;
    private Long cpf;
    private Long rg;
    private LocalDate dataNascimento;
    private Integer telefone;
    private String email;
    private Endereco endereco;
    //private Conta conta; -- atributo ser desmarcado apos definicao de conta.

    //Construtores
    public Cliente(Long id, String nomeCompleto, Long cpf, Long rg, LocalDate dataNascimento, Integer telefone, String email, Endereco endereco) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public Cliente(){}

    /* Construtor que irá receber DTO
    public Cliente(ClientDto dto){
        this.id = dto.getId();
        this.nomeCompleto = dto.getNomeCompleto();
        this.cpf = dto.getCpf();
        this.rg = dto.getRg();
        this.dataNascimento = dto.getDataNascimento();
        this.telefone = dto.getTelefone();
        this.email = dto.getEmail();
        this.endereco = dto.getEndereco();
    }*/


    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getRg() {
        return rg;
    }

    public void setRg(Long rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
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

    //Sobrescrevendo os métodos equals e hashcode de Object
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return id.equals(cliente.id) && nomeCompleto.equals(cliente.nomeCompleto) && cpf.equals(cliente.cpf) && rg.equals(cliente.rg) && dataNascimento.equals(cliente.dataNascimento) && telefone.equals(cliente.telefone) && email.equals(cliente.email) && endereco.equals(cliente.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeCompleto, cpf, rg, dataNascimento, telefone, email, endereco);
    }
}
