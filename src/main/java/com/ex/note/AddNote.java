package com.ex.note;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ex.category.Category;
import com.ex.config.SingleDao;

@WebServlet("/add-note")
public class AddNote extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String categoryName = req.getParameter("categoryName");
		Category categoryByName = SingleDao.getCategoryDao().findCategoryByName(categoryName);
		if(categoryByName!=null) {
		Category existCategory=SingleDao.getNoteDao().getCategoryByName(categoryByName);
		if(existCategory!=null) {
			Note note=new Note();
			String title = req.getParameter("noteTitle");
			String text = req.getParameter("text");
			note.setNoteTitle(title);
			note.setText(text);
			note.setCategory(existCategory);
			SingleDao.getNoteDao().addNote(note);
			resp.sendRedirect("add-note.jsp");
		}
		}
		
	}

}
