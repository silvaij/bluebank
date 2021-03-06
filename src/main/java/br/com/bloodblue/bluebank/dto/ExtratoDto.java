package br.com.bloodblue.bluebank.dto;

import br.com.bloodblue.bluebank.entity.Extrato;
import br.com.bloodblue.bluebank.entity.Operacao;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class ExtratoDto implements Serializable {

    private Long id;
    private Operacao operacao;
    private String nome;
    private Double valor;
    private Instant momento;

    public ExtratoDto() {

    }

    public ExtratoDto(Long id, Operacao operacao, String nome, Double valor, Instant momento) {
        this.id = id;
        this.operacao = operacao;
        this.nome = nome;
        this.valor = valor;
        this.momento = momento;
    }

    public ExtratoDto(Extrato entity) {
        this.id = entity.getId();
        this.operacao = entity.getOperacao();
        this.nome = entity.getNome();
        this.valor = entity.getValor();
        this.momento = entity.getMomento();
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
        ExtratoDto other = (ExtratoDto) obj;
        return Objects.equals(id, other.id) && Objects.equals(momento, other.momento)
                && Objects.equals(nome, other.nome) && operacao == other.operacao && Objects.equals(valor, other.valor);
    }

}
