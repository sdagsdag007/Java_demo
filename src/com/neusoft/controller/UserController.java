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

import com.neusoft.pojo.AdverTisement;
import com.neusoft.pojo.FoodType;
import com.neusoft.pojo.User;
import com.neusoft.service.UserService;

/**
 * Servlet implementation class UserController
 */
@WebServlet("*.action")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String path = req.getServletPath();
		UserService userService = new UserService();
		HttpSession session = req.getSession();

		if (path.equals("/register.action")) {
			// 用户注册
			String userName = req.getParameter("user_name");
			String password = req.getParameter("user_pwd");
			String telephone = req.getParameter("user_phone");
			User user = new User();
			user.setUserName(userName);
			user.setPassword(password);
			user.setIdent("0");
			user.setTelephone(telephone);
			user.setAddress("请编辑您的地址");
			userService.UserRegister(user);
			resp.sendRedirect("login.jsp");
		} else if (path.equals("/login.action")) {
			// 用户登录
			User t_user = new User();
			String userName = req.getParameter("user_name");
			String password = req.getParameter("user_pwd");
			t_user.setUserName(userName);
			t_user.setPassword(password);
			User user = userService.UserLogin(t_user);
			if (user != null) {
				session.setAttribute("user", user);
				resp.sendRedirect("Index");
			} else {
				req.setAttribute("login_failed", "用户名或密码错误");
				req.getRequestDispatcher("login.jsp").forward(req, resp);
			}
		} else if (path.equals("/loginOut.action")) {
			// 退出登录
			session.invalidate();
			resp.sendRedirect("Index");
		} else if (path.equals("/userMsgAlter.action")) {
			// 用户个人信息更改
			User user = new User();
			String id = req.getParameter("user_id");
			String userName = req.getParameter("user_name");
			String password = req.getParameter("user_pwd");
			String telephone = req.getParameter("user_phone");
			String address = req.getParameter("user_address");
			user.setId(Integer.parseInt(id));
			user.setUserName(userName);
			user.setPassword(password);
			user.setTelephone(telephone);
			user.setAddress(address);
			userService.UserMsgUpdate(user);
			resp.sendRedirect("loginOut.action");
		} else if (path.equals("/memberMsgAdmin.action")) {
			// 管理当前系统内用户信息
			List<User> member = new ArrayList<>();
			member = userService.memberMsgAdmin();
			req.setAttribute("memberMsgAdmin", member);
			req.getRequestDispatcher("userAdmin.jsp").forward(req, resp);
		}else if (path.equals("/memberMsgSelect.action")) {
			// 根据用户id获取当前用户数据
			String user_id = req.getParameter("user_id");
			int id = Integer.parseInt(user_id);
			User user = userService.memberSelectById(id);
			req.setAttribute("member_msg", user);
			req.getRequestDispatcher("memberMsg.jsp").forward(req, resp);
		}else if (path.equals("/memberMsgAlter.action")) {
			// 根据用户id更新当前用户数据
			User user = new User();
			String id = req.getParameter("user_id");
			String userName = req.getParameter("user_name");
			String password = req.getParameter("user_pwd");
			String telephone = req.getParameter("user_phone");
			String address = req.getParameter("user_address");
			user.setId(Integer.parseInt(id));
			user.setUserName(userName);
			user.setPassword(password);
			user.setTelephone(telephone);
			user.setAddress(address);
			userService.memberMsgAlter(user);
			resp.sendRedirect("memberMsgAdmin.action");
		}else if (path.equals("/memberDelete.action")) {
			// 根据用户id删除当前用户
			String id=req.getParameter("user_id");
			userService.memberDelete(Integer.parseInt(id));
			resp.sendRedirect("memberMsgAdmin.action");
		}else if(path.equals("/memberSearch.action")) {
			//用户根据菜品名称查询菜品
			String searchContent=req.getParameter("searchContent");
			List<FoodType> searchlist=userService.memberSearch(searchContent);
			req.setAttribute("searchList", searchlist);
			req.getRequestDispatcher("foodSearch.jsp").forward(req,resp);
		}else if(path.equals("/adAdmin.action")) {
			//广告管理列表
			List<AdverTisement> adList=new ArrayList<>();
			adList=userService.InitAdList();
			req.setAttribute("adList",adList);
			req.getRequestDispatcher("adAdmin.jsp").forward(req,resp);
		}else if(path.equals("/showAd.action")) {
			// 管理员投放当前id的广告显示
			String id=req.getParameter("ad_id");
			userService.DestoryAd();
			userService.ShowAd(Integer.parseInt(id));
			List<AdverTisement> adList=new ArrayList<>();
			adList=userService.InitAdList();
			req.setAttribute("adList",adList);
			req.getRequestDispatcher("adAdmin.jsp").forward(req,resp);
		}else if(path.equals("/displayAd.action")) {
			// 管理设置广告均不显示
			userService.DestoryAd();
			List<AdverTisement> adList=new ArrayList<>();
			adList=userService.InitAdList();
			req.setAttribute("adList",adList);
			req.getRequestDispatcher("adAdmin.jsp").forward(req,resp);
		}
	}

}
