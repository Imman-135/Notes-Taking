package com.ex.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleEMF {
	private static EntityManagerFactory factory;
	private SingleEMF() {
		//to avoid instatiation
	}
	public static synchronized EntityManagerFactory getFactory() {
		if(factory==null) {
			factory = Persistence.createEntityManagerFactory("abc");
		}
		return factory;
	}
}
