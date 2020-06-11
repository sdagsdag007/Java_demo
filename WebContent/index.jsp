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
<link rel="stylesheet" type="text/css" href="css/index.css">
<link rel="stylesheet" type="text/css" href="font/iconfont.css">
<title>吃了么滴滴 (oﾟvﾟ)ノ~外卖，我呀！</title>
</head>

<body>
	<div class="container">
		<%@include file="/header.jsp"%>
		<!-- 二级标题 -->
		<div class="head_sec">
			<div class="head_sec_show_Text_Top">
				<div class="head_sec_show_Text_Top_leftContent">
					<img src="img/type.png">
					<p>专题专区</p>
				</div>
			</div>
			<div class="head_sec_show_Recommend">
				<ul>
					<li class="head_sec_show_Recommend_FlashDeal"><a href="#">
							<img src="img/flashdeal.png"> <span>限时抢购</span>
					</a></li>
					<li class="head_sec_show_Recommend_TodaySales"><a href="#">
							<img src="img/todaysales.png"> <span>今日特价</span>
					</a></li>
					<li class="head_sec_show_Recommend_Quality"><a href="#">
							品质保证 </a></li>
					<li class="head_sec_show_Recommend_Quality"><a href="#">
							全部菜品 </a></li>
					<li class="head_sec_show_Recommend_Item"><a href="#"> 社区 </a>
					</li>
					<li class="head_sec_show_Recommend_Ad"><a href="#"> <img
							src="img/ad.png"> <span>广告招商</span>
					</a>
					</li>
				</ul>
			</div>
		</div>
		<!-- 主干区域 -->
		<div class="show">
			<div class="show_Text">
				<ul>
					<li><a href="#"> <span>菜谱大全</span> <i
							class="iconfont icon-icon1"></i>
					</a></li>
					<li><a href="#"> <span>食材大全</span> <i
							class="iconfont icon-icon1"></i>
					</a></li>
					<li><a href="#"> <span>饮食健康</span> <i
							class="iconfont icon-icon1"></i>
					</a></li>
					<li><a href="#"> <span>时令热食</span> <i
							class="iconfont icon-icon1"></i>
					</a></li>
					<li><a href="#"> <span>健康作息</span> <i
							class="iconfont icon-icon1"></i>
					</a></li>
				</ul>
			</div>

			<!-- 轮播图 -->
			<div class="showPicture">

				<ul class="list">
					<li class="item active"><img src="img/lbImg/3.jpg"></li>
					<li class="item"><img src="img/lbImg/2.jpg"></li>
					<li class="item"><img src="img/lbImg/1.jpeg"></li>
					<li class="item"><img src="img/lbImg/4.jpg"></li>
				</ul>

				<ul class="pointlist">
					<li class="point active" data-index="0"></li>
					<li class="point" data-index="1"></li>
					<li class="point" data-index="2"></li>
					<li class="point" data-index="3"></li>
				</ul>
			</div>
		</div>
		<!-- 排行&今日推荐&发现好货-->
		<div class="show_SecondContent">
			<!-- -----------------------------------------------------------排行------------------------------------------- -->
			<div class="show_SecondContent_Rank">
				<!-- 排行榜标题 -->
				<div class="show_SecondContent_RankTitle">
					<div class="show_SecondContent_RankTitle_Left">
						<p>排行榜</p>
						<img src="img/more.png">
					</div>
					<div class="show_SecondContent_RankTitle_Text">
						<span>专属你的购物指南</span>
					</div>
				</div>
				<!-- 排行导航 -->
				<div class="show_SecondContent_RankNav">
					<ul>
						<li><a href="#" class="caipindaohang" id="jiachang_nav"
							style="color: #f66495;">家常</a></li>
						<li><a href="#" class="caipindaohang" id="liangcai_nav">凉菜</a></li>
						<li><a href="#" class="caipindaohang" id="zhushi_nav">主食</a></li>
						<li><a href="#" class="caipindaohang" id="yinpin_nav">饮品</a></li>
					</ul>
				</div>
				<!-- 排行内容 -->
				<!-- 家常 -->
				<div class="show_SecondContent_RankContent" id="jiachang">
					<!-- 图片 -->
					<div class="show_SecondContent_RankContent_Img">
						<c:forEach items="${jiaChangRank}" var="i">
							<div class="show_SecondContent_RankContent_ImgContent">
								<img src="${i.picture}" width="90px" height="71px">
							</div>
						</c:forEach>
					</div>
					<!-- 排行数字 -->
					<div class="show_SecondContent_RankContent_Rank">
						<p class="show_SecondContent_RankContent_RankText"
							style="color: #f66495">1</p>
						<p class="show_SecondContent_RankContent_RankText"
							style="color: red">2</p>
						<p class="show_SecondContent_RankContent_RankText"
							style="color: #059ae7">3</p>
					</div>
					<!-- 商品内容 -->
					<div class="show_SecondContent_RankContent_RankContent">
						<c:forEach items="${jiaChangRank}" var="i">
							<p href="#">
								${i.foodName}&nbsp
								<c:choose>
									<c:when test="${fn:length(i.feature) > 10}">
										<c:out value="${fn:substring(i.feature, 0, 16)}..." />
									</c:when>
									<c:otherwise>
										<c:out value="${i.feature}" />
									</c:otherwise>
								</c:choose>
							</p>
						</c:forEach>
					</div>
				</div>

				<!-- 凉菜 -->
				<div class="show_SecondContent_RankContent" id="liangcai"
					style="display: none;">
					<!-- 图片 -->
					<div class="show_SecondContent_RankContent_Img">
						<c:forEach items="${liangCaiRank}" var="i">
							<div class="show_SecondContent_RankContent_ImgContent">
								<img src="${i.picture}" width="90px" height="71px">
							</div>
						</c:forEach>
					</div>
					<!-- 排行数字 -->
					<div class="show_SecondContent_RankContent_Rank">
						<p class="show_SecondContent_RankContent_RankText"
							style="color: #f66495">1</p>
						<p class="show_SecondContent_RankContent_RankText"
							style="color: red">2</p>
						<p class="show_SecondContent_RankContent_RankText"
							style="color: #059ae7">3</p>
					</div>
					<!-- 商品内容 -->
					<div class="show_SecondContent_RankContent_RankContent">
						<c:forEach items="${liangCaiRank}" var="i">
							<p>
								${i.foodName}&nbsp
								<c:choose>
									<c:when test="${fn:length(i.feature) > 10}">
										<c:out value="${fn:substring(i.feature, 0, 14)}..." />
									</c:when>
									<c:otherwise>
										<c:out value="${i.feature}" />
									</c:otherwise>
								</c:choose>
							</p>
						</c:forEach>
					</div>
				</div>

				<!-- 主食 -->
				<div class="show_SecondContent_RankContent" id="zhushi"
					style="display: none;">
					<!-- 图片 -->
					<div class="show_SecondContent_RankContent_Img">
						<c:forEach items="${zhuShiRank}" var="i">
							<div class="show_SecondContent_RankContent_ImgContent">
								<img src="${i.picture}" width="90px" height="71px">
							</div>
						</c:forEach>
					</div>
					<!-- 排行数字 -->
					<div class="show_SecondContent_RankContent_Rank">
						<p class="show_SecondContent_RankContent_RankText"
							style="color: #f66495">1</p>
						<p class="show_SecondContent_RankContent_RankText"
							style="color: red">2</p>
						<p class="show_SecondContent_RankContent_RankText"
							style="color: #059ae7">3</p>
					</div>
					<!-- 商品内容 -->
					<div class="show_SecondContent_RankContent_RankContent">
						<c:forEach items="${zhuShiRank}" var="i">
							<p style="margin-top: 48px">
								${i.foodName}&nbsp
								<c:choose>
									<c:when test="${fn:length(i.feature) > 10}">
										<c:out value="${fn:substring(i.feature, 0, 14)}..." />
									</c:when>
									<c:otherwise>
										<c:out value="${i.feature}" />
									</c:otherwise>
								</c:choose>
							</p>
						</c:forEach>
					</div>
				</div>
				<!-- 饮品 -->
				<div class="show_SecondContent_RankContent" id="yinpin"
					style="display: none;">
					<!-- 图片 -->
					<div class="show_SecondContent_RankContent_Img">
						<c:forEach items="${yinPinRank}" var="i">
							<div class="show_SecondContent_RankContent_ImgContent">
								<img src="${i.picture}" width="90px" height="71px">
							</div>
						</c:forEach>
					</div>
					<!-- 排行数字 -->
					<div class="show_SecondContent_RankContent_Rank">
						<p class="show_SecondContent_RankContent_RankText"
							style="color: #f66495">1</p>
						<p class="show_SecondContent_RankContent_RankText"
							style="color: red">2</p>
						<p class="show_SecondContent_RankContent_RankText"
							style="color: #059ae7">3</p>
					</div>
					<!-- 商品内容 -->
					<div class="show_SecondContent_RankContent_RankContent">
						<c:forEach items="${yinPinRank}" var="i">
							<p style="margin-top: 48px">
								${i.foodName}&nbsp
								<c:choose>
									<c:when test="${fn:length(i.feature) > 10}">
										<c:out value="${fn:substring(i.feature, 0, 14)}..." />
									</c:when>
									<c:otherwise>
										<c:out value="${i.feature}" />
									</c:otherwise>
								</c:choose>
							</p>
						</c:forEach>
					</div>
				</div>
			</div>
			<!-- ---------------------------------------------------今日推荐------------------------------------------------------------------>
			<div class="show_SecondContent_Recommend">
				<!-- 标题 -->
				<div class="show_SecondContent_RecommendBox">
					<div class="show_SecondContent_RecommendBox_Left">
						<p>今日推荐</p>
						<img src="img/more.png">
					</div>
					<div class="show_SecondContent_RecommendBox_Text">
						<span>吃了吗为您精心甄选</span>
					</div>
					<!-- 页面一-->
					<div class="show_SecondContent_RecommendContent" id="t_PageOne">
						<div class="show_SecondContent_RecommendTitle_Img">
							<img src="img/ruixin.png">
							<h3>瑞幸咖啡，专业咖啡新鲜式</h3>
						</div>
						<p class="show_SecondContent_RecommendTitle_goodsText">瑞幸咖啡最新升级的咖啡豆在意大利米兰举办的IIAC
							2018国际咖啡品鉴大赛上，从300多个同类产品中脱颖而出，斩获金奖。</p>
						<div class="show_SecondContent_RecommendTitle_Wrap"></div>
					</div>
					<!-- 页面二 -->
					<div class="show_SecondContent_RecommendContent" id="t_PageTwo"
						style="display: none">
						<div class="show_SecondContent_RecommendTitle_Img">
							<img src="img/haidilao.jpg">
							<h3>海底捞，做火锅我们是认真的</h3>
						</div>
						<p class="show_SecondContent_RecommendTitle_goodsText">
						海底捞始终坚持“无公害，一次性”的选料和底料原则。成功的打造出信誉度高，颇具四川火锅特色的火锅品牌。
						</p>
						<div class="show_SecondContent_RecommendTitle_Wrap"></div>
					</div>
					<!-- 页面三 -->
					<div class="show_SecondContent_RecommendContent" id="t_PageThree"
						style="display: none">
						<div class="show_SecondContent_RecommendTitle_Img">
							<img src="img/dapaidang.jpg">
							<h3>南京大排档，独特的金陵菜系</h3>
						</div>
						<p class="show_SecondContent_RecommendTitle_goodsText">大牌档有20余间各款江南小阁、随处可见的楹联灯幌，充溢着中华传统民俗风情，气韵古雅，再现清末民初茶楼酒肆之旧貌。	</p>
						<div class="show_SecondContent_RecommendTitle_Wrap"></div>
					</div>
					<!-- 控制按钮 -->
					<button class="show_SecondContent_RecommendTitle_Control show_SecondContent_RecommendTitle_ControlActive Today_Control" id="btnOne"></button>
					<button class="show_SecondContent_RecommendTitle_Control Today_Control" id="btnTwo"></button>
					<button class="show_SecondContent_RecommendTitle_Control Today_Control" id="btnThree"></button>
				</div>
			</div>
			<!-- -------------------------------------------发现好货------------------------------------------------------------------------->
			<div class="show_SecondContent_GoodGoods">
				<!-- 标题 -->
				<div class="show_SecondContent_RecommendBox">
					<div class="show_SecondContent_RecommendBox_Left">
						<p>发现好货</p>
						<img src="img/more.png">
					</div>
					<div class="show_SecondContent_RecommendBox_Text">
						<span>给您更好的生活品质</span>
					</div>
					<div class="show_SecondContent_GoodGoodsContent One">
						<a href="#" style="color: black">
							<div class="show_SecondContent_GoodGoodsContent_Main One">
								<img class="show_SecondContent_GoodGoodsContent_Img" src="img/zhushi/10.jpg" width="130px" height="100px">
								<p class="show_SecondContent_GoodGoodsContent_Title">驴打滚</p>
								<p class="show_SecondContent_GoodGoodsContent_Text">糯米粉100克...</p>
							</div>
						</a> 
						<a href="#" style="color: black">
							<div class="show_SecondContent_GoodGoodsContent_Main Two">
								<img class="show_SecondContent_GoodGoodsContent_Img" src="img/zhushi/4.jpeg" width="130px" height="100px">
								<p class="show_SecondContent_GoodGoodsContent_Title">皮蛋粥</p>
								<p class="show_SecondContent_GoodGoodsContent_Text">口味：清香味。</p>
							</div>
						</a> 
						<a href="#" style="color: black">
							<div class="show_SecondContent_GoodGoodsContent_Main Three">
								<img class="show_SecondContent_GoodGoodsContent_Img" src="img/yinpin/2.jpg" width="130px" height="100px">
								<p class="show_SecondContent_GoodGoodsContent_Title">抹茶慕司</p>
								<p class="show_SecondContent_GoodGoodsContent_Text">暂无</p>
							</div>
						</a> 
						<a href="#" style="color: black">
							<div class="show_SecondContent_GoodGoodsContent_Main Four">
								<img class="show_SecondContent_GoodGoodsContent_Img" src="img/zhushi/7.jpg" width="130px" height="100px">
								<p class="show_SecondContent_GoodGoodsContent_Title">猫耳朵</p>
								<p class="show_SecondContent_GoodGoodsContent_Text">面粉.鸡蛋,..</p>
							</div>
						</a> 
					</div>
				</div>

			</div>
		</div>

		<!-- 菜品展示区域 -->
		<div class="food_show_area">
			<!-- 家常 -->
			<div class="food_show_title">
				<div class="food_show_titleLeft">
					<img src="img/index/jiachang.png">
					<p>家常</p>
				</div>
				<div class="food_show_titleRight">
					<p>给你家乡的味道！</p>
				</div>
				<div class="food_show_titleRight_Recommend">
					<a href="foodTypeShow.active?food_type=${jiaChang[0].type}" class="food_show_titleRight_Recommend_More">更多></a>
				</div>
			</div>
			<div class="food_show_main">
				<ul>
					<c:forEach items="${jiaChang}" var="i">
						<li><a href="foodDetail.active?food_id=${i.id}"> <img src="${i.picture}">
								<p>${i.foodName }</p>
								<p style="font-size: 12px">
									<span>收藏 588</span> 评价 48
								</p>
								<p style="font-size: 18px">
									¥${i.price }<span
										style="float: right; font-size: 12px; padding-top: 6px;">销量${i.hits}</span>
								</p>
						</a></li>
					</c:forEach>
				</ul>
			</div>
			<!-- 凉菜 -->
			<div class="food_show_title">
				<div class="food_show_titleLeft">
					<img src="img/index/liangcai.png">
					<p>凉菜</p>
				</div>
				<div class="food_show_titleRight">
					<p>给你家乡的味道！</p>
				</div>
				<div class="food_show_titleRight_Recommend">
					<a href="foodTypeShow.active?food_type=${liangCai[0].type}" class="food_show_titleRight_Recommend_More">更多></a>
				</div>
			</div>
			<div class="food_show_main">
				<ul>
					<c:forEach items="${liangCai}" var="i">
						<li><a href="foodDetail.active?food_id=${i.id}"> <img src="${i.picture}">
								<p>${i.foodName }</p>
								<p style="font-size: 12px">
									<span>收藏 588</span> 评价 48
								</p>
								<p style="font-size: 18px">
									¥${i.price}<span
										style="float: right; font-size: 12px; padding-top: 6px;">销量${i.hits}</span>
								</p>
						</a></li>
					</c:forEach>
				</ul>
			</div>
			<!--广告  -->
			 <div class="advertisment">
                <a href="${adverTisement.adLink}">
                    <img src="${adverTisement.adImg}">
                </a>
            </div>
			<!-- 主食 -->
			<div class="food_show_title">
				<div class="food_show_titleLeft">
					<img src="img/index/zhushi.png">
					<p>主食</p>
				</div>
				<div class="food_show_titleRight">
					<p>给你家乡的味道！</p>
				</div>
				<div class="food_show_titleRight_Recommend">
					<a href="foodTypeShow.active?food_type=${zhuShi[0].type}" class="food_show_titleRight_Recommend_More">更多></a>
				</div>
			</div>
			<div class="food_show_main">
				<ul>
					<c:forEach items="${zhuShi}" var="i">
						<li><a href="foodDetail.active?food_id=${i.id}"> 
						<img src="${i.picture}">
						<p>${i.foodName }</p>
						<p style="font-size: 12px"><span>收藏 588</span> 评价 48</p>
						<p style="font-size: 18px">¥${i.price}<span style="float: right; font-size: 12px; padding-top: 6px;">销量${i.hits}</span></p>
						</a>
						</li>				
					</c:forEach>
				</ul>
			</div>
			<!-- 饮品 -->
			<div class="food_show_title">
				<div class="food_show_titleLeft">
					<img src="img/index/yinpin.png">
					<p>饮品</p>
				</div>
				<div class="food_show_titleRight">
					<p>给你家乡的味道！</p>
				</div>
				<div class="food_show_titleRight_Recommend">
					<a href="foodTypeShow.active?food_type=${yinPin[0].type}" class="food_show_titleRight_Recommend_More">更多></a>
				</div>
			</div>
			<div class="food_show_main">
				<ul>
					<c:forEach items="${yinPin}" var="i">
						<li><a href="foodDetail.active?food_id=${i.id}"> <img src="${i.picture}">
								<p>${i.foodName }</p>
								<p style="font-size: 12px">
									<span>收藏 588</span> 评价 48
								</p>
								<p style="font-size: 18px">
									¥${i.price}<span
										style="float: right; font-size: 12px; padding-top: 6px;">销量${i.hits}</span>
								</p>
						</a></li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<%@include file="/footer.jsp"%>
	</div>
	<script src="js/index.js"></script>
</body>

</html>