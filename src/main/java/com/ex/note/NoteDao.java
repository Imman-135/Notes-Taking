package com.ex.note;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.ex.category.Category;
import com.ex.config.SingleEMF;

public class NoteDao {
	public void addNote(Note note) {
		EntityManager manager = SingleEMF.getFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(note);
		transaction.commit();
		
		manager.close();
		
	}
	public Category getCategoryByName(Category category) {
		EntityManager manager = SingleEMF.getFactory().createEntityManager();
		TypedQuery<Category> query = manager.createQuery("from Category where category=?1",Category.class);
		query.setParameter(1, category);
		Category resultCategory = query.getSingleResult();
		
		manager.close();
		
		return resultCategory;
		
	}

}
