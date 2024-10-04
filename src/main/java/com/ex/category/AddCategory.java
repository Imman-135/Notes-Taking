package com.ex.category;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ex.config.SingleDao;

@WebServlet("/add-category")
public class AddCategory extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String categoryName = req.getParameter("categoryName");
		String categoryDescription=req.getParameter("categoryDescription");
		Category category=new Category();
		category.setCatogeryName(categoryName);
		category.setDescription(categoryDescription);
		SingleDao.getCategoryDao().addCategory(category);
		resp.sendRedirect("manage_category");
	}
}
