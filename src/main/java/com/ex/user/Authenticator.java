package com.ex.user;

import javax.servlet.http.HttpSession;

public class Authenticator {
	
	private HttpSession session;
	
	private Authenticator(HttpSession httpsession) {
		this.session=httpsession;
	}
	public static Authenticator getAuthenticator(HttpSession httpsession) {
		return new Authenticator(httpsession);
	}
	
	public boolean isAuthenticate() {
		User user=this.getUser();
		return user!=null;
	}
	public User getUser() {
		return (User)session.getAttribute("user");
	}

}
