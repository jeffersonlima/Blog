package br.com.blog.entidades;

import javax.persistence.Column;
import javax.persistence.OneToOne;


public class Comentario {
	
	@SuppressWarnings("unused")
	@Column(name="id",nullable=false,unique=true)
	private Integer id;
	
	@SuppressWarnings("unused")
	@Column(name="comentario",length=100,nullable=false)
	private String comentario;
	
	@SuppressWarnings("unused")
	@OneToOne
	@Column(name="posts",length=100,nullable=false)
	private Posts posts;
	
	@SuppressWarnings("unused")
	@OneToOne
	@Column(name="usuario",length=100,nullable=false)
	private Usuario usuario;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
