<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<body>
    <table border=1>
     <tr>
     <th>Id</th>
     <th>Code</th>
     <th>Name</th>
     <th>Type</th>
     <th>Delete</th>
     <th>Update</th>
     </tr>
     <c:forEach items="${loct}" var="lo">
     <tr>
       <td>${lo.id}</td>
        <td>${lo.code}</td>
         <td>${lo.name}</td>
          <td>${lo.type}</td>
          <td><a href="delete?id=${lo.id}">delete</a></td>
          <td><a href="update?id=${lo.id}">update</a></td>
     </tr>
     </c:forEach>
    </table>
</body>
</html>