package spring.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample01.MessageBeanImpl;
import sample02.CalcAdd;
import sample02.CalcMul;
import sample05.SungJukDTO2;

@Configuration //이 파일은 환경설정을 잡아주는 파일이다 라고 알려주는 함수
public class SpringConfiguration {
	
	//sample01
	@Bean
	public MessageBeanImpl messageBeanImpl() {
		return new MessageBeanImpl("사과");	
	}
	
	//sample02
	@Bean
	public CalcAdd calcAdd() {
		return new CalcAdd(30, 50);	
	}
	@Bean(name="calcMul") //Java문법
	public CalcMul getCalcMul() {
		return new CalcMul();	
		//생성자에 get 을 붙여서 setter 방식이라는걸 알려준다.
	}
	
	//sample05
	@Bean
	public List<SungJukDTO2> arrayList(){
		return new ArrayList<SungJukDTO2>();
		
	}

}

/*

@Bean 은 메소드 위에 써준다.

@Bean
메소드(){}

- return 되는 클래스를 빈으로 생성한다.
- 반드시 메소드의 이름은  id 명으로 설정해야 한다.

*/