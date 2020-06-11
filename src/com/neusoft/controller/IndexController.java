package com.neusoft.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.pojo.AdverTisement;
import com.neusoft.pojo.Food;
import com.neusoft.service.IndexService;
import com.neusoft.service.UserService;

/**
 * Servlet implementation class IndexController
 */
@WebServlet("/Index")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException, IOException {
			//设置请求编码格式
			req.setCharacterEncoding("utf-8");
			//设置响应编码格式
			resp.setContentType("text/html;charset=utf-8");
			//建立初始化功能对象
			IndexService indexService=new IndexService();
			UserService userService=new UserService();
			//初始化排行榜&今日推荐&发现好货
			List<Food> jiaChangRank=indexService.RankJiaChang();
			List<Food> liangCaiRank=indexService.RankLiangCai();
			List<Food> zhuShiRank=indexService.RankZhuShi();
			List<Food> yinPinRank=indexService.RankYinPin();
			//初始化首页菜品信息
			List<Food> jiaChang=indexService.InitJiaChang();
			List<Food> liangCai=indexService.InitLiangCai();
			List<Food> zhuShi=indexService.InitZhuShi();
			List<Food> yinPin=indexService.InitYinPin();
			//初始化广告信息
			AdverTisement adverTisement=userService.InitAd();
			//传送数据
			if(adverTisement!=null) {
				req.setAttribute("adverTisement",adverTisement);
			}
			req.setAttribute("jiaChangRank",jiaChangRank);
			req.setAttribute("liangCaiRank",liangCaiRank);
			req.setAttribute("zhuShiRank",zhuShiRank);
			req.setAttribute("yinPinRank",yinPinRank);
			req.setAttribute("jiaChang",jiaChang);
			req.setAttribute("liangCai",liangCai);
			req.setAttribute("zhuShi",zhuShi);
			req.setAttribute("yinPin",yinPin);
			//页面跳转
			req.getRequestDispatcher("index.jsp").forward(req,resp);
		}
}
