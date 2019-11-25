<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2019-02-13
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="success"/> </title>
</head>
<body>
    <center>
        <h1><spring:message code="success"/> </h1>
        <spring:message code="name"/>：<c:out value="${customer.name}"></c:out>
        <spring:message code="age"/>：<c:out value="${customer.age}"></c:out>
        <br>
        <a href="/SpringTest_war_exploded/customer/index">返回</a>
    </center>
</body>
</html>
