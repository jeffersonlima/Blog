package br.com.blog.entidades;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name="pessoa")
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = -4618780155549106569L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",nullable=false,unique=true)
	private Integer id;
	
	@Column(name="name",length=100,nullable=false)
	private String nome;
	
	@Column(name="email",length=150,nullable=false)
	private String email;
	
	@OneToOne(cascade = { CascadeType.ALL})
	@JoinColumn(name="id_telefone")
	private Telefone telefone;
	
	@OneToOne(cascade = { CascadeType.ALL})
	@JoinColumn(name = "id_endereco", nullable = false)
	private Endereco endereco;

	
	@OneToOne(cascade = { CascadeType.ALL})
	@JoinColumn(name="id_usuario", nullable=false)
	private Usuario usuario;
	

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
