<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
 <tr>
 <th>id</th>
 <th>first name</th>
 <th>middle name</th>
 <th>surname</th>
 <th>date of birth</th>
 <th>mobile</th>
 <th>adress<th>
 <th>pincode</th>
 <th>emailid</th>
 <th>password</th>
 
 </tr>
 <c:forEach var="emp" items="${empData }">
 
 <tr>
 <td>${emp.id }</td>
 <td>${emp.fname }</td>
 <td>${emp.mname }</td>
 <td>${emp.sname }</td>
 <td>${emp.dob }</td>
 <td>${emp.mob }</td>
 <td>${emp.address }</td>
 <td>${emp.pincode}</td>
  <td>${emp.emailId}</td>
   <td>${emp.password}</td>
 </tr>
 
 </c:forEach>
</table>

</body>
</html>