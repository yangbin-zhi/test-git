<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/6/4
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <script type="text/javascript">
        function changeImage() {
            document.getElementById("img").src = "${pageContext.request.contextPath}/imgs?time=" + new Date().getTime();
        }
    </script>
</head>
<body>
<table align="center" cellspacing="0px" cellpadding="0px">
    <form action="loginAccount" method="post">
        <div align="center">${info==null?"":info}</div>
        <tr>
            <td align="left">账户名</td>
            <td colspan="2"><input type="text" name="aUsername"/></td>
        </tr>
        <tr>
            <td align="left">密码</td>
            <td colspan="2"><input type="password" name="aPassword"/></td>
        <tr/>
        <tr>
            <td style="text-align:right; width:20%">输入校验码：</td>
            <td style="width:50%"><input type="text" class="textinput" name="checkCode"/></td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td style="text-align:right;width:20%;">&nbsp;</td>
            <td colspan="2" style="width:50%">
                <img src="${pageContext.request.contextPath}/imgs" width="180" height="30" class="textinput"
                     style="height:30px;" id="img"/>&nbsp;&nbsp;
                <a href="javascript:void(0);" onclick="changeImage()">看不清换一张</a>
            </td>
        </tr>
        <tr align="center">
            <td rowspan="3"><input type="submit" value="登录"/></td>
        <tr/>
    </form>
</table>
</body>
</html>
