package br.com.bloodblue.bluebank.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/*
 * Author:Isaque Silva
 * Date : 03-11-2021 09:58
 * Objetivo: Entidade conta ira representar a conta do cliente tem como responsabilidade
 * disponibilizar para efetuar as transações de uma conta
 * */

@Entity
@Table(name = "tb_conta")
public class Conta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String banco;
    private String numeroAgencia;
    private String numeroConta;
    private Double saldo;
    private Double chequeEspecial = 1.000;



    //METODOS DE TRANSFERENCIA A SER IMPLEMENTADO
    public double depositar(double valor) {
        return 0.0;
    }

    ;

    public double transfere(double valor) {
        return 0.0;
    }

    ;

    public double sacar(double valor) {
        return 0.0;
    }

    ;

    // Metodos Getters and Setters
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

    ;

    public void setSaldo(Double saldo) {
        this.saldo = saldo + chequeEspecial;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long conta) {
        this.id = id;
    }


    // Construtores da Classe
    public Conta(String banco, String numeroAgencia, String numeroConta, Double saldo, Double chequeEspecial) {
        super();
        this.banco = banco;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public Conta() {
    }

    ;

    // Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta)) return false;
        Conta conta = (Conta) o;
        return banco.equals(conta.banco) && numeroAgencia.equals(conta.numeroAgencia) && numeroConta.equals(conta.numeroConta) && saldo.equals(conta.saldo) && chequeEspecial.equals(conta.chequeEspecial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(banco, numeroAgencia, numeroConta, saldo, chequeEspecial);
    }
}
