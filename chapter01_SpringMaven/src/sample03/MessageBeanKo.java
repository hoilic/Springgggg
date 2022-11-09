package sample03;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("messageBean") // id명을 Component("") 안에 넣으면 된다.
@Scope("prototype") // scope ="prototype" 를 여기에 써주면 된다.
public class MessageBeanKo implements MessageBean {
	private int num;//필드, 초기화
	
	public MessageBeanKo() {
		System.out.println("MessageBeanKo 기본 생성자");
	}
	@Override
	public void sayHello(String name) {
		num++;
		System.out.println("num = " + num);
		System.out.println("안녕하세요 " + name );
		
	}

}
