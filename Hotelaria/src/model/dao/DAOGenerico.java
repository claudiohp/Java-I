package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.text.html.parser.Entity;

public abstract class DAOGenerico <T> {

	protected EntityManager entityManager;
	
	protected DAOGenerico() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hotelaria");
		if(entityManager == null){
			entityManager = factory.createEntityManager();
		}		
		return entityManager;
	}
	
	@SuppressWarnings("unchecked")
	public T searchForID(int id, Class<T> clazz){
		return (T) entityManager.find(clazz , id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> searchAll(Class<T> clazz){
		Query test = entityManager.createQuery("FROM " + clazz.getName());
		return test.getResultList();
	}

}
