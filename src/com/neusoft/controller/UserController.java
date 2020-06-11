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
			// �û�ע��
			String userName = req.getParameter("user_name");
			String password = req.getParameter("user_pwd");
			String telephone = req.getParameter("user_phone");
			User user = new User();
			user.setUserName(userName);
			user.setPassword(password);
			user.setIdent("0");
			user.setTelephone(telephone);
			user.setAddress("��༭���ĵ�ַ");
			userService.UserRegister(user);
			resp.sendRedirect("login.jsp");
		} else if (path.equals("/login.action")) {
			// �û���¼
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
				req.setAttribute("login_failed", "�û������������");
				req.getRequestDispatcher("login.jsp").forward(req, resp);
			}
		} else if (path.equals("/loginOut.action")) {
			// �˳���¼
			session.invalidate();
			resp.sendRedirect("Index");
		} else if (path.equals("/userMsgAlter.action")) {
			// �û�������Ϣ����
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
			// ����ǰϵͳ���û���Ϣ
			List<User> member = new ArrayList<>();
			member = userService.memberMsgAdmin();
			req.setAttribute("memberMsgAdmin", member);
			req.getRequestDispatcher("userAdmin.jsp").forward(req, resp);
		}else if (path.equals("/memberMsgSelect.action")) {
			// �����û�id��ȡ��ǰ�û�����
			String user_id = req.getParameter("user_id");
			int id = Integer.parseInt(user_id);
			User user = userService.memberSelectById(id);
			req.setAttribute("member_msg", user);
			req.getRequestDispatcher("memberMsg.jsp").forward(req, resp);
		}else if (path.equals("/memberMsgAlter.action")) {
			// �����û�id���µ�ǰ�û�����
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
			// �����û�idɾ����ǰ�û�
			String id=req.getParameter("user_id");
			userService.memberDelete(Integer.parseInt(id));
			resp.sendRedirect("memberMsgAdmin.action");
		}else if(path.equals("/memberSearch.action")) {
			//�û����ݲ�Ʒ���Ʋ�ѯ��Ʒ
			String searchContent=req.getParameter("searchContent");
			List<FoodType> searchlist=userService.memberSearch(searchContent);
			req.setAttribute("searchList", searchlist);
			req.getRequestDispatcher("foodSearch.jsp").forward(req,resp);
		}else if(path.equals("/adAdmin.action")) {
			//�������б�
			List<AdverTisement> adList=new ArrayList<>();
			adList=userService.InitAdList();
			req.setAttribute("adList",adList);
			req.getRequestDispatcher("adAdmin.jsp").forward(req,resp);
		}else if(path.equals("/showAd.action")) {
			// ����ԱͶ�ŵ�ǰid�Ĺ����ʾ
			String id=req.getParameter("ad_id");
			userService.DestoryAd();
			userService.ShowAd(Integer.parseInt(id));
			List<AdverTisement> adList=new ArrayList<>();
			adList=userService.InitAdList();
			req.setAttribute("adList",adList);
			req.getRequestDispatcher("adAdmin.jsp").forward(req,resp);
		}else if(path.equals("/displayAd.action")) {
			// �������ù�������ʾ
			userService.DestoryAd();
			List<AdverTisement> adList=new ArrayList<>();
			adList=userService.InitAdList();
			req.setAttribute("adList",adList);
			req.getRequestDispatcher("adAdmin.jsp").forward(req,resp);
		}
	}

}
