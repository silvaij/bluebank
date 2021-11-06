/*
 * @author Isaque Silva
 * @Date 01/11/2021 14:43
 * @Objetivo : Entidade do cliente para ser transicionado via DTO para persistir em banco de dados
 * */

package br.com.bloodblue.bluebank.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCompleto;

    @Column(unique = true, nullable = false)
    private String cpf;
    private String rg;

    @Column(columnDefinition = "DATE")
    private LocalDate dataNascimento;
    private String telefone;

    private String email;


    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
    //private Conta conta; -- atributo ser desmarcado apos definicao de conta.

    //Construtores
    public Cliente() {

    }

    public Cliente(Long id, String nomeCompleto, String cpf, String rg, LocalDate dataNascimento, String telefone, String email, Endereco endereco) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

/*
    //Construtor que irá receber DTO
    public Cliente(ClienteDto dto) {
        id = dto.getId();
        nomeCompleto = dto.getNomeCompleto();
        cpf = dto.getCpf();
        rg = dto.getRg();
        dataNascimento = dto.getDataNascimento();
        telefone = dto.getTelefone();
        email = dto.getEmail();
        endereco = dto.getEndereco();
    }
*/

    // Getters and Setters


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
