package br.com.blog.teste;

import br.com.blog.dao.PessoaDAO;
import br.com.blog.entidades.Endereco;
import br.com.blog.entidades.Pessoa;
import br.com.blog.entidades.Telefone;
import br.com.blog.entidades.Usuario;

public class TestePessoa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa = new Pessoa();
		Telefone telefone = new Telefone();
		Endereco endereco = new Endereco();
		Usuario usuario = new Usuario();
		
		
		pessoa.setNome("JOAO SANTOS");
		pessoa.setEmail("joao@gmail.com");
		
		telefone.setFone("62 4000-5000");
		telefone.setCelular("62 7000-8000");
		
		endereco.setLogradouro("Avenida Pio XII");
		endereco.setBairro("Cidade Jardim");
		endereco.setComplemento("Jefferson Lima");
		endereco.setCep("74425010");
		endereco.setCidade("Goiania");
		endereco.setUf("GO");
		endereco.setNumero("618");
		
		usuario.setLogin("araguaia");
		usuario.setSenha("123456");

		pessoa.setUsuario(usuario);
		pessoa.setEndereco(endereco);
		pessoa.setTelefone(telefone);
		
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		pessoaDAO.Salvar(pessoa);
		
		
		System.out.println("Objeto Pessoa  \n" + pessoa.getNome() + 
				                          '\n' + pessoa.getEmail() +
				                          '\n' + pessoa.getTelefone().getFone() +
				                          '\n' + pessoa.getTelefone().getCelular() + 
				                          '\n' + pessoa.getEndereco().getCidade() +
				                          '\n' + pessoa.getUsuario().getLogin());
	
		
		
		
	}

}
