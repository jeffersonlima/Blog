package br.com.blog.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",nullable=false,unique=true)
	private Integer id;
	
	@Column(name="logradouro",length=100,nullable=false)
	private String logradouro;
	
	@Column(name="bairro",length=100,nullable=false)
	private String bairro;
	
	@Column(name="cep",length=100,nullable=false)
	private String cep;
	
	@Column(name="cidade",length=100,nullable=false)
	private String cidade;
	
	@Column(name="uf",length=100,nullable=false)
	private String uf;
	
	@Column(name="complemento",length=100,nullable=false)
	private String complemento;
	
	@Column(name="numero",length=100,nullable=false)
	private String numero;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
