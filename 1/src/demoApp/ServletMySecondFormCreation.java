package demoApp;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mySecondFormCreation")
public class ServletMySecondFormCreation extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
//		class AnindaPreference{
//			public void Preference(String k) throws IOException{
//				if (k=="male"){
//					res.getWriter().println("I give you permission to lick my asshole because I dont know if you're male or female");
//					System.out.println("I give you permission to lick my asshole because I dont know if you're male or female");
//				}else if(k=="female"){
//					res.getWriter().println("Nothing for you");
//					System.out.println("Nothing for you");
//				}
//				
//			}
//		}
//	       <servlet>
//	       <servlet-name>abc9</servlet-name>
//	       <servlet-class>demoApp.ServletMySecondFormCreation</servlet-class>
//	       
//	       </servlet>
//	       <servlet-mapping>
//	         <servlet-name>abc9</servlet-name>
//	       <url-pattern>/mySecondFormCreation</url-pattern>
//	       </servlet-mapping> 
		
//		AnindaPreference obj=new AnindaPreference();
		String sex=req.getParameter("sex");
//		obj.Preference(sex);
		res.getWriter().println(sex);
		String str="male";
		if (sex.contentEquals(str)==true) {
			res.getWriter().println("I give you permission to lick my asshole because I dont know if you're male or female");
			System.out.println("I give you permission to lick my asshole because I dont know if you're male or female");
		}else {
			res.getWriter().println("Nothing for you");
			System.out.println("Nothing for you");
			
		}
		
		
//		try {
//			obj.AnindaPreference(req.getParameter("gender"));
//		}catch(Exception e) {
//			obj.AnindaPreference(req.getParameter("female"));
//		}
//	
//		
//	
//
	}

}
