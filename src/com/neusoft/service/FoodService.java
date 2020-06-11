package com.neusoft.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.neusoft.dao.FoodDao;
import com.neusoft.pojo.Food;
import com.neusoft.pojo.FoodType;
import com.neusoft.utils.Mybatis;

public class FoodService {
	private FoodDao foodDao = null;
	private Mybatis myBatis = null;
	private SqlSession sqlSession = null;

	// 根据商品id获取当前商品属性
	public FoodType foodSelectById(Integer id) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		foodDao = sqlSession.getMapper(FoodDao.class);
		FoodType food = foodDao.foodSelectById(id);
		myBatis.Destory();
		return food;
	}

	// 根据商品id获取当前商品属性
	public Food foodBuySelectById(String id) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		foodDao = sqlSession.getMapper(FoodDao.class);
		Food food = foodDao.foodBuySelectById(id);
		myBatis.Destory();
		return food;
	}
	// 全部菜品，菜品列表
	public List<FoodType> foodShow() throws IOException{
		List<FoodType> foodList=new ArrayList<FoodType>();
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		foodDao = sqlSession.getMapper(FoodDao.class);
		foodList=foodDao.foodShow();
		myBatis.Destory();
		return foodList;
	}
	//修改当前id商品信息
	public void foodMsgAlter(Food food) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		foodDao = sqlSession.getMapper(FoodDao.class);
		foodDao.foodMsgAlter(food);
		myBatis.Destory();
	}
	//删除当前id商品信息
	public void foodDelte(Integer id) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		foodDao = sqlSession.getMapper(FoodDao.class);
		foodDao.foodDelete(id);
		myBatis.Destory();
	}
	//添加商品
	public void foodAdd(Food food) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		foodDao = sqlSession.getMapper(FoodDao.class);
		foodDao.foodAdd(food);
		myBatis.Destory();
	}
	//根据菜品类型显示菜品
	public List<Food> foodSelectByType(Integer type) throws IOException{
		List<Food> foodList=new ArrayList<Food>();
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		foodDao = sqlSession.getMapper(FoodDao.class);
		foodList=foodDao.foodSelectByType(type);
		myBatis.Destory();
		return foodList;
	}
}
