package cn.hassan.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created with idea
 * Author: hss
 * Date: 11/27/2018 4:33 PM
 * Description:
 */
public class MybatisTest {

	private SqlSessionFactory sqlSessionFactory = null;

	@Before
	public void init() {
		try {
			String path = "mybatis/mybatis-config.xml";
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			InputStream inputStream = Resources.getResourceAsStream(path);
			sqlSessionFactory = builder.build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void findUserById() {
		SqlSession session = sqlSessionFactory.openSession();
		Object user = session.selectOne("findUserById", 1);
		System.out.println(user);
		session.close();
	}
}
