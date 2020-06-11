package com.neusoft.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Mybatis {
	private InputStream is=null;
	private SqlSession sqlSession=null;
	private SqlSessionFactory factory=null;
	private SqlSessionFactoryBuilder builder=null;
	
	public Mybatis() throws IOException {
		Init();
	}

	public void Init() throws IOException {
		//读取配置文件，生成字节输入流
		is=Resources.getResourceAsStream("SqlMapConfig.xml");
		builder=new SqlSessionFactoryBuilder();
		factory=builder.build(is);
		sqlSession=factory.openSession();
	}
	
	public void Destory() throws IOException {
		//提交事务
		sqlSession.commit();
		//释放资源
		sqlSession.close();
		is.close();
	}
	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
}
