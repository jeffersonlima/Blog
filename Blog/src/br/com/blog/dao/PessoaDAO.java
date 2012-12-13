package br.com.blog.dao;

import br.com.blog.entidades.Pessoa;

public class PessoaDAO extends GenericBlogDAO<Pessoa> {
	
	public PessoaDAO(){
		super.setClassePersistente(Pessoa.class);
		
	}

}
