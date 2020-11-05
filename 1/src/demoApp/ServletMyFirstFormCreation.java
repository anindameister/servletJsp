package demoApp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletMyFirstFormCreation extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String firstName=req.getParameter("fname");
		String lastName=req.getParameter("lname");
		String email=firstName+"."+lastName+"@maulik.com";
		res.getWriter().println("your email ID is "+email);
		
		Cookie cookie= new Cookie("email",email);
		res.addCookie(cookie);
		
		res.sendRedirect("palindromeString");
		
		
	
	

}
}
