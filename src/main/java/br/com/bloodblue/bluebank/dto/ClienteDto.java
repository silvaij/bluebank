package br.com.bloodblue.bluebank.dto;

import java.util.Date;
import java.util.Objects;

import br.com.bloodblue.bluebank.entity.Cliente;
import br.com.bloodblue.bluebank.entity.Endereco;

public class ClienteDto {

	private Long id;
	private String nomeCompleto;
	private Long cpf;
	private Long rg;
	private Date dataNascimento;
	private Integer telefone;
	private String email;
	private Endereco endereco;
	//Conta conta;
	
	public ClienteDto(Long id, String nomeCompleto, Long cpf, Long rg, Date dataNascimento, Integer telefone,
			String email) {
		super();
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
	}
	
	public ClienteDto() {
		super();
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
	}
	
	public ClienteDto(Cliente Cliente) {
		this.nomeCompleto = Cliente.getNomeCompleto();
	}
	
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
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
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
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteDto other = (ClienteDto) obj;
		return Objects.equals(id, other.id);
	}

	
}
