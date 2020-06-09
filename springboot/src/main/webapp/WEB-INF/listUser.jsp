<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/6/2
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table width="80%" align="center" cellspacing="0px" cellpadding="0px">
    <tr>
        <th>用户名</th>
        <th>密码</th>
    </tr>
    <c:forEach items="${list}" var="u">
        <tr>
            <td>${u.username}</td>
            <td>${u.password}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
