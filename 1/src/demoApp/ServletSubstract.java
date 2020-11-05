package demoApp;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletSubstract extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));;
		
		int l=i-j;
		
		//here Tomcat is handling and not a typical java project
	
		
		res.getWriter().println("result is "+l);
		
		res.sendRedirect("armstrong?l="+l);
		

	}
}


