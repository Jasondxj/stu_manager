<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/Styles/common1.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/Styles/login1.css">
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <!--导入jquery-->
    <script src="${pageContext.request.contextPath}/assets/Scripts/jquery-3.3.1.js"></script>

</head>

<body>
<!--引入头部-->
<div id="header"></div>
<!-- 头部 end -->
<section id="login_wrap">
    <div class="fullscreen-bg" style="background: url(../../../assets/Images/23.jpg);height: 532px;">

    </div>
    <div class="login-box">
        <div class="title">
            <img src="../../../assets/Images/login_logo.png" alt="">
            <span>欢迎登录学生管理系统</span>
        </div>
        <div class="login_inner">

            <!--登录错误提示消息-->
            <div id="errorMsg" class="alert alert-danger">${msg}</div>
            <form id="loginForm" action="${pageContext.request.contextPath}/user/login.do" method="post"
                  accept-charset="utf-8">
                <input type="hidden" name="action" value="login"/>
                <input name="username" type="text" placeholder="请输入账号" autocomplete="off">
                <input name="password" type="password" placeholder="请输入密码" autocomplete="off">
                <%--<div class="verify">--%>
                <%--<input name="check" type="text" placeholder="请输入验证码" autocomplete="off">--%>
                <%--<span><img src="checkCode" alt="验证码" onclick="changeCheckCode(this)"></span>--%>
                <%--<script type="text/javascript">--%>
                <%--图片点击事件--%>
                <%--function changeCheckCode(img) {--%>
                <%--img.src="checkCode?"+new Date().getTime();--%>
                <%--}--%>
                <%--</script>--%>
                <%--</div>--%>
                <div class="submit_btn">
                    <%--<button type="button"  id="btn_sub">登录</button>--%>
                    <input type="submit" value="登录" style="margin-top: 20px;height: 40px">
                </div>
            </form>

            <div class="reg">没有账户？<a href="${pageContext.request.contextPath}/user/toRegister.do">立即注册</a></div>
        </div>
    </div>
</section>

</body>

</html>