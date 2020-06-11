package com.neusoft.dao;



import java.util.List;

import com.neusoft.pojo.Food;
import com.neusoft.pojo.FoodType;



public interface FoodDao {
	//������Ʒid��ȡ��ǰ��Ʒ����
	public FoodType foodSelectById(Integer id);
	//������Ʒid��ȡ��ǰ��Ʒ����
	public Food foodBuySelectById(String id);
	//��Ʒ�б�
	public List<FoodType> foodShow();
	//��Ʒ��Ϣ����
	public void foodMsgAlter(Food food);
	//������Ʒidɾ����ǰ��Ʒ
	public void foodDelete(Integer id);
	//����µĲ�Ʒ
	public void foodAdd(Food food);
	//���ݲ�Ʒ������ʾ��Ʒ
	public List<Food> foodSelectByType(Integer type);
}
