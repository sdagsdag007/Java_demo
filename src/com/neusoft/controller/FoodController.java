package com.neusoft.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.neusoft.pojo.Food;
import com.neusoft.pojo.FoodType;
import com.neusoft.pojo.User;
import com.neusoft.pojo.UserShopCar;
import com.neusoft.service.FoodService;
import com.neusoft.service.UserShopCarService;

/**
 * Servlet implementation class FoodController
 */
@WebServlet("*.active")
public class FoodController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		HttpSession hs=req.getSession();
		String path = req.getServletPath();
		FoodService foodService = new FoodService();
		UserShopCarService userShopCarService=new UserShopCarService();
		if(path.equals("/foodDetail.active")) {
			//菜品详情
			String id=req.getParameter("food_id");
			FoodType food=foodService.foodSelectById(Integer.parseInt(id));
			req.setAttribute("foodDetail",food);
			req.getRequestDispatcher("foodDetails.jsp").forward(req,resp);
		}else if(path.equals("/buyFood.active")) {
			//购买菜品--数据库
			String id=req.getParameter("food_id");
			User user=(User)hs.getAttribute("user");
			if(user==null) {
				req.setAttribute("login_failed","请先进行用户登录");
				req.getRequestDispatcher("login.jsp").forward(req, resp);
			}
			UserShopCar usc=new UserShopCar();
			usc.setUserId(user.getId());
			usc.setFoodId(Integer.parseInt(id));
			userShopCarService.UserGoodsAdd(usc);
			List<UserShopCar> userShopCar=userShopCarService.userShopCar(user.getId());
			List<Integer> ids=new ArrayList<>();
			for(UserShopCar f:userShopCar) {
				ids.add(f.getFoodId());
			}
			List<FoodType> cartDetail=new ArrayList<FoodType>();
			for(Integer i:ids) {
				FoodType food=foodService.foodSelectById(i);
				cartDetail.add(food);
			}
			hs.setAttribute("cartDetail",cartDetail);
			resp.sendRedirect("myShop.jsp");
		}else if(path.equals("/deleteFood.active")) {
			//删除菜品--数据库
			String id=req.getParameter("food_id");
			User user=(User)hs.getAttribute("user");
			UserShopCar usc=new UserShopCar();
			usc.setFoodId(Integer.parseInt(id));
			usc.setUserId(user.getId());
			userShopCarService.UserGoodsDelete(usc);
			List<UserShopCar> userShopCar=userShopCarService.userShopCar(user.getId());
			List<Integer> ids=new ArrayList<>();
			for(UserShopCar f:userShopCar) {
				ids.add(f.getFoodId());
			}
			List<FoodType> cartDetail=new ArrayList<FoodType>();
			for(Integer i:ids) {
				FoodType food=foodService.foodSelectById(i);
				cartDetail.add(food);
			}
			hs.setAttribute("cartDetail",cartDetail);
			resp.sendRedirect("myShop.jsp");
		}else if(path.equals("/myFoodCar.active")){
			//显示我的订单
			User user=(User)hs.getAttribute("user");
			List<UserShopCar> userShopCar=userShopCarService.userShopCar(user.getId());
			List<Integer> ids=new ArrayList<>();
			for(UserShopCar f:userShopCar) {
				ids.add(f.getFoodId());
			}
			List<FoodType> cartDetail=new ArrayList<FoodType>();
			for(Integer i:ids) {
				FoodType food=foodService.foodSelectById(i);
				cartDetail.add(food);
			}
			hs.setAttribute("cartDetail",cartDetail);
			resp.sendRedirect("myShop.jsp");
			
		}else if(path.equals("/allFood.active")) {
			//显示菜品列表
			List<FoodType> foodList=new ArrayList<>();
			foodList=foodService.foodShow();
			req.setAttribute("foodList", foodList);
			req.getRequestDispatcher("foodAll.jsp").forward(req,resp);
		}else if(path.equals("/buyMoreFood.active")) {
			//添加多个菜品
			String[] ids=req.getParameterValues("food_id");
			for(String id:ids) {
				System.out.println(id);
			}
			UserShopCar usc=new UserShopCar();
			User user=(User)hs.getAttribute("user");
			usc.setUserId(user.getId());
			for(String id:ids) {
				usc.setFoodId(Integer.parseInt(id));
				userShopCarService.UserGoodsAdd(usc);
			}
			List<UserShopCar> userShopCar=userShopCarService.userShopCar(user.getId());
			List<Integer> n_ids=new ArrayList<>();
			for(UserShopCar f:userShopCar) {
				n_ids.add(f.getFoodId());
			}
			List<FoodType> cartDetail=new ArrayList<FoodType>();
			for(Integer i:n_ids) {
				FoodType food=foodService.foodSelectById(i);
				cartDetail.add(food);
			}
			hs.setAttribute("cartDetail",cartDetail);
			resp.sendRedirect("myShop.jsp");
		}else if(path.equals("/foodAdmin.active")) {
			//显示管理菜品页面信息
			List<FoodType> foodList=new ArrayList<>();
			foodList=foodService.foodShow();
			hs.setAttribute("foodList",foodList);
			resp.sendRedirect("foodAdmin.jsp");
		}else if(path.equals("/foodMsg.active")) {
			//传入当前菜品信息
			String id=req.getParameter("food_id");
			FoodType food=foodService.foodSelectById(Integer.parseInt(id));
			req.setAttribute("foodMsg",food);
			req.getRequestDispatcher("foodMsg.jsp").forward(req,resp);
		}else if(path.equals("/foodMsgAlter.active")) {
			//菜品信息更改
			String id=req.getParameter("food_id");
			String foodName=req.getParameter("food_name");
			String feature=req.getParameter("food_feature");
			String material=req.getParameter("food_material");
			String price=req.getParameter("food_price");
			String type=req.getParameter("food_type");
			String picture=req.getParameter("food_picture");
			String hits=req.getParameter("food_hits");
			Food food=new Food();
			food.setId(Integer.parseInt(id));
			food.setFoodName(foodName);
			food.setFeature(feature);
			food.setMaterial(material);
			food.setPrice(Integer.parseInt(price));
			food.setType(Integer.parseInt(type));
			food.setPicture(picture);
			food.setHits(Integer.parseInt(hits));
			foodService.foodMsgAlter(food);
			List<FoodType> foodList=new ArrayList<>();
			foodList=foodService.foodShow();
			hs.setAttribute("foodList",foodList);
			resp.sendRedirect("foodAdmin.jsp");
		}else if(path.equals("/foodMsgDelete.active")) {
			//菜品删除
			String id=req.getParameter("food_id");
			foodService.foodDelte(Integer.parseInt(id));
			List<FoodType> foodList=foodService.foodShow();
			hs.setAttribute("foodList",foodList);
			resp.sendRedirect("foodAdmin.jsp");
		}else if(path.equals("/foodMsgAdd.active")) {
			//菜品添加
			String foodName=req.getParameter("food_name");
			String feature=req.getParameter("food_feature");
			String material=req.getParameter("food_material");
			String price=req.getParameter("food_price");
			String type=req.getParameter("food_type");
			String picture=req.getParameter("food_picture");
			String hits=req.getParameter("food_hits");
			Food food=new Food();
			food.setFoodName(foodName);
			food.setFeature(feature);
			food.setMaterial(material);
			food.setPrice(Integer.parseInt(price));
			food.setType(Integer.parseInt(type));
			food.setPicture(picture);
			food.setHits(Integer.parseInt(hits));
			foodService.foodAdd(food);
			List<FoodType> foodList=foodService.foodShow();
			hs.setAttribute("foodList",foodList);
			resp.sendRedirect("foodAdmin.jsp");
		}else if(path.equals("/foodTypeShow.active")) {
			//显示当前类别所有菜品
			String foodType=req.getParameter("food_type");
//			String sort=req.getParameter("sort");
			List<Food> foodList=foodService.foodSelectByType(Integer.parseInt(foodType));
			req.setAttribute("foodList",foodList);
			req.getRequestDispatcher("typeJiaChang.jsp").forward(req,resp);
		}
	}
}
