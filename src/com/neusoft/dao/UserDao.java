package com.neusoft.dao;

import java.util.List;

import com.neusoft.pojo.AdverTisement;
import com.neusoft.pojo.FoodType;
import com.neusoft.pojo.User;

public interface UserDao {
	// �û�ע��
	public void UserRegister(User user);

	// �û���¼
	public User UserLogin(User user);

	// �û�������Ϣ����
	public void UserMsgUpdate(User user);

	// ����ǰϵͳ���û���Ϣ
	public List<User> memberMsgAdmin();

	// �����û�id��ȡ��ǰ�û�����
	public User memberSelectById(int id);

	// �����û�id���µ�ǰ�û�����
	public void memberMsgAlter(User user);

	// �����û�idɾ����ǰ�û�����
	public void memberDelete(int id);

	// �û����ݲ�Ʒ���Ʋ�ѯ��Ʒ
	public List<FoodType> memberSearch(String search);

	// ��ʼ������б�
	public List<AdverTisement> InitAdList();

	// ����ԱͶ�Ź��
	public AdverTisement InitAd();

	// ����ԱͶ�ŵ�ǰid�Ĺ����ʾ
	public void ShowAd(Integer id);

	// �������ù�������ʾ
	public void DestoryAd();
}
