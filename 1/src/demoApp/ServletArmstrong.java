package demoApp;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ServletArmstrong extends HttpServlet{
	
	


	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		class Casio{
			public void Casio(int k) throws IOException {
				
				String userInput2string = Integer.toString(k); 
				ArrayList<String> userInput2string2list =new ArrayList<String>();

			      for (String retval: userInput2string.split("")) {
			  		
			    	 int retvalInted=Integer.parseInt(retval); 
			    	 int cubeddRetvalInted=retvalInted*retvalInted*retvalInted;
			    	 String stringedCubeddRetvalInted=Integer.toString(cubeddRetvalInted);
			    	 

					userInput2string2list.add(stringedCubeddRetvalInted);

			       }
				

				int lengthUserInput=userInput2string2list.size();
				
				ArrayList<Integer> userInput2string2listInteger =new ArrayList<Integer>();
				int i;
				for (i=0;i<lengthUserInput;i++) {
					userInput2string2listInteger.add(Integer.parseInt(userInput2string2list.get(i)));
			

					}

				int sum = 0;
				for(int j = 0; j < userInput2string2listInteger.size(); j++) {
				    sum += userInput2string2listInteger.get(j);
				}
				if (k==sum) {
					
					res.getWriter().println("result of your operation is "+k);
					res.getWriter().println("please note that this is coming from ServletArmstrong");
					res.getWriter().println("congrats, you have chosen an armstrong number");

					System.out.println("congrats, you have chosen an armstrong number");
					
				}else {
					res.getWriter().println("result of your operation is "+k);
					res.getWriter().println("please note that this is coming from ServletArmstrong");
					res.getWriter().println("armstrong number have not been chosen by you");

					System.out.println("armstrong number have not been chosen by you");
					
				}
				
				
				
			}
		}

		
		
Casio obj=new Casio();



//
HttpSession session=req.getSession();
//obj.Casio((int)req.getAttribute("k"));
//obj.Casio(Integer.parseInt(req.getParameter("l")));
//		obj.Casio((int)session.getAttribute("m"));
		
		
		
	    	
try
{ 
//	res.getWriter().println("<html><body bgcolor='cyan'>");
	obj.Casio((int)req.getAttribute("k"));
	ServletContext sc=getServletContext();
	String invitationType=sc.getInitParameter("invitationType");
	String name=sc.getInitParameter("name");
	String location=sc.getInitParameter("location");
	String prepositionType=sc.getInitParameter("prepositionType");
	res.getWriter().println(invitationType+" "+prepositionType+" "+name+" "+location);
//	res.getWriter().println("</body></html>");
} 

catch(Exception e) 
{ 
	try {
		obj.Casio(Integer.parseInt(req.getParameter("l")));
		
		ServletContext sc=getServletContext();
		String name=sc.getInitParameter("name");
		
		ServletConfig sc2=getServletConfig();
		String name2=sc2.getInitParameter("name");
		res.getWriter().println(name+"is loved by"+name2);
		
		
	}catch(Exception ee){
		obj.Casio((int)session.getAttribute("m"));
		ServletContext sc=getServletContext();
		String name=sc.getInitParameter("name");
		res.getWriter().println("I love you "+name);
		
      
    }
	
	
	
} 

	
	
	
} 
		
		
		
		
		
		
		
//		try {
//			int k=Integer.parseInt(req.getParameter("l"));
//			String userInput2string = Integer.toString(k); 
//			ArrayList<String> userInput2string2list =new ArrayList<String>();
//
//		      for (String retval: userInput2string.split("")) {
//		  		
//		    	 int retvalInted=Integer.parseInt(retval); 
//		    	 int cubeddRetvalInted=retvalInted*retvalInted*retvalInted;
//		    	 String stringedCubeddRetvalInted=Integer.toString(cubeddRetvalInted);
//		    	 
//
//				userInput2string2list.add(stringedCubeddRetvalInted);
//
//		       }
//			
//
//			int lengthUserInput=userInput2string2list.size();
//			
//			ArrayList<Integer> userInput2string2listInteger =new ArrayList<Integer>();
//			int i;
//			for (i=0;i<lengthUserInput;i++) {
//				userInput2string2listInteger.add(Integer.parseInt(userInput2string2list.get(i)));
//		
//
//				}
//
//			int sum = 0;
//			for(int j = 0; j < userInput2string2listInteger.size(); j++) {
//			    sum += userInput2string2listInteger.get(j);
//			}
//			if (k==sum) {
//				
//				res.getWriter().println("result of your operation is "+k);
//				res.getWriter().println("please note that this is coming from ServletArmstrong and not Servlet Add");
//				res.getWriter().println("congrats, you have chosen an armstrong number");
//
//				System.out.println("congrats, you have chosen an armstrong number");
//				
//			}else {
//				res.getWriter().println("result of your operation is "+k);
//				res.getWriter().println("please note that this is coming from ServletArmstrong and not Servlet Add");
//				res.getWriter().println("armstrong number have not been chosen by you");
//
//				System.out.println("armstrong number have not been chosen by you");
//				
//			}
//
//	}
//		     catch (Exception e) {
//		    	 int k=(int)req.getAttribute("k");
//		      
//		
//		
//
//		
//	
//
//		
//	
//		String userInput2string = Integer.toString(k); 
//		ArrayList<String> userInput2string2list =new ArrayList<String>();
//
//	      for (String retval: userInput2string.split("")) {
//	  		
//	    	 int retvalInted=Integer.parseInt(retval); 
//	    	 int cubeddRetvalInted=retvalInted*retvalInted*retvalInted;
//	    	 String stringedCubeddRetvalInted=Integer.toString(cubeddRetvalInted);
//	    	 
//
//			userInput2string2list.add(stringedCubeddRetvalInted);
//
//	       }
//		
//
//		int lengthUserInput=userInput2string2list.size();
//		
//		ArrayList<Integer> userInput2string2listInteger =new ArrayList<Integer>();
//		int i;
//		for (i=0;i<lengthUserInput;i++) {
//			userInput2string2listInteger.add(Integer.parseInt(userInput2string2list.get(i)));
//	
//
//			}
//
//		int sum = 0;
//		for(int j = 0; j < userInput2string2listInteger.size(); j++) {
//		    sum += userInput2string2listInteger.get(j);
//		}
//		if (k==sum) {
//			
//			res.getWriter().println("result of your operation is "+k);
//			res.getWriter().println("please note that this is coming from ServletArmstrong and not Servlet Add");
//			res.getWriter().println("congrats, you have chosen an armstrong number");
//
//			System.out.println("congrats, you have chosen an armstrong number");
//			
//		}else {
//			res.getWriter().println("result of your operation is "+k);
//			res.getWriter().println("please note that this is coming from ServletArmstrong and not Servlet Add");
//			res.getWriter().println("armstrong number have not been chosen by you");
//
//			System.out.println("armstrong number have not been chosen by you");
//			
//		}


}
