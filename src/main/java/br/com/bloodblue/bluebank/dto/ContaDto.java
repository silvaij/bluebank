package br.com.bloodblue.bluebank.dto;

import br.com.bloodblue.bluebank.entity.Conta;

import java.io.Serializable;
import java.util.Objects;

public class ContaDto implements Serializable {
    private Long id;
    private String  banco;
    private String  numeroAgencia;
    private String  numeroConta;
    private Double  saldo;
    private Double  chequeEspecial = 1.000;

    //CONSTRUTORES
    public ContaDto(){};

    public ContaDto(String banco, String numeroAgencia, String numeroConta, Double saldo, Double chequeEspecial, Long id) {
        this.banco = banco;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
        this.id = id;
    }

    public ContaDto(Conta conta){
        this.banco = conta.getBanco();
        this.numeroAgencia = conta.getNumeroAgencia() ;
        this.numeroConta = conta.getNumeroConta();
        this.saldo = conta.getSaldo();
        this.chequeEspecial = conta.getChequeEspecial();
        this.id = conta.getId();
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
        if (!(o instanceof ContaDto)) return false;
        ContaDto contaDto = (ContaDto) o;
        return id.equals(contaDto.id) && banco.equals(contaDto.banco) && numeroAgencia.equals(contaDto.numeroAgencia) && numeroConta.equals(contaDto.numeroConta) && saldo.equals(contaDto.saldo) && chequeEspecial.equals(contaDto.chequeEspecial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, banco, numeroAgencia, numeroConta, saldo, chequeEspecial);
    }
}
