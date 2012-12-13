package br.com.blog.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public abstract class GenericDAO<T> {
		
	protected static EntityManager entityManager;
	
	protected Class<T> classePersistente;
	
	public void createEntityManager(String banco) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory(banco);
		entityManager = entityManagerFactory.createEntityManager();
		
	}

	public Class<T> getClassePersistente() {
		return classePersistente;
	}

	public void setClassePersistente(Class<T> classePersistente) {
		this.classePersistente = classePersistente;
	}
	

	public T pesquisarPorId(Integer id){
		return(T) entityManager.find(classePersistente, id);
	}
	
	public void excluir (T object){
		EntityTransaction tx = entityManager.getTransaction();
		
		try{
		tx.begin();
		entityManager.remove(entityManager.merge(object));
		tx.commit();
		
		}catch (Exception e){
			e.printStackTrace();
			tx.rollback();
		}
		
	}
	
	public T Salvar(T object){
		EntityTransaction tx = entityManager.getTransaction();
		
		try{
			tx.begin();
			object = entityManager.merge(object);
			tx.commit();
		}catch (Exception e){
			e.printStackTrace();
			tx.rollback();
		}
		return object;
	}
	
}
