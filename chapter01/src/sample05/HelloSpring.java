package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample04.CalcAdd;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SungJukImpl sungJukImpl = (SungJukImpl) context.getBean("sungJukImpl"); //자식 = 부모
		sungJukImpl.calc();
		sungJukImpl.display();
		System.out.println();

	}

}
