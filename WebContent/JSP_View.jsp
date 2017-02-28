<!--/*INTERNAL DOCUMENTATION
 * Student 1:  Name: Ali Saim (300759480)
 * Student 2:  Name: Tim Hitchcock (300801451)
 * Course: COMP303(Sec# 001) - Java EE Programming - Assignment 3 (Pair Programming)
 * Date: February 27 2017
 * Class Name: JSP_View.jsp
 * Class Description:   This is the jps file use to display an UI to user to interact with the application
 * 
 * */  -->

<%@ page language="java" import="mvc.YogaBean" contentType="text/html; charset=ISO-
8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	
<%


 YogaBean bean=(YogaBean)request.getAttribute("bean");
 out.print("<h3> Welcome, "+bean.getName() + ".</h3>"); 
 
 out.print("<br>");
 out.print("Your registration details are as follows:");
 out.print("<br>");
 
 
 out.print("<b>Email Address</b>: " + bean.getEmail());
 

 out.print("<br>");
 out.print("<b>Phone Number</b>: " + bean.getContactNumber());
 

 out.print("<br>");
 out.print("<b>Gender</b>: " + bean.getGender());
 

 out.print("<br>");
 out.print("<b>Age</b>: " + bean.getAge());
 

 out.print("<br>");
 out.print("<b>Batch</b>: " + bean.getBatchThatFitsYourTiming());
 

 out.print("<br>");
 out.print("<b>Yoga</b>: " + bean.getYogaYouWantToRegisterFor());
 

 out.print("<br>");
 out.print("<b>City</b>: " + bean.getCity());
 %>

</body>
</html>