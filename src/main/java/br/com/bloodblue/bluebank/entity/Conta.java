package br.com.bloodblue.bluebank.entity;

import br.com.bloodblue.bluebank.service.exceptions.AccountErrorException;

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

    @OneToMany(fetch = FetchType.EAGER)
    private List<Extrato> extratos;


    public Conta() {
        this.banco = "BlueBank";
        this.numeroAgencia = String.valueOf((int) (Math.random() * 1000) + 1);
        this.numeroConta = String.valueOf((int) (Math.random() * 1000000) + 1);
        this.saldo = 1000.0;
    }


    //METODOS DE TRANSFERENCIA A SER IMPLEMENTADO
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
        } else {
            throw new AccountErrorException("Saldo insuficiente");
        }
    }


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

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long conta) {
        this.id = id;
    }

    public List<Extrato> getExtratos() {
        return extratos;
    }

    public void setExtratos(List<Extrato> extratos) {
        this.extratos = extratos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(id, conta.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
