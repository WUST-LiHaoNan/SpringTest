<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2019-02-14
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>展示</title>
</head>
<body>
    姓名:<c:out value="${Customer.name}"></c:out>
    年龄:<c:out value="${Customer.age}"></c:out>
</body>
</html>
