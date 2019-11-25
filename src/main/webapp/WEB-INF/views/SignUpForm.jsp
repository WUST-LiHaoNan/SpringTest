<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2019-02-13
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <style>
        .error {
            color: #ff0000;
        }

        .errorblock {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>

<body>
<h2>Customer SignUp Form - JSR303 @Valid example</h2>
<h2><spring:message code="index"></spring:message> </h2>
<form:form method="post" commandName="customer" action="/SpringTest_war_exploded/customer/signup">
    <form:errors path="*" cssClass="errorblock" element="div" />
    <table>
        <tr>
            <td><spring:message code="name"></spring:message> </td>
            <td><form:input path="name" /></td>
            <td><form:errors path="name" cssClass="error" /></td>
        </tr>
        <tr>
            <td><spring:message code="age"></spring:message> </td>
            <td><form:input path="age" /></td>
            <td><form:errors path="age" cssClass="error" /></td>
        </tr>
        <tr>
            <td colspan="3"><input type="submit" /></td>
        </tr>
    </table>
    <a href="?locale=zh">中文</a>|<a href="?locale=en">English</a>
</form:form>


</body>
</html>
