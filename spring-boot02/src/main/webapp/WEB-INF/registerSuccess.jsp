<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/6/5
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        window.onload = function () {
            var time = 5;
            var secondEle = document.getElementById("second");
            var timer = setInterval(function () {
                secondEle.innerHTML = time;
                time--;
                if (time == 0) {
                    clearInterval(timer);
                    location.href = "login";
                }

            }, 1000);
        }
    </script>
</head>
<body>
恭喜你，注册成功，<span style="color:red" id="second">5</span>秒钟后跳转，如不跳转点击<a href="login">这里</a>!
</body>
</html>
