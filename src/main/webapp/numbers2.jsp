<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<h1>Number Converter</h1>
<form action="getNumber2Servlet" method="post">
Enter Your Third Number:
<input type="text" name="userNumber3" size="10">
<input type ="submit" value="Submit Number">

Enter Your Fourth Number:
<input type="text" name="userNumber4" size="10">
<input type ="submit" value="Submit Number">
</body>
</html>