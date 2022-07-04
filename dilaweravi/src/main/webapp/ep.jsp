<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="exception.jsp"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! 
int arr[]= new int[5];

%> <!-- declaration tag --->
<%
out.print(arr[0]);
out.print(arr[6]);

%> <br>

</body>
</html>