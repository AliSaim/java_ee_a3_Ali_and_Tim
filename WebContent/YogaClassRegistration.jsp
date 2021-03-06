<!--/*INTERNAL DOCUMENTATION
 * Student 1:  Name: Ali Saim (300759480)
 * Student 2:  Name: Tim Hitchcock (300801451)
 * Course: COMP303(Sec# 001) - Java EE Programming - Assignment 3 (Pair Programming)
 * Date: February 27 2017
 * Class Name: YogaClassRegistration.jsp
 * Class Description:   This is the jps file use to add new yoga registration records display an UI to user to interact with the application
 * 
 * */  -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
		<style type = "text/css">
		#pageBody
		{
			color:red;
			text-decoration: blink;
			position: center;
		}
	
		.h3{color:blue;}
	</style>	
</head>
<body>

<div id = "pageBody">
<h3>Yoga Class Registration</h3>

<form action="jsp_yoga_form" method="post">

  <br>
  <input type="text" name="txtName" value="Your Name"><br>
  
  <br>
  <input type="text" name="txtEmail" value="Email Id"><br>
  
  <br>
  <input type="text" name="txtContactNumber" value="Contact Number"><br>
  
  <br><b>Gender</b><br>
  <input type="radio" name="radioGender" value="male" checked> Male<br>
  <input type="radio" name="radioGender" value="female"> Female<br>
  
  <br>
  <input type="text" name="txtAge" value="Age"><br>
  
  <br><b>Batch That Fits Your Timing!</b><br>
  <input type="radio" name="radioGroupBatchOptions" value="Morning: 6:30 to 8:30" checked>  Morning: 6:30 to 8:30 <br>
  <input type="radio" name="radioGroupBatchOptions" value="Morning: 8:30 to 10:30">  		Morning: 8:30 to 10:30<br>
  <input type="radio" name="radioGroupBatchOptions" value="Evening: 4:30 to 6:30">			Evening: 4:30 to 6:30 <br>
  <input type="radio" name="radioGroupBatchOptions" value="Evening: 6:30 to 8:30">			Evening: 6:30 to 8:30 <br>
  
  <br><b>Yoga you want to register for!</b><br>
  <input type="checkbox" name="radioRegisterAnusara" 	value="Anusara"> 	Anusara 	<br>
  <input type="checkbox" name="radioRegisterAshtanga" 	value="Ashtanga"> 	Ashtanga 	<br>
  <input type="checkbox" name="radioRegisterBikram" 	value="Bikram"> 	Bikram		<br>
  <input type="checkbox" name="radioRegisterPower" 		value="Power"> 		Power		<br>  
  <input type="checkbox" name="radioRegisterJivamukti" 	value="Jivamukti"> 	Jivamukti	<br>
  <input type="checkbox" name="radioRegisterKundlini" 	value="Kundlini"> 	Kundlini	<br>
  <br><br>
  
  <input type="text" name="txtCity" value="City"><br>
  
  <br>
  <input type="submit" value="Confirm Registration!">

</form>
	
	
	<form action="jsp_yoga_form" method="get">
		
 		 <input type="submit" name="btnViewAll" value="View All"><br>
	
	</form>
	
	
	


</div>

</body>
</html>