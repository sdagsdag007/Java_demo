package com.neusoft.dao;



import java.util.List;

import com.neusoft.pojo.Food;
import com.neusoft.pojo.FoodType;



public interface FoodDao {
	//根据商品id获取当前商品属性
	public FoodType foodSelectById(Integer id);
	//根据商品id获取当前商品属性
	public Food foodBuySelectById(String id);
	//菜品列表
	public List<FoodType> foodShow();
	//菜品信息更新
	public void foodMsgAlter(Food food);
	//根据商品id删除当前菜品
	public void foodDelete(Integer id);
	//添加新的菜品
	public void foodAdd(Food food);
	//根据菜品类型显示菜品
	public List<Food> foodSelectByType(Integer type);
}
