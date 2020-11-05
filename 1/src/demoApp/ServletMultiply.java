package demoApp;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletMultiply extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));;
		
		int n=i*j;


		res.getWriter().println("result is "+n);
		
		HttpSession session= req.getSession();
		session.setAttribute("n", n);
		
		res.sendRedirect("palindrome");
		

	}
}