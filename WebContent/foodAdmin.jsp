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
<title>吃了么滴滴-滴友管理</title>
<style>
th {
	border: 1px solid black;
}

td {
	text-align: center;
	border: 1px solid black;
}

tr:nth-child(odd) {
	background-color: pink;
	color: white;
}
</style>
<script>
function deleteFood(){
	alert("删除成功");
}
</script>
</head>

<body>
	<div class="container">
		<%@include file="/header.jsp" %>
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
						<li class="myMsgPage_wrapMain_NavActive"><a href="foodAdmin.active">菜品管理</a></li>
						<li><a href="foodAdd.jsp">菜品添加</a></li>
						<li ><a href="adAdmin.action">广告管理</a></li><%}%>
						<li><a href="#">我的道具</a></li>
						<li><a href="#">兑换中心</a></li>
						<li><a href="#">我的优惠卷</a></li>
					</ul>
				</div>
				<div class="myMsgPage_wrapMain_Content">
					<div class="myMsgPage_wrapMain_ContentWrap">
						<p>菜品管理</p>
					</div>
					<table class="memberAdmin_Table">
						<tr>
							<th>id</th>
							<th>菜品</th>
							<th>特色</th>
							<th>材料</th>
							<th>售价</th>
							<th>类型</th>
							<th>热度</th>
							<th>操作</th>
						</tr>
						<c:forEach items="${foodList}" var="i">
						<tr>
							<td style="width: 50px">${i.food.id}</td>
							<td style="width: 50px">${i.food.foodName}</td>
							<td style="width: 200px">${i.food.feature}</td>
							<td style="width: 200px">${i.food.material}</td>
							<td style="width: 50px">${i.food.price}</td>
							<td style="width: 50px">${i.typeName}</td>
							<td style="width: 50px">${i.food.hits}</td>
							<td style="width: 50px"><a href="foodMsg.active?food_id=${i.food.id}">修改&nbsp</a> <a onclick="deleteFood()"href="foodMsgDelete.active?food_id=${i.food.id}">删除</a>
							</td>
						</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
		<%@include file="/footer.jsp" %>
	</div>
	<script src="js/index.js"></script>
</body>

</html>