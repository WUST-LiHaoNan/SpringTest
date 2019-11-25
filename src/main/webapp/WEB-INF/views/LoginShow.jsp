<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2019-02-17
  Time: 22:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <label>用户名：</label><c:out value="${user.name}"></c:out><br/>
    <label>密码：</label><c:out value="${user.password}"></c:out><br/>
    <label>头像</label><br/>
    <img src="${basePath}${imagesPath}" width="100" >
</center>
</body>
</html>
