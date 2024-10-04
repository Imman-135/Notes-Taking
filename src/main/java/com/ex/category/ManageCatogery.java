package com.ex.category;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ex.config.SingleDao;
import com.ex.user.Authenticator;
import com.ex.user.User;

@WebServlet("/manage_category")
public class ManageCatogery extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Authenticator auth =Authenticator.getAuthenticator(req.getSession());
		if(auth!=null) {
			User user = auth.getUser();
			List<Category> categories = SingleDao.getCategoryDao().findCatogeryById(user);
			req.setAttribute("categories", categories);
			req.getRequestDispatcher("manage-category.jsp").forward(req, resp);
		}else {
			resp.sendRedirect("login.jsp");
		}
	}
}
