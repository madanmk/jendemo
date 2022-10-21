<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
     <pre>
   <form action="updateLocData" method="post">
    Id<input type="text" name="id"  value="${lo.id}"/>
    Code<input type="text" name="code"  value="${lo.code}"/>
    Name<input type="text" name="name" value="${lo.name}"/>
    Type
    Urban:<input type="radio" name="type" value="urban" />
    Rural:<input type="radio" name="type" value="rural" />
          <input type="submit" value="save" />
   </form>
   </pre>


</body>
</html>