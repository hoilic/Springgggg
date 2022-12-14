package spring.conf;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration //이 파일은 환경설정을 잡아주는 파일이다 라고 알려주는 함수
@PropertySource("classpath:spring/db.properties") 
//db.properties 안에 있는 데이터를 가져오겠다.
@EnableTransactionManagement
//오라클 연결되었을때 커밋 클로즈 대신 해주는 역할 , 즉 트랜잭션 처리 해주는 역할
public class SpringConfiguration {
	
	private @Value("${jdbc.driver}") String driverClassName;
	
	
	private @Value("${jdbc.url}") String url;
	
	
	private @Value("${jdbc.username}") String username;
	
	
	private @Value("${jdbc.password}") String password;
	
	@Bean
	public BasicDataSource dataSource() { //DB에 접속하기 위해서 dbpropertise 에서 가져온 정보를  입력해주는 작업
		BasicDataSource basicDataSource = new BasicDataSource();

		basicDataSource.setDriverClassName(driverClassName);
		basicDataSource.setUrl(url);
		basicDataSource.setUsername(username);
		basicDataSource.setPassword(password);
		return basicDataSource;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		//sqlsession 을 생성하기위 해서는 팩토리가 무조건 필요함으로 팩토리 를 만들고 설정해준다.
		//그 팩토리에 dataSource 넣어주고 mybatis-config 위치 알려주고  userMapper 알려주고
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());
		sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("spring/mybatis-config.xml"));
		sqlSessionFactoryBean.setMapperLocations(new ClassPathResource("user/dao/userMapper.xml"));	
		
		return sqlSessionFactoryBean.getObject();
	}
	@Bean
	public SqlSessionTemplate sqlSession() throws Exception {
		// 스프링과 연동하기 위해서 팩토리에 담은 데이터를 갖고 sqlsession 과 연동한다.
		SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
		return sqlSessionTemplate;
	}
	@Bean
	//자동 트랜잭션 하기 위해서
	public DataSourceTransactionManager transactionManager(){
		return new DataSourceTransactionManager(dataSource());
	}
	
	
}

/*

@Bean 은 메소드 위에 써준다.

@Bean
메소드(){}

- return 되는 클래스를 빈으로 생성한다.
- 반드시 메소드의 이름은  id 명으로 설정해야 한다.

*/