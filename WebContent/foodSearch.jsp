<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="icon" type="img/x-icon" href="img/logo.ico">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/core.css">
<title>吃了吗滴滴-搜索结果</title>
</head>

<body>
	<div class="container">
		<%@include file="header.jsp"%>
		<!-- 网站标题+搜索框 -->
		<div class="foodCarPage_mainHead">
			<div class="foodCarPage_mainHeadTitle">
				<h1>吃了么滴滴(oﾟvﾟ)ノ</h1>
				<h4>Chilemodidi.com</h4>
			</div>
			<form class="foodCarPage_mainHeadSearch">
				<div>
					<input type="search" name="search"
						class="foodCarPage_mainHeadSearchLeft">
				</div>
				<input type="button" value="搜索"
					class="foodCarPage_mainHeadSearchRight">
			</form>
		</div>
		<!-- 主要内容 -->
		<div class="foodCarPage_main">
			<div class="foodCarPage_CommodityIntroduce">
				<div class="foodCarPage_CommodityOption" style="margin-left: 45px;">
					<ul>
						<li class="foodCarPage_CommoditMsg_sec">商品信息</li>
						<li class="foodCarPage_CommoditMsg_type">类型</li>
						<li class="foodCarPage_CommoditMsg_feature">特色</li>
						<li class="foodCarPage_CommoditMsg_price">金额</li>
						<li class="foodCarPage_CommoditMsg_operation">操作</li>
					</ul>
				</div>
			</div>
			<c:forEach items="${searchList}" var="i">
				<div class="foodCarPage_CommodityParticulars ">
					<div class="foodCarPage_CommodityParticulars_check">
						<form>
							<input type="checkbox" name="food_id">
						</form>
					</div>
					<div class="foodCarPage_CommodityParticulars_img ">
						<img src="${i.food.picture}">
					</div>
					<div class="foodCarPage_CommodityParticulars_name">
						<p>${i.food.foodName}</p>
					</div>
					<div class="foodCarPage_CommodityParticulars_material">
						<p>${i.food.material}</p>
					</div>
					<div class="foodCarPage_CommodityParticulars_typeName">
						<p>${i.typeName}</p>
					</div>
					<div class="foodCarPage_CommodityParticulars_feature">
						<p>${i.food.feature}</p>
					</div>
					<div class="foodCarPage_CommodityParticulars_price">
						<p>
							<span>¥</span>${i.food.price}</p>
					</div>
					<div class="foodCarPage_CommodityParticulars_control">
						<a href="buyFood.active?food_id=${i.food.id }" style="color: black">添加</a>
					</div>
				</div>
			</c:forEach>

			<div class="foodCarPage_CommodityAccount">
				<div class="foodCarPage_CommodityAccount_Check">
					<input type="checkbox">
					<p>全选</p>
				</div>
				<div class="foodCarPage_CommodityAccount_mid">
					<a href="#">加入到点餐车</a> <a href="#">删除</a> <a href="#">分析</a>
				</div>
				<div class="foodCarPage_CommodityAccount_right">
					<p>
						已选商品<span>0</span>件
					</p>
					<p>
						合计(不含配送费)：<span>0.00</span>
					</p>
					<button type="button">结算</button>
				</div>
			</div>
		</div>
		<%@include file="footer.jsp" %>
	</div>
	<!-- 外部链接js -->
	<script src="js/index.js"></script>
</body>

</html>