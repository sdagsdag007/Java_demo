package com.neusoft.dao;

import java.util.List;

import com.neusoft.pojo.AdverTisement;
import com.neusoft.pojo.FoodType;
import com.neusoft.pojo.User;

public interface UserDao {
	// 用户注册
	public void UserRegister(User user);

	// 用户登录
	public User UserLogin(User user);

	// 用户个人信息更改
	public void UserMsgUpdate(User user);

	// 管理当前系统内用户信息
	public List<User> memberMsgAdmin();

	// 根据用户id获取当前用户数据
	public User memberSelectById(int id);

	// 根据用户id更新当前用户数据
	public void memberMsgAlter(User user);

	// 根据用户id删除当前用户数据
	public void memberDelete(int id);

	// 用户根据菜品名称查询菜品
	public List<FoodType> memberSearch(String search);

	// 初始化广告列表
	public List<AdverTisement> InitAdList();

	// 管理员投放广告
	public AdverTisement InitAd();

	// 管理员投放当前id的广告显示
	public void ShowAd(Integer id);

	// 管理设置广告均不显示
	public void DestoryAd();
}
