<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="icon" type="img/x-icon" href="img/logo.ico">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>吃了么滴滴-滴友管理</title>
</head>

<body>
	<div class="container">
		<%@include file="header.jsp" %>
		<div class="myMsgPage">
			<h1 style="color: #555">个人中心</h1>
			<div class="myMsgPage_wrap">
				<div class="myMsgPage_wrapControl"></div>
			</div>
			<div class="myMsgPage_wrapMain">
				<div class="myMsgPage_wrapMain_Nav">
					<ul>
						<li><a href="myMsg.jsp">我的资料</a></li>
						<li><a href="allFood.active">全部菜品</a></li>
						<li><a href="myFoodCar.active">我的订餐车</a></li>
						<%if (user.getIdent().equals("1")) {%>
						<li  class="myMsgPage_wrapMain_NavActive"><a href="memberMsgAdmin.action">滴友管理</a></li>
						<li><a href="#">菜品管理</a></li>
						<li><a href="#">菜品添加</a></li><%}%>
						<li><a href="#">消费记录</a></li>
						<li><a href="#">我的道具</a></li>
						<li><a href="#">兑换中心</a></li>
						<li><a href="#">我的优惠卷</a></li>
					</ul>
				</div>
				<div class="myMsgPage_wrapMain_Content">
					<div class="myMsgPage_wrapMain_ContentWrap">
						<p>滴友管理</p>
					</div>
					<div class="myMsgPage_wrapMain_ContentAlter">
						<form action="memberMsgAlter.action" method="post">
						    <input type="hidden" name="user_id" value="${member_msg.id}">
							用户名:<input type="text" name="user_name" class="myMsgPage_wrapMain_ContentAlter_Item" value="${member_msg.userName}" style="margin-left: 23px;"><br>
							密码:<input type="text" name="user_pwd" class="myMsgPage_wrapMain_ContentAlter_Item" value="${member_msg.password}" style="margin-left: 37px;"><br>
							电话：<input type="text" name="user_phone" class="myMsgPage_wrapMain_ContentAlter_Item" value="${member_msg.telephone}" style="margin-left: 27px;"><br>
							送餐地址:<input type="text" name="user_address" 	class="myMsgPage_wrapMain_ContentAlter_Item" value="${member_msg.address}"> <br>	
							<input type="submit" value="保存" class="myMsgPage_wrapMain_ContentAlter_Btn">		
						</form>
					</div>
				</div>
			</div>
		</div>
		<%@include file="footer.jsp" %>
	</div>
</body>

</html>