package com.ex.category;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.ex.config.SingleEMF;
import com.ex.user.User;

public class CategoryDao {
	public List<Category> findCatogeryById(User user) {
		EntityManager manager = SingleEMF.getFactory().createEntityManager();
		
		TypedQuery<Category> query = manager.createQuery("from Category where user = ?1",Category.class);
		query.setParameter(1, user);
		
		List<Category> catogeries = query.getResultList();
		
		return catogeries;
	}
	public Category findCategoryByName(String categoryName) {
		EntityManager manager = SingleEMF.getFactory().createEntityManager();

		TypedQuery<Category> query = manager.createQuery("from Category where category_name=?1",Category.class);
		query.setParameter(1, categoryName);
		Category category = query.getSingleResult();
		
		manager.close();
		return category;
		
	}
	public void addCategory(Category category) {
		EntityManager manager = SingleEMF.getFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(category);
		transaction.commit();
		
		manager.close();
		
	}

}
