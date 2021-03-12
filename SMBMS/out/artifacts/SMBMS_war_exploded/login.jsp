<%--
  Author: VAN
  Date: 2020/11/22
  Time: 21:52
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8"/>
    <title>登录</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <script type="text/javascript">

    </script>
</head>
<body class="login_bg">
    <section class="loginBox">
        <header class="loginHeader">
            <h1>管理系统</h1>
        </header>
        <section class="loginCont">
            <form class="loginForm" action="${pageContext.request.contextPath}/login.do" name="actionForm" id="actionForm" method="post">
                <div class="info">${error}</div>
                <div class="inputbox">
                    <label>用户名：</label>
                    <input type="text" class="input-text" id="userCode" name="userCode" placeholder="请输入用户名" required/>
                </div>
                <div class="inputbox">
                    <label>用户名：</label>
                    <input type="password" id="userPassword" name="userPassword" placeholder="请输入密码" required/>
                </div>
                <div class="subBtn">
                    <input type="submit" value="登录">
                    <input type="reset" value="重置">
                </div>
            </form>
        </section>
    </section>
</body>
</html>