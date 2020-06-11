<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>吃了么滴滴 (oﾟvﾟ)ノ-登录</title>
    <link rel="icon" type="img/x-icon" href="img/logo.ico">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    
    <style>
        /* 重点学习，这手操作很灵性有点东西的 */
        .rgister_Title {
            width: 1160px;
            height: 28px;
            margin: 0 auto;
            border-bottom: 1px solid #ddd;
            margin-bottom: 28px;
            text-align: center;
        }

        .rgister_Title_content {
            height: 56px;
            line-height: 56px;
            margin: 0 auto;
            padding: 0 20px;
            font-size: 40px;
            background-color: #fff;
            text-align: center;
        }
    </style>
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
        <!-- 注册Title -->
        <div class="rgister_Title">
            <span class="rgister_Title_content" style="font-size:38px">登录</span>
        </div>
        <!-- 登录页主体 -->
        <div class="loginPage_main">
            <div class="loginPage_Img">
                <img src="img/QR-Code.png">
                <p>扫描二维码登录</p>
            </div>
            <div class="loginPage_Content">
                <form action="login.action" method="post">
                    <input type="text" name="user_name" placeholder="您的用户名" class="loginPage_userName">
                    <input type="password" name="user_pwd" placeholder="密码" class="loginPage_userPwd">
                    <p class="loginPage_errorMsg">${login_failed}</p>
                    <div class="loginPage_checkArea">
                        <div class="loginPage_checkAreaLeft">
                            <input type="checkbox" checked="true">
                            <span>一周内自动登录,不是自己的电脑不要勾选此选项</span>
                        </div>
                        <div class="loginPage_checkAreaRight">
                            <a href="#">无法验证？忘记密码?</a>
                        </div>
                    </div>
                    <div class="loginPage_buttonArea">
                        <input type="submit" value="登录" class="loginPage_buttonLogin">
                        <a href="register.html"><input type="button" value="注册" class="loginPage_rgisterLogin"></a>
                    </div>
                </form>
                <div class="loginPage_otherLogin">
                    <div class="loginPage_otherLogin_WB">
                        <a href="#">
                        <img src="img/wb_login.png" width="24px " height="24px">
                        <span>微博登录</span>
                        </a>
                    </div>
                    <div class="loginPage_otherLogin_QQ">
                        <a href="#">
                        <img src="img/qq_login.png" width="24px " height="24px">
                        <span>QQ登录</span>
                        </a>
                    </div>

                </div>
            </div>
        </div>
        <!-- 尾部，你说写什么好呢？_> -->
        <div class="foot">
            <div class="foot_main">
                <div class="foot_main_left">
                    <p>吃了么滴滴(oﾟvﾟ)ノ</p>
                    <ul>
                        <li style="margin-left:0px;"><a href="#">关于我们</a></li>
                        <li><a href="#">联系我们</a></li>
                        <li><a href="#">合作伙伴</a></li>
                        <li><a href="#">诚征英才</a></li>
                        <li><a href="#">隐私权政策</a></li>
                        <li><a href="#">法律声明</a></li>
                    </ul>
                </div>
                <div class="foot_main_center">
                    <p>传送门</p>
                    <ul>
                        <li><a href="#">首页</a></li>
                        <li><a href="#">家常</a></li>
                        <li><a href="#">凉菜</a></li>
                        <li><a href="#">主食</a></li>
                        <li><a href="#">饮品</a></li>
                        <li><a href="#">会员购</a></li>
                    </ul>
                </div>
                <div class="foot_main_right">
                    <ul>
                        <li><a href="#"><img src="img/weibo.png">
                                <p>新浪微博</p>
                            </a></li>
                        <li><a href="#"><img src="img/wechat.png">
                                <p>官方微信</p>
                            </a></li>
                        <li><a href="#"><img src="img/qqzone.png">
                                <p>QQ空间</p>
                            </a></li>
                    </ul>
                </div>
            </div>
        </div>
</body>

</html>