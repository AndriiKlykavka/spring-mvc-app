<%--
  Created by IntelliJ IDEA.
  User: zelen
  Date: 02.02.2023
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student form</title>
</head>
<body>

 <form:form action="processForm" modelAttribute="student">
   First Name: <form:input path="firstName"/>

   <br><br>

   Last Name: <form:input path="lastName"/>

   <br><br>

   <input type="submit" value="Submit"/>
 </form:form>

</body>
</html>
