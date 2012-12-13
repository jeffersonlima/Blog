package br.com.blog.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="telefone")
public class Telefone {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="id",nullable=false,unique=true)
		private Integer id;
	    
	    @Column(name="celular",length=20,nullable=false)
		private String celular;
		
	    @Column(name="fone",length=20,nullable=false)
		private String fone;
		

		public String getFone() {
			return fone;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public void setFone(String fone) {
			this.fone = fone;
		}

		public String getCelular() {
			return celular;
		}

		public void setCelular(String celular) {
			this.celular = celular;
		}
		
		

}
