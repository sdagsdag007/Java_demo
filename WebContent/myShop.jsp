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
<title>吃了么滴滴-我的点餐车</title>
</head>

<body>
	<div class="container">
		<%@include file="/header.jsp" %>
		<!-- 网站标题+搜索框 -->
		<div class="foodCarPage_mainHead">
			<div class="foodCarPage_mainHeadTitle">
				<h1>吃了么滴滴(oﾟvﾟ)ノ</h1>
				<h4>Chilemodidi.com</h4>
			</div>
			<form action="memberSearch.action" method="post" class="foodCarPage_mainHeadSearch">
				<div>
					<input type="search" name="searchContent" class="foodCarPage_mainHeadSearchLeft">
				</div>
				<input type="submit" value="搜索" class="foodCarPage_mainHeadSearchRight">
			</form>
		</div>

		<!-- 主要内容 -->
		<div class="foodCarPage_main">
			<div class="foodCarPage_mainFirTitle">
				<ul class="foodCarPage_mainFirTitleList">
					<li
						class="foodCarPage_mainFirTitleItem foodCarPage_mainFirTitleItemActive"
						style="margin-left: 5px;"><a href="allFood.active"
						style="color: #3c3c3c;">全部菜品</a></li>
					<li class="foodCarPage_mainFirTitleItem" data-index="1"><a
						href="myShop.html" style="color: #f25d8e;">已购菜品</a></li>
				</ul>
			</div>
			<div class="foodCarPage_Wrap_line">
				<div class="foodCarPage_Wrap_control_sec"></div>
			</div>
			<div class="foodCarPage_CommodityIntroduce">
				<div class="foodCarPage_CommodityCheck">
					<input type="checkbox" name="foods_id">
					<p>全选</p>
				</div>
				<div class="foodCarPage_CommodityOption">
					<ul>
						<li class="foodCarPage_CommoditMsg_sec">商品信息</li>
						<li class="foodCarPage_CommoditMsg_type">类型</li>
						<li class="foodCarPage_CommoditMsg_feature">特色</li>
						<li class="foodCarPage_CommoditMsg_price">金额</li>
						<li class="foodCarPage_CommoditMsg_operation">操作</li>
					</ul>
				</div>
			</div>
			<c:forEach items="${cartDetail}" var="i">
			<div class="foodCarPage_CommodityParticulars ">
				<div class="foodCarPage_CommodityParticulars_check">
					<form>
						<input type="checkbox" name="${i.food.id }">
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
						<span>¥</span>${i.food.price}
					</p>
				</div>
				<div class="foodCarPage_CommodityParticulars_control">
					<a href="deleteFood.active?food_id=${i.food.id}" style="color:black;">删除</a>
				</div>
			</div>
			</c:forEach>
			
			<div class="foodCarPage_CommodityAccount">
				<div class="foodCarPage_CommodityAccount_Check">
					<input type="checkbox">
					<p>全选</p>
				</div>
				<div class="foodCarPage_CommodityAccount_mid">
					<a href="#">删除</a> <a href="#">分析</a>
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
		<%@include file="/footer.jsp" %>
	</div>
	<!-- 外部链接js -->
	<script src="js/index.js"></script>
</body>

</html>