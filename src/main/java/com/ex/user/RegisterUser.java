package com.ex.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ex.config.SingleDao;
@WebServlet("/register")
public class RegisterUser extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user =new User();
		if(req.getParameter("username")!= null&&req.getParameter("email")!=null&&req.getParameter("password")!=null) {
		user.setUserName(req.getParameter("username"));
		user.setEmail(req.getParameter("email"));
		user.setPassword(req.getParameter("password"));
		SingleDao.getUserDao().addUser(user);
		}
		resp.sendRedirect("login.jsp");
	}
	
}
