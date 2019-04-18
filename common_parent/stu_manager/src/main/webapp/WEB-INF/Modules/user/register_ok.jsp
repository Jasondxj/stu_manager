<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>注册</title>
        <link rel="stylesheet" type="text/css" href="css/common.css">
        <link rel="stylesheet" href="css/register.css">
		<!--导入jquery-->
		<script src="${pageContext.request.contextPath}/assets/Scripts/jquery-3.3.1.js"></script>
        <script>
            $(function () {
                setTimeout(go, 3000);
                function go() {

                }
            })
        </script>
    </head>
    <body>
    <!--引入头部-->
    <div id="header"></div>
        <!-- 头部 end -->
    	<div style="text-align:center;red:yellow;font-weight:bold;height:150px;padding-top:100px;font-size:30px;">
    		<h4>恭喜，注册成功！点击<a href="${pageContext.request.contextPath}/user/login.do">登录</a>，返回登录页面</h4>
    	</div>
        <!--引入尾部-->
    	<div id="footer"></div>
    <!--导入布局js，共享header和footer-->
    <script type="text/javascript" src="js/include.js"></script>
    </body>
</html>