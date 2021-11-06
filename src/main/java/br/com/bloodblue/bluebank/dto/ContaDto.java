package br.com.bloodblue.bluebank.dto;

import br.com.bloodblue.bluebank.entity.Conta;

import java.io.Serializable;
import java.util.Objects;

public class ContaDto implements Serializable {
    private Long id;
    private String banco;
    private String numeroAgencia;
    private String numeroConta;
    private Double saldo;
    private Double chequeEspecial = 1.000;

    //CONSTRUTORES
    public ContaDto() {
        this.banco = "BlueBank";
        this.numeroAgencia = String.valueOf((int) (Math.random() * 1000000) + 1);
        this.numeroConta = String.valueOf((int) (Math.random() * 1000) + 1);
        this.saldo = 0.0;
        this.chequeEspecial = 1000.00;
    }

    ;

    public ContaDto(String banco, String numeroAgencia, String numeroConta, Double saldo, Double chequeEspecial, Long id) {
        this.banco = banco;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
        this.id = id;
    }

    public ContaDto(Conta conta) {
        this.id = conta.getId();
        this.banco = conta.getBanco();
        this.numeroAgencia = conta.getNumeroAgencia();
        this.numeroConta = conta.getNumeroConta();
        this.saldo = conta.getSaldo();
        this.chequeEspecial = conta.getChequeEspecial();

    }

    //Metodos Getters and Setterd
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaDto contaDto = (ContaDto) o;
        return Objects.equals(id, contaDto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
