<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ include file="header.jsp" %>
<head>
<meta charset="ISO-8859-1">

</head>
<body style="background-color:powderblue">
<h1 style="text-align: center">
ITEM

</h1>
<form action = "insertitem.jsp">

<input type="submit" value="Insert Item"/>
</form>
<br>
<form action = "updatepriceitem.jsp">

<input type="submit" value="Update Item Price"/>
</form>
<br>
<form action = "updatequantityitem.jsp">

<input type="submit" value="Update Item Quantity"/>
</form>
<br>
<form action = "deleteitem.jsp">

<input type="submit" value="Delete Item"/>
</form>
<br>



<%@include file="footer.jsp"%>
</body>

</html>