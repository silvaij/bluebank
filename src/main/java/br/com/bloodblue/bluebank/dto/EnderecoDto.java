package br.com.bloodblue.bluebank.dto;

import br.com.bloodblue.bluebank.entity.Cliente;
import br.com.bloodblue.bluebank.entity.Endereco;

import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Objects;


public class EnderecoDto implements Serializable {

    private Long id;
    private String rua;
    private Integer numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;
    private Cliente cliente;

    public EnderecoDto() {

    }

    public EnderecoDto(Long id, String rua, Integer numero, String complemento, String cidade, String estado, String cep) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public EnderecoDto(Endereco endereco) {
        id = endereco.getId();
        rua = endereco.getRua();
        numero = endereco.getNumero();
        complemento = endereco.getComplemento();
        cidade = endereco.getCidade();
        estado = endereco.getEstado();
        cep = endereco.getCep();
    }


    public Long getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String  getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco [rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", cidade=" + cidade
                + ", estado=" + estado + ", cep=" + cep + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnderecoDto that = (EnderecoDto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
