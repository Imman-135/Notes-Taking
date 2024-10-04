package com.ex.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ex.config.SingleDao;



@WebServlet("/login")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		try {
		User user = SingleDao.getUserDao().findByEmailAndPassword(email,password);
		if(user!=null) {
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			resp.sendRedirect("index.jsp");
		}
		}
		catch(Exception e) {
			resp.sendRedirect("register.jsp");
		}
	}
	

}
