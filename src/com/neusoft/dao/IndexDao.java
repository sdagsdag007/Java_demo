package com.neusoft.dao;

import java.util.List;

import com.neusoft.pojo.Food;

public interface IndexDao {
	// 主要初始化排行榜--家常
	public List<Food> RankJiaChang();
	// 主要初始化排行榜--凉菜
	public List<Food> RankLiangCai();
	// 主要初始化排行榜--主食
	public List<Food> RankZhuShi();
	// 主要初始化排行榜--饮品
	public List<Food> RankYinPin();
	// 主页初始化家常系列
	public List<Food> InitJiaChang();

	// 主页初始化凉菜系列
	public List<Food> InitLiangCai();

	// 主页初始化主食系列
	public List<Food> InitZhuShi();

	// 主页初始化饮品系列
	public List<Food> InitYinPin();
}
