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

	// �û�ע��
	public void UserRegister(User user) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		userDao.UserRegister(user);
		myBatis.Destory();
	}

	// �û���¼
	public User UserLogin(User user) throws IOException {
		User r_user = new User();
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		r_user = userDao.UserLogin(user);
		myBatis.Destory();
		return r_user;
	}

	// �û�������Ϣ����
	public void UserMsgUpdate(User user) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		userDao.UserMsgUpdate(user);
		myBatis.Destory();
	}

	// ����ǰϵͳ���û���Ϣ
	public List<User> memberMsgAdmin() throws IOException {
		List<User> member = new ArrayList<>();
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		member = userDao.memberMsgAdmin();
		myBatis.Destory();
		return member;
	}

	// �����û�id��ȡ��ǰ�û�����
	public User memberSelectById(int id) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		User user = userDao.memberSelectById(id);
		myBatis.Destory();
		return user;
	}

	// �û�������Ϣ����
	public void memberMsgAlter(User user) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		userDao.memberMsgAlter(user);
		myBatis.Destory();
	}

	// �����û�idɾ����ǰ�û�����
	public void memberDelete(int id) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		userDao.memberDelete(id);
		myBatis.Destory();
	}

	// �û����ݲ�Ʒ���Ʋ�ѯ��Ʒ
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

	// ��ʼ������б�
	public List<AdverTisement> InitAdList() throws IOException {
		List<AdverTisement> AdList = new ArrayList<>();
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		AdList = userDao.InitAdList();
		return AdList;
	}

	// ����ԱͶ�Ź��
	public AdverTisement InitAd() throws IOException {
		AdverTisement adverTisement = new AdverTisement();
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		adverTisement = userDao.InitAd();
		myBatis.Destory();
		return adverTisement;
	}
	//����ԱͶ�ŵ�ǰid�Ĺ����ʾ
	public void ShowAd(Integer id) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		userDao.ShowAd(id);
		myBatis.Destory();
	}
	// ����Ա���ù�������ʾ
	public void DestoryAd() throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userDao = sqlSession.getMapper(UserDao.class);
		userDao.DestoryAd();
		myBatis.Destory();
	}
}
