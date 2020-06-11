package com.neusoft.dao;

import java.util.List;

import com.neusoft.pojo.UserShopCar;

public interface UserShopCarDao {
	//将所购商品添加到数据库中
		public void UserGoodsAdd(UserShopCar usc);
	// 获取当前用户所点商品
	List<UserShopCar> userShopCar(Integer id);
	// 删除购物车中商品
	public void UserGoodsDelete(UserShopCar usc);
}
