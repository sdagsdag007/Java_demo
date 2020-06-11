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

	// ������Ʒid��ȡ��ǰ��Ʒ����
	public FoodType foodSelectById(Integer id) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		foodDao = sqlSession.getMapper(FoodDao.class);
		FoodType food = foodDao.foodSelectById(id);
		myBatis.Destory();
		return food;
	}

	// ������Ʒid��ȡ��ǰ��Ʒ����
	public Food foodBuySelectById(String id) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		foodDao = sqlSession.getMapper(FoodDao.class);
		Food food = foodDao.foodBuySelectById(id);
		myBatis.Destory();
		return food;
	}
	// ȫ����Ʒ����Ʒ�б�
	public List<FoodType> foodShow() throws IOException{
		List<FoodType> foodList=new ArrayList<FoodType>();
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		foodDao = sqlSession.getMapper(FoodDao.class);
		foodList=foodDao.foodShow();
		myBatis.Destory();
		return foodList;
	}
	//�޸ĵ�ǰid��Ʒ��Ϣ
	public void foodMsgAlter(Food food) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		foodDao = sqlSession.getMapper(FoodDao.class);
		foodDao.foodMsgAlter(food);
		myBatis.Destory();
	}
	//ɾ����ǰid��Ʒ��Ϣ
	public void foodDelte(Integer id) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		foodDao = sqlSession.getMapper(FoodDao.class);
		foodDao.foodDelete(id);
		myBatis.Destory();
	}
	//�����Ʒ
	public void foodAdd(Food food) throws IOException {
		myBatis = new Mybatis();
		sqlSession = myBatis.getSqlSession();
		foodDao = sqlSession.getMapper(FoodDao.class);
		foodDao.foodAdd(food);
		myBatis.Destory();
	}
	//���ݲ�Ʒ������ʾ��Ʒ
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
