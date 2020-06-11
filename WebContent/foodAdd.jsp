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
<title>吃了么滴滴-菜品添加</title>
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
						<li><a href="memberMsgAdmin.action">滴友管理</a></li>
						<li><a href="foodAdmin.active">菜品管理</a></li>
						<li class="myMsgPage_wrapMain_NavActive"><a href="foodAdd.jsp">菜品添加</a></li>
						<li ><a href="adAdmin.action">广告管理</a></li><%}%>
						<li><a href="#">我的道具</a></li>
						<li><a href="#">兑换中心</a></li>
						<li><a href="#">我的优惠卷</a></li>
					</ul>
				</div>
				<div class="myMsgPage_wrapMain_Content">
					<div class="myMsgPage_wrapMain_ContentWrap">
						<p>菜品添加</p>
					</div>
					<div class="myMsgPage_wrapMain_ContentAlter">
						<form action="foodMsgAdd.active" method="post">
                        		 菜名:<input type="text" name="food_name" class="myMsgPage_wrapMain_ContentAlter_Item" style="margin-left: 37px;"><br>
                           		 特色:<input type="text" name="food_feature" class="myMsgPage_wrapMain_ContentAlter_Item" style="margin-left: 37px;"><br>
                           		 材料：<input type="text" name="food_material" class="myMsgPage_wrapMain_ContentAlter_Item"  style="margin-left: 28px;"><br>
                           		 价格:<input type="text" name="food_price" class="myMsgPage_wrapMain_ContentAlter_Item" style="margin-left: 37px;"> <br>
                           		 类型:<input type="text" name="food_type" class="myMsgPage_wrapMain_ContentAlter_Item" style="margin-left: 37px;"> <br>
                           		 照片:<input type="text" name="food_picture" class="myMsgPage_wrapMain_ContentAlter_Item" style="margin-left: 37px;"> <br>
                        	         热度:<input type="text" name="food_hits" class="myMsgPage_wrapMain_ContentAlter_Item" style="margin-left: 37px;"> <br>
                            	<input type="submit" value="添加" class="myMsgPage_wrapMain_ContentAlter_Btn">
                        </form>
					</div>
				</div>
			</div>
		</div>
		<%@include file="footer.jsp" %>
	</div>
</body>

</html>