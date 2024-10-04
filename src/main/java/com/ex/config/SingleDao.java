package com.ex.config;

import com.ex.category.CategoryDao;
import com.ex.note.NoteDao;
import com.ex.user.UserDao;

public class SingleDao {
	private static UserDao userDao;
	private static CategoryDao categoryDao;
	private static NoteDao noteDao;
	
	private SingleDao(){
		//to avoid instantiation
	}
	public static synchronized UserDao getUserDao() {
		if(userDao == null){
			userDao = new UserDao();
		}
		return  userDao;
	}
	public static synchronized CategoryDao getCategoryDao() {
		if(categoryDao == null) {
			categoryDao =new CategoryDao();
		}
		return categoryDao;
	}
	public static synchronized NoteDao getNoteDao() {
		if(noteDao == null) {
			noteDao=new NoteDao();
		}
		return noteDao;
	}
}
