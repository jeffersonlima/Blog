package br.com.blog.entidades;

import javax.persistence.Column;
import javax.persistence.OneToOne;

public class Posts {
	
	
	@Column(name="id",nullable=false,unique=true)
	private Integer id;
	
	@Column(name="titulo",length=100,nullable=false)
	private String titulo;
	
	@Column(name="mensagem",length=100,nullable=false)
	private String mensagem;
	
	@OneToOne
	@Column(name="usuario",length=100,nullable=false)
	private Usuario usuario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
