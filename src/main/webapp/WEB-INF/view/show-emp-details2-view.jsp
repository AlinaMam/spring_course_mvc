<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<body>
<h2>Dear Employee, you are WELCOME!</h2>
<br>
Name: ${employee.name}
<br>
Surname : ${employee.surName}
<br>
Salary: ${employee.salary}
<br>
Department: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br>
Language(s):
<ul>
    <c:forEach var="item" items="${employee.languages}">
        <li>${item}</li>
    </c:forEach>

</ul>
Phone number: ${employee.phoneNumber}
<br>
Email: ${employee.email}
</body>
</html>