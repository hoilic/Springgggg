package sample01;

import org.springframework.stereotype.Component;

@Component
public interface MessageBean {
	//추상메소드 3가지 생성
	public void sayHello();
	public void sayHello(String fruit, int cost);
	public void sayHello(String fruit, int cost, int qty);
	
}