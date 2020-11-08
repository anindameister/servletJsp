# Introduction to Servlets [[13]](#13).

- so my chrome asks for my facebook profile to the facebook server
- now facebook has several profiles and it needs to build the content of my profile with the data available in the database
- so now the server has the data available to build my profile and send an html page
- but now this profile needs to be built
- so the server contacts server's helper application which is called webContainer, we'll use TOMCAT
- there's a servelet(which serves the server) which would use the data from the database and build the anindaMaulik's facebook page
- the name of this servelet is unknown because there's an existence of many servelets for this facebook server
- the information of this servelet is available in the DeploymentDescriptor web.xml
- so now information is retrieved of the serveletName, contact made to that servelet along with the profileInfo and html page built and send to client

#### video 6 of the same guy


- POST request from client to server means client is posting data to the server
- The work of POST could also be done with GET request, but then the data the client is trying to post to the server would be available in the URL which is not very safe in case of passwords


##### 8 Servlet and JSP Tutorial | RequestDispatcher and sendRedirect Theory

- theory explanation
- .getAtrribute means that it will return an object

##### 10 Servlet and JSP Tutorial | HttpSession | Cookie

- cookie starts after 5mins
- me gone into dosa restaurant and ask for dosa and give 50
- shopkeeper says that he doesnt have the change of 15, because dosa is 35, and that I can collect the money after dosa is prepared. Shopkeeper, the server, gives me a token written 15
- I go to the kitchen window and ask the chef to prepare dosa
- while am waiting, I wanna have tea and go to the shopkeeper and give him 10 for 7 bucks tea, server(shopkeeper) gives me a token written 3.
- after getting dosa-tea,feeding on them, I go to the server and give the two token written 15 and 3.
- the shopkeeper says, I am gonna deduct the highest amount that's left because you enjoyed the airconditioning for free
- I said do whatever, just return some change because I have to buy cigarette.
- shopkeeper accepts the 15, 3 coupons ; finds out the 3 and gives the 3bucks to the kitchen as a tip for serving me with extra cheese.

#### exception
- https://stackoverflow.com/questions/31611982/catch-the-same-exception-twice
```
public void method(){

    try{
        methodThrowingIllegalArgumentException();
        return;
    catch (IllegalArgumentException e) {
        try {
            anotherMethodThrowingIllegalArgumentException();            
            return;
        } catch(IllegalArgumentException eee){
            //do some
            return;
        }
    } catch (SomeAnotherException ee){
       return;
    }
}
```
- the actual

```
try
{ 
	obj.Casio((int)req.getAttribute("k"));
} 

catch(Exception e) 
{ 
	try {
		obj.Casio(Integer.parseInt(req.getParameter("l")));
		
	}catch(Exception ee){
		obj.Casio((int)session.getAttribute("m"));
      
    }
	
	
	
} 
```
- the multiply
```
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
```
#### Deploy Java Web Application in AWS Elastic Beanstalk | AWS Tutorial for Beginners | Edureka [[14]](#14).

- nothing happened till now.
- seems that it requires Maven Project

# ServletConfig and ServletContext

- ServletContext for all servlets, same thing eg:name
- ServletConfig specific to servlets
- this ServletConfig is specific to servlets and hence it's declared inside the servlet tag asssociated to the particular servelet


# jsp
- in html we dont get errors
- declaration
- Directive
- Scriplet
- Expression



## References
<a id="1">[1]</a> 
https://www.youtube.com/watch?v=DC5wtYGQ7XE&feature=youtu.be

<a id="2">[2]</a> 
https://youtu.be/PjyVXs0_3H8

<a id="3">[3]</a> 
https://www.youtube.com/watch?v=Cff0OCIDWoc

<a id="4">[4]</a> 
https://www.youtube.com/watch?v=jF1CgTl6fXc

<a id="5">[5]</a> 
https://www.youtube.com/watch?v=NbN3qI78PgU

<a id="6">[6]</a> 
https://docs.oracle.com/javase/tutorial/essential/concurrency/

<a id="7">[7]</a> 
https://docs.oracle.com/javase/8/docs/api/java/lang/ProcessBuilder.html

<a id="8">[8]</a> 
https://www.youtube.com/watch?v=dqJanLvjDqc

<a id="9">[9]</a> 
https://www.youtube.com/watch?v=Nabjqv8KDgc

<a id="10">[10]</a> 
https://www.youtube.com/watch?v=QB19Wqimkq4&list=PLhW3qG5bs-L_qj1L5hnHvJYeFpQ_g4UuU&index=7

<a id="11">[11]</a> 
https://www.youtube.com/watch?v=h6Figshq6_I

<a id="12">[12]</a> 
https://www.youtube.com/watch?v=o6wYS9x1cCk&list=PLhW3qG5bs-L8kzOvEjaOyUs2LqHZ3fz4X&index=4

<a id="13">[13]</a> 
https://www.youtube.com/watch?v=7TOmdDJc14s&list=PLsyeobzWxl7pUPF2xjjJiG4BKC9x_GY46&index=1

<a id="14">[14]</a> 
https://www.youtube.com/watch?v=Ozc5Yu_IcaI

