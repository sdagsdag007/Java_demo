package com.neusoft.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.neusoft.dao.IndexDao;
import com.neusoft.pojo.Food;
import com.neusoft.utils.Mybatis;

public class IndexService {
	private IndexDao id = null;
	private Mybatis myBatis = null;
	private SqlSession sqlSession=null;
	//���а�ҳ�
	public List<Food> RankJiaChang() throws IOException {
		List<Food> jiaChang = new ArrayList<Food>();
		myBatis = new Mybatis();
		sqlSession=myBatis.getSqlSession();
		id=sqlSession.getMapper(IndexDao.class);
		jiaChang=id.RankJiaChang();
		myBatis.Destory();
		return jiaChang;
	}
	//���а�����
	public List<Food> RankLiangCai() throws IOException {
		List<Food> liangCai = new ArrayList<Food>();
		myBatis = new Mybatis();
		sqlSession=myBatis.getSqlSession();
		id=sqlSession.getMapper(IndexDao.class);
		liangCai=id.RankLiangCai();
		myBatis.Destory();
		return liangCai;
	}
	//���а���ʳ
	public List<Food> RankZhuShi() throws IOException {
		List<Food> zhuShi = new ArrayList<Food>();
		myBatis = new Mybatis();
		sqlSession=myBatis.getSqlSession();
		id=sqlSession.getMapper(IndexDao.class);
		zhuShi=id.RankZhuShi();
		myBatis.Destory();
		return zhuShi;
	}
	//���а���Ʒ
	public List<Food> RankYinPin() throws IOException {
		List<Food> yinPin = new ArrayList<Food>();
		myBatis = new Mybatis();
		sqlSession=myBatis.getSqlSession();
		id=sqlSession.getMapper(IndexDao.class);
		yinPin=id.RankYinPin();
		myBatis.Destory();
		return yinPin;
	}
	
	//��ʼ���ҳ�
	public List<Food> InitJiaChang() throws IOException {
		List<Food> jiaChang = new ArrayList<Food>();
		myBatis = new Mybatis();
		sqlSession=myBatis.getSqlSession();
		id=sqlSession.getMapper(IndexDao.class);
		jiaChang=id.InitJiaChang();
		myBatis.Destory();
		return jiaChang;
	}
	//��ʼ������
	public List<Food> InitLiangCai() throws IOException {
		List<Food> liangCai = new ArrayList<Food>();
		myBatis = new Mybatis();
		sqlSession=myBatis.getSqlSession();
		id=sqlSession.getMapper(IndexDao.class);
		liangCai=id.InitLiangCai();
		myBatis.Destory();
		return liangCai;
	}
	//��ʼ����ʳ
	public List<Food> InitZhuShi() throws IOException {
		List<Food> zhuShi = new ArrayList<Food>();
		myBatis = new Mybatis();
		sqlSession=myBatis.getSqlSession();
		id=sqlSession.getMapper(IndexDao.class);
		zhuShi=id.InitZhuShi();
		myBatis.Destory();
		return zhuShi;
	}
	//��ʼ����Ʒ
	public List<Food> InitYinPin() throws IOException {
		List<Food> yinPin = new ArrayList<Food>();
		myBatis = new Mybatis();
		sqlSession=myBatis.getSqlSession();
		id=sqlSession.getMapper(IndexDao.class);
		yinPin=id.InitYinPin();
		myBatis.Destory();
		return yinPin;
	}
	
}
