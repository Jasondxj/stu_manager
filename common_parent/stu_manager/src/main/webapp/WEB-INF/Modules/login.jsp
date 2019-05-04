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
    <script>
        function checkUsername() {
            var username = $("#username").val();
            var reg_name = /\S/;
            var flag = reg_name.test(username);
            if (flag) {
                $("#username").css("border", "");
                $("#Umsg").html("");
            } else {
                $("#username").css("border", "1px solid red");
                $("#Umsg").html("用户名不能为空");
            }
            return flag;
        }
        function checkPassword() {
            var password = $("#password").val();
            var reg_password = /\S/;
            var flag = reg_password.test(password);
            if (flag) {
                $("#password").css("border", "");
                $("#Pmsg").html("");
            } else {
                $("#password").css("border", "1px solid red");
                $("#Pmsg").html("密码不能为空");
            }
            return flag;

        }

        $(function () {
            $("#loginForm").submit(function () {
                if (checkUsername() && checkPassword()) {
                    return true;
                }
                return false;
            });
            $("#username").blur(checkUsername);
            $("#password").blur(checkPassword);
        })
    </script>
</head>

<body style="background: url(${pageContext.request.contextPath}/assets/Images/23.jpg)">

<!-- 头部 end -->
<section id="login_wrap">
    <div class="fullscreen-bg" style="height: 532px;">

    </div>
    <div class="login-box" style="height: 500px">
        <div class="title" style="background-color:#76d8c2;">
            <img src="../../assets/Images/login.png" style="width: 61px;height: 56px">
            <span>欢迎登录学生管理系统</span>
        </div>
        <div class="login_inner">
            <!--登录错误提示消息-->
            <div id="errorMsg" class="alert alert-danger">${msg}</div>
            <form id="loginForm" action="${pageContext.request.contextPath}/user/login.do" method="post"
                  accept-charset="utf-8">
                <input name="username" type="text" placeholder="请输入账号" autocomplete="off" id="username">
                <span id="Umsg" style="color: red;font-size: 16px;display: block"></span>
                <input name="password" type="password" placeholder="请输入密码" autocomplete="off" id="password">
                <span id="Pmsg" style="color: red;display: block;font-size: 16px"></span>
                <input type="radio" value="管理员" name="role"
                       style="width: 20px;height:15px;vertical-align: text-top;margin-top: 2px" checked="checked">管理员
                <input type="radio" value="老师" name="role"
                       style="width: 20px;height:15px;vertical-align: text-top;margin-top: 2px;margin-left: 20px">老师
                <input type="radio" value="学生" name="role"
                       style="width: 20px;height:15px;vertical-align: text-top;margin-top: 2px;margin-left: 20px">学生
                <div class="verify">
                    <input name="check" type="text" placeholder="请输入验证码" autocomplete="off">
                    <span><img src="${pageContext.request.contextPath}/validatecode.jsp"
                               onclick="javascript:document.getElementById('code').src='${pageContext.request.contextPath }/validatecode.jsp?'+Math.random();" id="code"
                    ></span>
                </div>
                <div class="submit_btn">
                    <input type="submit" value="登录" style="margin-top: 20px;height: 40px">
                </div>
            </form>
            <div class="reg">没有账户？<a href="${pageContext.request.contextPath}/user/toRegister.do">立即注册</a></div>
        </div>
    </div>
</section>

</body>

</html>