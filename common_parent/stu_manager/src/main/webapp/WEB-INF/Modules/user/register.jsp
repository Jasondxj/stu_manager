<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>注册</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/Styles/common1.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/Styles/register.css">
		<!--导入jquery-->
		<script src="${pageContext.request.contextPath}/assets/Scripts/jquery-3.3.1.js"></script>

		<script>
			/*
				表单校验：
					1.用户名：单词字符，长度8到20位
					2.密码：单词字符，长度8到20位
					3.email：邮件格式
					4.姓名：非空
					5.手机号：手机号格式
					6.出生日期：非空
					7.验证码：非空
			 */

			//校验用户名
			//单词字符，长度8到20位
            function checkUsername() {
                var username = $("#username").val();
                var reg_username = /^[\S\s]{1,20}$/;
                var flag = reg_username.test(username);
                if (flag) {
                    $("#username").css("border", "");

                } else {
                    //用户名非法
                    $("#username").css("border", "1px solid red");
                }
                return flag;

            }

            //校验密码
            function checkPassword() {
                var password = $("#password").val();
                var reg_password = /^\w{8,20}$/;
                var flag = reg_password.test(password);
                if (flag) {
                    $("#password").css("border", "");

                } else {
                    //用户名非法
                    $("#password").css("border", "1px solid red");
                }
                return flag;

            }

            function checkEmail() {
                var email = $("#email").val();
                var reg_email = /^\w+@\w+\.\w+$/;
                var flag = reg_email.test(email);
                if (flag) {
                    $("#email").css("border", "");
                } else {
                    $("#email").css("border", "1px solid red");
                }
                return flag;
            }

            function checkName() {
                var name = $("#name").val();
                var reg_name = /\S/;
                var flag = reg_name.test(name);
                if (flag) {
                    $("#name").css("border", "");
                } else {
                    $("#name").css("border", "1px solid red");
                }
                return flag;
            }

            function checkTelephone() {
                var telephone = $("#telephone").val();
                var reg_telephone = /^1(3|4|5|7|8)\d{9}$/;
                var flag = reg_telephone.test(telephone);
                if (flag) {
                    $("#telephone").css("border", "");
                } else {
                    $("#telephone").css("border", "1px solid red");
                }
                return flag;
            }

            function checkBirthday() {
                var birthday = $("#birthday").val();
                var reg_birthday = /\S/;
                var flag = reg_birthday.test(birthday);
                if (flag) {
                    $("#birthday").css("border", "");
                } else {
                    $("#birthday").css("border", "1px solid red");
                }
                return flag;
            }

			$(function () {
                //当表单提交时，调用所有的校验方法
				$("#registerForm").submit(function(){
					if(checkUsername() && checkPassword() && checkEmail() && checkName() && checkTelephone() && checkBirthday()){
					    return true;
					}
					//2.不让页面跳转
                    return false;
                    //如果这个方法没有返回值，或者返回为true，则表单提交，如果返回为false，则表单不提交
				});
                //当某一个组件失去焦点是，调用对应的校验方法
                $("#username").blur(checkUsername);
                $("#password").blur(checkPassword);
                $("#email").blur(checkEmail);
                $("#name").blur(checkName);
                $("#telephone").blur(checkTelephone);
                $("#birthday").blur(checkBirthday);


            });


		</script>


    </head>
	<body>
	<!--引入头部-->
	<div id="header"></div>
        <!-- 头部 end -->
    	<div class="rg_layout" style="height: 718.5px">
    		<div class="rg_form clearfix" style="margin:100px auto;">
    			<div class="rg_form_left" >
    				<p style="color: #76d8c2">新用户注册</p>
    				<p>USER REGISTER</p>
    			</div>
    			<div class="rg_form_center">
					<div id="errorMsg" style="color:red;text-align: center"></div>
					<!--注册表单-->
    				<form id="registerForm" action="${pageContext.request.contextPath}/user/register.do" method="post">
						<!--提交处理请求的标识符-->
						<input type="hidden" name="action" value="register">
    					<table style="margin-top: 25px;">
    						<tr>
    							<td class="td_left">
    								<label for="username">用户名</label>
    							</td>
    							<td class="td_right">
    								<input type="text" id="username" name="username" placeholder="请输入账号">
    							</td>
    						</tr>
    						<tr>
    							<td class="td_left">
    								<label for="password">密码</label>
    							</td>
    							<td class="td_right">
    								<input type="text" id="password" name="password" placeholder="请输入密码">
    							</td>
    						</tr>
    						<tr>
    							<td class="td_left">
    								<label for="email">Email</label>
    							</td>
    							<td class="td_right">
    								<input type="text" id="email" name="email" placeholder="请输入Email">
    							</td>
    						</tr>
    						<tr>
    							<td class="td_left">
    								<label for="name">姓名</label>
    							</td>
    							<td class="td_right">
    								<input type="text" id="name" name="name" placeholder="请输入真实姓名">
    							</td>
    						</tr>
    						<tr>
    							<td class="td_left">
    								<label for="telephone">手机号</label>
    							</td>
    							<td class="td_right">
    								<input type="text" id="telephone" name="phone" placeholder="请输入您的手机号">
    							</td>
    						</tr>
    						<tr>
    							<td class="td_left">
    								<label for="sex">性别</label>
    							</td>
    							<td class="td_right gender">
    								<input type="radio" id="sex" name="gender" value="男" checked> 男
    								<input type="radio" name="gender" value="女"> 女
    							</td>
    						</tr>

    						<%--<tr>--%>
    							<%--<td class="td_left">--%>
    								<%--<label for="check">验证码</label>--%>
    							<%--</td>--%>
    							<%--<td class="td_right check">--%>
    								<%--<input type="text" id="check" name="check" class="check">--%>
    								<%--<img src="checkCode" height="32px" alt="" onclick="changeCheckCode(this)">--%>
									<%--<script type="text/javascript">--%>
										<%--function changeCheckCode(img) {--%>
											<%--img.src="checkCode?"+new Date().getTime();--%>
                                        <%--}--%>
									<%--</script>--%>
    							<%--</td>--%>
    						<%--</tr>--%>
    						<tr>
    							<td class="td_left"> 
    							</td>
    							<td class="td_right check"> 
    								<input type="submit" class="submit" value="注册" style="background-color: #76d8c2">
									<span id="msg" style="color: red;"></span>
    							</td>
    						</tr>
    					</table>
    				</form>
    			</div>
    			<div class="rg_form_right">
    				<p>
    					已有账号？
    					<a href="${pageContext.request.contextPath}/user/login.do">立即登录</a>
    				</p>
    			</div>
    		</div>
    	</div>
    <!--引入尾部-->
    <div id="footer"></div>
    <!--导入布局js，共享header和footer-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/Scripts/include.js"></script>
    </body>
</html>