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
  <input type="radio" name="gender" value="male" checked> Male<br>
  <input type="radio" name="gender" value="female"> Female<br>
  
  <br>
  <input type="text" name="txtAge" value="Age"><br>
  
  <br><b>Batch That Fits Your Timing!</b><br>
  <input type="radio" name="radioGroupBatchOptions"  checked> Morning: 6:30 to 8:30 <br>
  <input type="radio" name="radioGroupBatchOptions" >  Morning: 8:30 to 10:30<br>
  <input type="radio" name="radioGroupBatchOptions" >	Evening: 4:30 to 6:30 <br>
  <input type="radio" name="radioGroupBatchOptions" >	Evening: 6:30 to 8:30 <br>
  
  <br><b>Yoga you want to register for!</b><br>
  <input type="checkbox" name="radioRegisterAnusara" > Anusara 	<br>
  <input type="checkbox" name="radioRegisterAshtanga" > Ashtanga 	<br>
  <input type="checkbox" name="radioRegisterBikram" > Bikram	<br>
  <input type="checkbox" name="radioRegisterPower" > Power		<br>  
  <input type="checkbox" name="radioRegisterJivamukti" > Jivamukti<br>
  <input type="checkbox" name="radioRegisterKundlini" > Kundlini	<br>
  <br><br>
  
  <input type="text" name="txtCity" value="City"><br>
  
  <br>
  <input type="submit" value="Confirm Registration!"><br>
  
</form>

</div>

</body>
</html>