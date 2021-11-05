package br.com.bloodblue.bluebank.entity;

import java.time.Instant;
import java.util.Objects;

public class Extratro {

	private Long id;
	private OperacaoEnum operacao;
	private String nome;
	private Double valor;
	private Instant momento;

	public Extratro(Long id, OperacaoEnum operacao, String nome, Double valor, Instant momento) {
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

	public OperacaoEnum getOperacao() {
		return operacao;
	}

	public void setOperacao(OperacaoEnum operacao) {
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
		Extratro other = (Extratro) obj;
		return Objects.equals(id, other.id) && Objects.equals(momento, other.momento)
				&& Objects.equals(nome, other.nome) && operacao == other.operacao && Objects.equals(valor, other.valor);
	}

}
