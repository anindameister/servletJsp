package demoApp;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletDivide extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));;
		
		int m=i/j;


		res.getWriter().println("result is "+m);
		
		HttpSession session= req.getSession();
		session.setAttribute("m", m);
		
		res.sendRedirect("armstrong");
		

	}
}