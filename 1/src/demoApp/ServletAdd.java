package demoApp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletAdd extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));;
		int k=i+j;
	
		//here Tomcat is handling and not a typical java project
		System.out.println("result is"+k);
		res.getWriter().println("result is "+k);
		
		
//		k=k*k;
//		res.getWriter().println("btw, here's a square of the result: "+k);
		
		
		
		req.setAttribute("k", k);
		
		RequestDispatcher rd=req.getRequestDispatcher("armstrong");
		rd.forward(req, res);
		
		
		


	}
		
	
}