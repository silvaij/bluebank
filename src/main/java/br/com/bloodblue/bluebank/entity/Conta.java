package br.com.bloodblue.bluebank.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.List;
import java.util.Objects;
import java.util.Random;

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
    private Double chequeEspecial;

    @OneToOne(mappedBy = "conta")
    private Cliente cliente;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Extrato> extratos;


    public Conta() {
        this.banco = "BlueBank";
        this.numeroAgencia = String.valueOf((int) (Math.random() * 1000000) + 1);
        this.numeroConta = String.valueOf((int) (Math.random() * 1000) + 1);
        this.saldo = 0.0;
        this.chequeEspecial = 1000.00;

    }

    /*
        // Construtores da Classe
        public Conta(String banco, String numeroAgencia, String numeroConta, Double saldo, Double chequeEspecial) {
            this.banco = banco;
            this.numeroAgencia = numeroAgencia;
            this.numeroConta = numeroConta;
            this.saldo = saldo;
            this.chequeEspecial = chequeEspecial;
        }

    */
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
