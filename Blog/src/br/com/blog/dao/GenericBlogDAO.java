package br.com.blog.dao;

public class GenericBlogDAO<T> extends GenericDAO<T> {
	
	private static final String PERSISTENCE_UNIT =	"Blog_DB";
	
	public GenericBlogDAO(){
		super.createEntityManager(PERSISTENCE_UNIT);
	}
	
	

}
