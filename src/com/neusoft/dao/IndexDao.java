package com.neusoft.dao;

import java.util.List;

import com.neusoft.pojo.Food;

public interface IndexDao {
	// ��Ҫ��ʼ�����а�--�ҳ�
	public List<Food> RankJiaChang();
	// ��Ҫ��ʼ�����а�--����
	public List<Food> RankLiangCai();
	// ��Ҫ��ʼ�����а�--��ʳ
	public List<Food> RankZhuShi();
	// ��Ҫ��ʼ�����а�--��Ʒ
	public List<Food> RankYinPin();
	// ��ҳ��ʼ���ҳ�ϵ��
	public List<Food> InitJiaChang();

	// ��ҳ��ʼ������ϵ��
	public List<Food> InitLiangCai();

	// ��ҳ��ʼ����ʳϵ��
	public List<Food> InitZhuShi();

	// ��ҳ��ʼ����Ʒϵ��
	public List<Food> InitYinPin();
}
