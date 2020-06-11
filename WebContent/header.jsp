<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="com.neusoft.pojo.User"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
 <!-- 导航栏 -->
<%
//获取用户数据
User user = (User) request.getSession().getAttribute("user");
String user_name = "";
String temp_user_name = null;
String url1 = "login.jsp";
String url2="#";
if (user != null) {
	user_name=user.getUserName();
	temp_user_name = user_name;
	url1 = "";
	url2 = "myMsg.jsp";
	int length = user_name.length();
	if (length > 7) {
		temp_user_name = user_name.subSequence(0, 3) + "...";
	} else {
		temp_user_name = user_name;
	}
} else {
	temp_user_name = "请登录";
}
%>
        <div class="head">
            <div class="head_main">
                <div class="head_main_leftNav">
                    <ul class="head_main_list">
                        <li class="head_main_itemHome">
                            <a href="Index" style="color: black"><img src="img/logo2.png" style="float:left"><span style="float: right">首页</span></a>
                        </li>
                        <li class="head_main_itemNormalFood">
                            <a href="foodTypeShow.active?sort=1&food_type=1" style="color: black">家常菜</a>
                        </li>
                        <li class="head_main_itemColdFood">
                            <a href="foodTypeShow.active?food_type=2" style="color: black">凉菜</a>
                        </li>
                        <li class="head_main_itemFood">
                            <a href="foodTypeShow.active?food_type=3" style="color: black">主食</a>
                        </li>
                        <li class="head_main_itemDrink">
                            <a href="foodTypeShow.active?food_type=4" style="color: black">饮品</a>
                        </li>
                        <li class="head_main_itemVipShoop">
                            <a href="#" style="color: black">会员购</a>
                        </li>
                        <li class="head_main_itemDonloadApp">
                            <a href="#" style="color: black"><img src="img/mobel.png" style="float: left"><span style="float:right">下载APP</span></a>
                        </li>
                    </ul>
                </div>
                <div class="head_main_centerSearh">
                    <form action="memberSearch.action" method="get" style="padding-top: 13px;">
                        <input type="search" name="searchContent" placeholder="凉拌藕片" class="head_main_search">
                        <button type="submit" class="head_main_searchBtn"><img src="img/seach_btn.png"></button>
                    </form>
                </div>
                <div class="head_main_rightLogin">
                    <ul class="head_main_rightList">
                        <li class="head_main_ietmLogin">
                            <a href="<%=url1%>" title="<%=user_name%>"><%=temp_user_name%></a>
                           <%if (user != null) {%>
							<div class="head_main_itemPop">
								<div class="head_main_itemPop_Welcome">
									<p>你好,<%=temp_user_name%></p>
								</div>
								<a href="loginOut.action">[退出登录]</a>
							</div> <%}%>
 						</li>
 						<%if(user!=null){%>
                        <li class="head_main_ietmRegister"><a href="#" style="color: black">滴滴会员</a></li>
                        <%}else{%>
                        <li class="head_main_ietmRegister"><a href="register.jsp" style="color: black">免费注册</a></li><%}%>
                        <%if(user!=null){ %>
                        <li class="head_main_ietmMessage"><a href="#" style="color: black">消息</a></li>
                        <li class="head_main_ietmVip"><a href="<%=url2%>" style="color: black">滴信息</a></li>
                        <li class="head_main_itemShoppingMessage"><a href="myFoodCar.active" style="color: black">我的订单</a></li><%}%>
                    </ul>
                </div>
            </div>
        </div>
</body>
</html>