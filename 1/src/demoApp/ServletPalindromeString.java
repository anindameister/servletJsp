package demoApp;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ServletPalindromeString extends HttpServlet{
	
	


	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		class CasioPalindrome{
			public void PalindromeRocks(String k) throws IOException {
				
				
				
				
				ArrayList<String> userInput2string2list =new ArrayList<String>();
				ArrayList<String> userInput2string2list2 =new ArrayList<String>();
				for (String retval: k.split("")) {

					
					
					userInput2string2list.add(retval);
					
				}
				for (int j=userInput2string2list.size()-1;j>=0;j--) {
					userInput2string2list2.add(userInput2string2list.get(j));
				
					
				}
				
				//https://www.tutorialspoint.com/How-to-create-a-string-from-a-Java-ArrayList#:~:text=To%20convert%20the%20contents%20of,using%20the%20toString()%20method.

				
				StringBuffer sb = new StringBuffer();
				
			      for (String s : userInput2string2list2) {
			          sb.append(s);
			       }
			      String str = sb.toString();
			      

			      
			      if (k.contentEquals(str)==true){
			    	  res.getWriter().println("input palindrome");
			    	  System.out.println("input palindrome");
			    	  
			      }else {
			    	  res.getWriter().println("input NOT palindrome");
			    	  System.out.println("input NOT palindrome");
			      }
				}
			}
			CasioPalindrome obj=new CasioPalindrome();
			
			
			
			Cookie cookies[]=req.getCookies();
			ArrayList<String> value2list =new ArrayList<String>();
		
		
			for (Cookie c: cookies) {
				if(c.getName().equals("email")) {
					String value=c.getValue().toString();
					value2list.add(value);
					
				}
					
			}
			StringBuffer sb2 = new StringBuffer();
			for (String value2list2stringAgain : value2list) {
		          sb2.append(value2list2stringAgain);
		       }
		      String str2 = sb2.toString();
			
			obj.PalindromeRocks(str2);
		}
	}