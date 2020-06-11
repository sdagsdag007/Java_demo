<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<script type="text/javascript">
function delUser(){
	alert("删除成功");	
}
</script>
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
						<li class="myMsgPage_wrapMain_NavActive"><a href="memberMsgAdmin.action">滴友管理</a></li>
						<li><a href="foodAdmin.active">菜品管理</a></li>
						<li><a href="foodAdd.jsp">菜品添加</a></li>
						<li><a href="adAdmin.action">广告管理</a></li><%}%>
						<li><a href="#">我的道具</a></li>
						<li><a href="#">兑换中心</a></li>
						<li><a href="#">我的优惠卷</a></li>
					</ul>
				</div>
				<div class="myMsgPage_wrapMain_Content">
					<div class="myMsgPage_wrapMain_ContentWrap">
						<p>滴友管理</p>
					</div>
					<table class="memberAdmin_Table">
						<tr>
							<th>id</th>
							<th>用户名</th>
							<th>密码</th>
							<th>权限</th>
							<th>电话号</th>
							<th>地址</th>
							<th>操作</th>
						</tr>
						<c:forEach items="${memberMsgAdmin}" var="i">
						<tr>
							<td>${i.id}</td>
							<td>${i.userName}</td>
							<td>${i.password}</td>
							<c:choose>
                            <c:when test="${i.ident==1}">
                            <td>管理员</td>
                            </c:when>
                            <c:when test="${i.ident==0}">
                            <td>普通成员</td>
                            </c:when>
                            </c:choose>
							<td>${i.telephone}</td>
							<td>${i.address}</td>
							<td><a href="memberMsgSelect.action?user_id=${i.id}">修改/</a> <a onclick="delUser()" href="memberDelete.action?user_id=${i.id}">删除</a></td>
						</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
		<%@include file="footer.jsp" %>
	</div>
	<script src="js/index.js"></script>
</body>

</html>