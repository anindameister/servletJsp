package demoApp;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Palindrome extends HttpServlet{
	
	


	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		class CasioPalindrome{
			public void PalindromeRocks(int k) throws IOException {
		
			
			
			String userInput2string = Integer.toString(k); 
			ArrayList<String> userInput2string2list =new ArrayList<String>();
		
		ArrayList<String> userInput2string2list2 =new ArrayList<String>();
		for (String retval: userInput2string.split("")) {

			
			
			userInput2string2list.add(retval);
			
		}
		for (int j=userInput2string2list.size()-1;j>=0;j--) {
			userInput2string2list2.add(userInput2string2list.get(j));
		
			
		}
		
		StringBuffer sb = new StringBuffer();
		
	      for (String s : userInput2string2list2) {
	          sb.append(s);
	       }
	      String str = sb.toString();
	      
	      
	      
	      
	      
	      if (userInput2string.contentEquals(str)==true){
	    	  res.getWriter().println("input palindrome");
	    	  System.out.println("input palindrome");
	    	  
	      }else {
	    	  res.getWriter().println("input is NOT palindrome");
	    	  System.out.println("input NOT palindrome");
	      }
			}
		}
		CasioPalindrome obj=new CasioPalindrome();
		
		HttpSession session=req.getSession();
		obj.PalindromeRocks((int)session.getAttribute("n"));
	}
}