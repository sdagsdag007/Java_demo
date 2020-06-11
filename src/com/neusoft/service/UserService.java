package com.neusoft.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.neusoft.dao.UserDao;
import com.neusoft.pojo.AdverTisement;
import com.neusoft.pojo.FoodType;
import com.neusoft.pojo.User;
import com.neusoft.utils.Mybatis;

public class UserService {
	private UserDao userDao = null;
	private Mybatis myBatis = null;
	private SqlSession sqlSession = null;

	// 用户注册
	public void UserRegister(User user) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		userDao.UserRegister(user);
		myBatis.Destory();
	}

	// 用户登录
	public User UserLogin(User user) throws IOException {
		User r_user = new User();
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		r_user = userDao.UserLogin(user);
		myBatis.Destory();
		return r_user;
	}

	// 用户个人信息更改
	public void UserMsgUpdate(User user) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		userDao.UserMsgUpdate(user);
		myBatis.Destory();
	}

	// 管理当前系统内用户信息
	public List<User> memberMsgAdmin() throws IOException {
		List<User> member = new ArrayList<>();
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		member = userDao.memberMsgAdmin();
		myBatis.Destory();
		return member;
	}

	// 根据用户id获取当前用户数据
	public User memberSelectById(int id) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		User user = userDao.memberSelectById(id);
		myBatis.Destory();
		return user;
	}

	// 用户个人信息更改
	public void memberMsgAlter(User user) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		userDao.memberMsgAlter(user);
		myBatis.Destory();
	}

	// 根据用户id删除当前用户数据
	public void memberDelete(int id) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		userDao.memberDelete(id);
		myBatis.Destory();
	}

	// 用户根据菜品名称查询菜品
	public List<FoodType> memberSearch(String search) throws IOException {
		List<FoodType> foodList = new ArrayList<>();
		String searchContent = "%" + search + "%";
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		foodList = userDao.memberSearch(searchContent);
		myBatis.Destory();
		return foodList;
	}

	// 初始化广告列表
	public List<AdverTisement> InitAdList() throws IOException {
		List<AdverTisement> AdList = new ArrayList<>();
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		AdList = userDao.InitAdList();
		return AdList;
	}

	// 管理员投放广告
	public AdverTisement InitAd() throws IOException {
		AdverTisement adverTisement = new AdverTisement();
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		adverTisement = userDao.InitAd();
		myBatis.Destory();
		return adverTisement;
	}
	//管理员投放当前id的广告显示
	public void ShowAd(Integer id) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		userDao.ShowAd(id);
		myBatis.Destory();
	}
	// 管理员设置广告均不显示
	public void DestoryAd() throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		userDao.DestoryAd();
		myBatis.Destory();
	}
}
