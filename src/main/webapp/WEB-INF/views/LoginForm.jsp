<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2019-02-17
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>注册界面</title>
</head>
<body>
<center>
<form action="${basePath}File/upload" method="post" enctype="multipart/form-data">
    <label>用户名：</label><input type="text" name="name"/><br/>
    <label>密 码：</label><input type="password" name="password"/><br/>
    <label>头 像</label><input type="file" name="file"/><br/>
    <input type="submit" value="提  交"/>
</form>
</center>
</form>
</body>
</html>

