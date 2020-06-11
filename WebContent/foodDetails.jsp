<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="icon" type="img/x-icon" href="img/logo.ico">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/core.css">
    <title>吃了么滴滴-点餐</title>
</head>

<body>
    <div class="container">
		<%@include file="/header.jsp" %>
        <!-- 插图 -->
        <div class="neck">
            <div class="neck_content">
                <img src="img/neck.jpg">
            </div>
        </div>
        <!-- 主干区域 -->
        <div class="foodMsgPage_Area">
            <div class="foodMsgPage_Main">
                <h1 class="foodMsgPage_Title">
                    ${foodDetail.food.foodName }
                </h1>
                <div class="foodMsgPage_PricePromotion">
                    <dl class="foodMsgPage_PricePanel">
                        <dt class="foodMsgPage_PriceDescribe">价格</dt>
                        <dd>
                            <em class="foodMsgPage_PriceYuanBefore">¥</em>
                            <span class="foodMsgPage_PriceBefore">${foodDetail.food.price}</span>
                        </dd>
                    </dl>
                    <dl class="foodMsgPage_PricePanel" style="padding-bottom:0px">
                        <dt class="foodMsgPage_PriceDescribe">促销价</dt>
                        <dd>
                            <em class="foodMsgPage_PriceYuanNow">¥</em>
                            <span class="foodMsgPage_PriceNow">12</span>
                        </dd>
                    </dl>
                    <dl class="foodMsgPage_PricePanel">
                        <dt class="foodMsgPage_PriceDescribe">本店活动</dt>
                        <dd>
                            <span class="foodMsgPage_PriceActive">满20元，免配送费</span>
                        </dd>
                    </dl>
                </div>
                <div class="foodMsgPage_Img">
                    <img src="${foodDetail.food.picture}">
                </div>
                <div class="foodMsgPage_Item">
                    <span class="foodMsgPage_ItemLeft">热度:</span>
                    <span>${foodDetail.food.hits}次</span>
                </div>
                <div class="foodMsgPage_Item">
                    <span class="foodMsgPage_ItemLeft">类型:</span>
                    <span>${foodDetail.typeName}</span>
                </div>
                <div class="foodMsgPage_Item">
                    <span class="foodMsgPage_ItemLeft">特色:</span>
                    <span>${foodDetail.food.feature}</span>
                </div>
                <div class="foodMsgPage_Item">
                    <span class="foodMsgPage_ItemLeft">原料：</span>
                    <span>${foodDetail.food.material}</span>
                </div>
                <div class="foodMsgPage_Item">
                    <span class="foodMsgPage_ItemLeft">备注:</span>
                   	<c:choose>
                    <c:when test="${foodDetail.food.comment==0 }">
					<span>厨师推荐</span>
					</c:when>
					<c:when test="${foodDetail.food.comment==-1}">
					<span>非特价菜</span>
					</c:when>
					<c:otherwise>
					<span>特价菜</span>
					</c:otherwise>
                    </c:choose>
                </div>
                <div class="foodMsgPage_ButtonArea">
                    <form action="buyFood.active" method="post" class="foodMsgPage_ShopNow">
                    	<input type="hidden" name="food_id" value="${foodDetail.food.id}">
                        <input type="submit" value="立即点餐">
                    </form>
                    <form action="" method="post" class="foodMsgPage_ShopCar">
                        <input type="submit" value="加入点餐车">
                    </form>
                </div>

            </div>
        </div>
		<%@include file="/footer.jsp" %>
	</div>
	<script src="js/index.js"></script>
</body>

</html>