package com.neusoft.dao;

import java.util.List;

import com.neusoft.pojo.UserShopCar;

public interface UserShopCarDao {
	//��������Ʒ��ӵ����ݿ���
		public void UserGoodsAdd(UserShopCar usc);
	// ��ȡ��ǰ�û�������Ʒ
	List<UserShopCar> userShopCar(Integer id);
	// ɾ�����ﳵ����Ʒ
	public void UserGoodsDelete(UserShopCar usc);
}
