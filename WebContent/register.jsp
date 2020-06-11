<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 声明这是一个H5文档 -->
<!DOCTYPE html>
<html lang="en">

<head>
<!-- meta声明 -->
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta name="author" content="CompletBTree">
<!-- 标题图标 -->
<link rel="icon" type="img/x-icon" href="img/logo.ico">
<!-- 链接css -->
<link rel="stylesheet" type="text/css" href="css/style.css">
<!-- 链接js -->
<script type="text/javascript" src="js/register.js"></script>
<!-- 标题 -->
<title>吃了么滴滴 (oﾟvﾟ)ノ-注册</title>

<!-- 声明注册Title代码域 -->
<style>
/* 重点学习，这手操作很灵性有点东西的 */
.rgister_Title {
	width: 980px;
	height: 28px;
	margin: 0 auto;
	border-bottom: 1px solid #ddd;
	margin-bottom: 28px;
	text-align: center;
}

.rgister_Title_content {
	height: 56px;
	line-height: 56px;
	margin: 0 auto;
	padding: 0 20px;
	font-size: 40px;
	background-color: #fff;
	text-align: center;
}
</style>
</head>

<body onload="">
	<!-- action规定当提交表单时向何处发送表单数据 -->
	<!-- method规定用于发送表单数据的 HTTP 方法。 -->
	<div classs="container">
		<!-- 导航 -->
	  <%@include file="/header.jsp" %>

		<!-- 插图 -->
		<div class="neck">
			<div class="neck_content">
				<img src="img/neck.jpg">
			</div>
		</div>

		<!-- 注册Title -->
		<div class="rgister_Title">
			<span class="rgister_Title_content" style="font-size: 38px">注册</span>
		</div>

		<!-- 注册页主体 -->
		<div class="body">
			<div class="register_container">
				<form action="register.action" method="get">
					<!-- onblur当鼠标失去焦点时 -->
					<input type="text" name="user_name" placeholder="用户名"
						class="register_input" onblur=""><br> <input
						type="password" name="user_pwd" placeholder="密码(6-16个字符，区分大小写)"
						class="register_input" onblur=""><br> <input
						type="password" name="user_pwd_real" placeholder="确认密码"
						class="register_input" onblur=""><br> <input
						type="text" name="user_phone" placeholder="填写常用手机号"
						class="register_input" onblur=""><br> <label
						class="register_agree"> 
						<label class="register_agree_checkbox"> <input type="checkbox" name="rule" checked="checked"></label>
						<div class="register_agree_test">我已同意吃了么<a href="#">《吃了么用户使用协议》</a>和<a href="#">《吃了么账号中心规范》</a></div> <br>
					</label> <input type="submit" value="注册" class="register_input"
						style="background-color: #7dd5f0; color: #fff;">
				</form>
				<a href="login.html" class="register_login">已有账号直接账登录></a>
			</div>
		</div>

		<%@include file="/footer.jsp" %>>
	</div>
</body>

</html>