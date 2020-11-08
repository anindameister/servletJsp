<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor='pink'>
<% 
int age=Integer.parseInt(request.getParameter("age"));

		out.println("so your age is"+age);
		int str=32;
		if (age==str) {
			out.println("I am also"+str+"shake hands with me");
			System.out.println("I give you permission to lick my asshole because I dont know if you're male or female");
		}else if (age<32){
		
		
			out.println("you're younger to me");
			
			
		}else{
			out.println("you're elder to me,even better");
		}
		%>		

</body>
</html>