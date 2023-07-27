<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">

div{
border:2px solid-red;
height: 500px;
width: 400px;
background-color:lightpink;
padding-left: 100px;
border-radius: 25px;
}
button{
margin-left: 80px; 
padding-right: 60px;
 padding-left: 60px;
 background-color: yellow;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: green;margin-left: 300px;">Welcome To Spring MVC</h1>

<form action="register" method="post">

                

                  <div style="margin-left: 350px;">
                  
                  <h2 style="color:black;text-align: centre;">Registration Form..</h2>
                    
                   <label>FirstName:</label>
                    <input type="text"  name="fname" /><br><br>
                    
                     <label>MiddleName:</label>
                    <input type="text"  name="mname" /><br><br>
                    
                     <label>SurName:</label>
                    <input type="text"  name="sname" /><br><br>
                    
                     <label>BirthDate:</label>
                    <input type="date"  name="dob" /><br><br>
                    
                     <label>MobileNo:</label>
                    <input type="text"  name="mob" /><br><br>
                    
                     <label>Address:</label>
                    <input type="text"  name="address" /><br><br>
                    
                    <label>PinCode:</label>
                    <input type="text"  name="pincode" /><br><br>
                    
                     <label>EmailId:</label>
                    <input type="text"  name="emailId" /><br><br>
                    
                   <label>Password:</label>
                    <input type="password"  name="password" /><br><br>
                    
                    
                 
                    
                    <button>Register</button>
                   
                  </div>
                  
            
</form>
</body>

</body>
</html>