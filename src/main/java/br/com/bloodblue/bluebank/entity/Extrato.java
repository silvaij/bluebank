package br.com.bloodblue.bluebank.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_extrato")
public class Extrato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Operacao operacao;

    private String nome;
    private Double valor;
    private Instant momento;

    public Extrato() {

    }

    public Extrato(Long id, Operacao operacao, String nome, Double valor, Instant momento) {
        this.id = id;
        this.operacao = operacao;
        this.nome = nome;
        this.valor = valor;
        this.momento = momento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Operacao getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Instant getMomento() {
        return momento;
    }

    public void setMomento(Instant momento) {
        this.momento = momento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, momento, nome, operacao, valor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Extrato other = (Extrato) obj;
        return Objects.equals(id, other.id) && Objects.equals(momento, other.momento)
                && Objects.equals(nome, other.nome) && operacao == other.operacao && Objects.equals(valor, other.valor);
    }

}
