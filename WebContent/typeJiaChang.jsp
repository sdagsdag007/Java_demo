<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>吃了么滴滴-家常</title>
<link rel="icon" type="img/x-icon" href="img/logo.ico">
<link rel="stylesheet" type="text/css" href="css/index.css">
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>

<body>
	<div class="container">
		<%@include file="header.jsp"%>
		<!-- 当前位置,面包眉-->
		<div class="DetailPage_Nav">
			<div class="DetailPage_Nav_Top">
				<a href="#">首页</a> &nbsp;>&nbsp; <span>家常</span>
			</div>
			<div class="DetailPage_Nav_Bottom">
				<div class="DetailPage_Nav_Sec">
					<ul>
						<li>分类：</li>
						<li><a href="#" style="color: #f66495;"> 家常 </a></li>
						<li><a href="#"> 凉菜 </a>
						<li><a href="#"> 主食 </a></li>
						<li><a href="#"> 饮品 </a></li>
					</ul>
				</div>
				<div class="DetailPage_Nav_Thir">
					<ul>
						<li>排序：</li>
						<li><a href="#" style="color: #f66495;"> 价格 </a></li>
						<li><a href="#"> 热度 </a>
					</ul>
				</div>
			</div>
		</div>
		<div class="DetailPage_Main">
			<div class="DetailPage_Content">
				<ul>
					<c:forEach items="${foodList}" var="i">
					<a href="#">
						<li>
							<img src="${i.picture}">
							<p style="font-size: 14px; line-height: 20px; color: #666; margin-bottom: 7px;">${i.foodName }</p>
							<p style="color: #f66495; line-height: 20px; margin-bottom: 7px;">${i.price}</p>
							<div class="DetailPage_Operation">
								<div class="DetailPage_OperationBuy" style="color: #f66495;">立即购买</div>
								<div class="DetailPage_OperationHits" style="color: #666;">${i.hits}人已购买</div>
							</div>
						</li>
					</a>
					</c:forEach>
				</ul>
			</div>
		</div>
		<div style="clear: both;"></div>
		<%@include file="footer.jsp"%>
	</div>
	<script src="js/index.js"></script>
</body>

</html>