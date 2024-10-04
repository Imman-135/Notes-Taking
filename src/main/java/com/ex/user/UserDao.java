package com.ex.user;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.ex.config.SingleEMF;

public class UserDao {
	public void addUser(User user){
		
		EntityManager manager = SingleEMF.getFactory().createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(user);
		transaction.commit();
		
		manager.close();
	}
	public void updateUser(User user) {
		
	}
	public User findByEmailAndPassword(String email, String password) {
		EntityManager manager = SingleEMF.getFactory().createEntityManager();
		
		TypedQuery<User> query = manager.createQuery("from User where email=:email and password=: password",User.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		
		User user = query.getSingleResult();
		
		manager.close();
		
		return user;
		
		
	}

}
