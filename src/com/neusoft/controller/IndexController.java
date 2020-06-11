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
			//������������ʽ
			req.setCharacterEncoding("utf-8");
			//������Ӧ�����ʽ
			resp.setContentType("text/html;charset=utf-8");
			//������ʼ�����ܶ���
			IndexService indexService=new IndexService();
			UserService userService=new UserService();
			//��ʼ�����а�&�����Ƽ�&���ֺû�
			List<Food> jiaChangRank=indexService.RankJiaChang();
			List<Food> liangCaiRank=indexService.RankLiangCai();
			List<Food> zhuShiRank=indexService.RankZhuShi();
			List<Food> yinPinRank=indexService.RankYinPin();
			//��ʼ����ҳ��Ʒ��Ϣ
			List<Food> jiaChang=indexService.InitJiaChang();
			List<Food> liangCai=indexService.InitLiangCai();
			List<Food> zhuShi=indexService.InitZhuShi();
			List<Food> yinPin=indexService.InitYinPin();
			//��ʼ�������Ϣ
			AdverTisement adverTisement=userService.InitAd();
			//��������
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
			//ҳ����ת
			req.getRequestDispatcher("index.jsp").forward(req,resp);
		}
}
