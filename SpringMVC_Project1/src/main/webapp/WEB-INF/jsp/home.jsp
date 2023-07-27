<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

/* Style the navbar */
nav {
  background-color: #F06292; /* Pink */
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 10px;
}

.logo a {
  color: #FFF; /* White */
  font-size: 24px;
  text-decoration: none;
}

.nav-links {
  display: flex;
}

.nav-links li {
  list-style: none;
  margin-left: 20px;
}

.nav-links li a {
  color: #FFF; /* White */
  text-decoration: none;
  padding: 8px 16px;
  background-color: #64B5F6; /* Light Blue */
  border-radius: 4px;
  transition: background-color 0.3s ease;
}

.nav-links li a:hover {
  background-color: #FFD54F; /* Yellow */
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>


<body>
 <nav>
    <div class="logo">
      <a href="#home">Vaibhav</a>
    </div>
    <ul class="nav-links">
      <li><a href="registerForm">Register here</a></li>
      <li><a href="	updateForm">Update</a></li>
      <li><a href="	deleteForm">Delete</a></li>
      <li><a href="GetEmployee">GetEmployee</a></li>
      <li><a href="selectAll">GetAll</a></li>
    </ul>
  </nav>


</body>
</html>