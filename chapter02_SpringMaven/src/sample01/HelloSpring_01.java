package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring_01 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MessageBean messageBean = (MessageBeanImpl)context.getBean("messageBeanImpl");
		
		messageBean.sayHello();
		messageBean.sayHello("딸기", 10000);
		messageBean.sayHello("바나나", 3000, 10);
	}

}
