<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/6/4
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<table align="center" border="0px" cellpadding="0px" cellspacing="0px">
    <form action="register" method="post">
        <tr>
            <td>账户名:</td>
            <td><input type="text" name="aUsername"/></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="aPassword"/></td>
        <tr/>
        <tr>
            <td>姓名:</td>
            <td><input type="text" name="uName"/></td>

        <tr/>
        <tr>
            <td>性别:</td>
            <td><input type="text" name="uSex"/></td>
        <tr/>
        <tr>
            <td>年龄:</td>
            <td><input type="text" name="uAge"/></td>
        <tr/>
        <tr>
            <td>电话:</td>
            <td><input type="text" name="aPhone"/></td>
        <tr/>
        <tr>
            <td>电子邮箱:</td>
            <td><input type="text" name="aEmail"/></td>
        </tr>
        <tr>
            <td>第三方账户:</td>
            <td><input type="text" name="aGithub"/></td>
        </tr>
        <tr>
            <td rowspan="2"><input type="submit" value="注册"/></td>
        </tr>
    </form>
</table>

</body>
</html>
