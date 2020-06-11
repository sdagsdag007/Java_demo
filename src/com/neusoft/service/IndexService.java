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
	//排行榜家常
	public List<Food> RankJiaChang() throws IOException {
		List<Food> jiaChang = new ArrayList<Food>();
		myBatis = new Mybatis();
		sqlSession=myBatis.getSqlSession();
		id=sqlSession.getMapper(IndexDao.class);
		jiaChang=id.RankJiaChang();
		myBatis.Destory();
		return jiaChang;
	}
	//排行榜凉菜
	public List<Food> RankLiangCai() throws IOException {
		List<Food> liangCai = new ArrayList<Food>();
		myBatis = new Mybatis();
		sqlSession=myBatis.getSqlSession();
		id=sqlSession.getMapper(IndexDao.class);
		liangCai=id.RankLiangCai();
		myBatis.Destory();
		return liangCai;
	}
	//排行榜主食
	public List<Food> RankZhuShi() throws IOException {
		List<Food> zhuShi = new ArrayList<Food>();
		myBatis = new Mybatis();
		sqlSession=myBatis.getSqlSession();
		id=sqlSession.getMapper(IndexDao.class);
		zhuShi=id.RankZhuShi();
		myBatis.Destory();
		return zhuShi;
	}
	//排行榜饮品
	public List<Food> RankYinPin() throws IOException {
		List<Food> yinPin = new ArrayList<Food>();
		myBatis = new Mybatis();
		sqlSession=myBatis.getSqlSession();
		id=sqlSession.getMapper(IndexDao.class);
		yinPin=id.RankYinPin();
		myBatis.Destory();
		return yinPin;
	}
	
	//初始化家常
	public List<Food> InitJiaChang() throws IOException {
		List<Food> jiaChang = new ArrayList<Food>();
		myBatis = new Mybatis();
		sqlSession=myBatis.getSqlSession();
		id=sqlSession.getMapper(IndexDao.class);
		jiaChang=id.InitJiaChang();
		myBatis.Destory();
		return jiaChang;
	}
	//初始化凉菜
	public List<Food> InitLiangCai() throws IOException {
		List<Food> liangCai = new ArrayList<Food>();
		myBatis = new Mybatis();
		sqlSession=myBatis.getSqlSession();
		id=sqlSession.getMapper(IndexDao.class);
		liangCai=id.InitLiangCai();
		myBatis.Destory();
		return liangCai;
	}
	//初始化主食
	public List<Food> InitZhuShi() throws IOException {
		List<Food> zhuShi = new ArrayList<Food>();
		myBatis = new Mybatis();
		sqlSession=myBatis.getSqlSession();
		id=sqlSession.getMapper(IndexDao.class);
		zhuShi=id.InitZhuShi();
		myBatis.Destory();
		return zhuShi;
	}
	//初始化饮品
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
