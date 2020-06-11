package com.neusoft.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.neusoft.dao.UserShopCarDao;
import com.neusoft.pojo.UserShopCar;
import com.neusoft.utils.Mybatis;

public class UserShopCarService {
	private UserShopCarDao userShopDao = null;
	private Mybatis myBatis = null;
	private SqlSession sqlSession = null;

	//将所购商品添加到数据库中
	public void UserGoodsAdd(UserShopCar usc) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userShopDao = sqlSession.getMapper(UserShopCarDao.class);
		userShopDao.UserGoodsAdd(usc);
		myBatis.Destory();
	}
	//当前用户购物车
	public List<UserShopCar> userShopCar(Integer id) throws IOException {
		List<UserShopCar> userShopCar = new ArrayList<>();
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		userShopDao = sqlSession.getMapper(UserShopCarDao.class);
		userShopCar = userShopDao.userShopCar(id);
		myBatis.Destory();
		return userShopCar;
	}
	//将所购商品添加到数据库中
		public void UserGoodsDelete(UserShopCar usc) throws IOException {
			myBatis = new Mybatis();
			sqlSession = myBatis.getSqlSession();
			userShopDao = sqlSession.getMapper(UserShopCarDao.class);
			userShopDao.UserGoodsDelete(usc);
			myBatis.Destory();
		}
}
