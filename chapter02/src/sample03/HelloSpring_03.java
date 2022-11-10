package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring_03 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*
		SungJukImpl sungJukImpl = (SungJukImpl) context.getBean("sungJukImpl"); //자식 = 부모
		SungJukDTO sungJukDTO = (SungJukDTO) context.getBean("sungJukDTO"); //자식 = 부모
		*/
		
		SungJuk sungJuk = (SungJuk)context.getBean("sungJukImpl"); //자식 = 부모
		
		sungJuk.calcTot();
		sungJuk.calcAvg();
		sungJuk.display();
		
		sungJuk.modify();
		sungJuk.calcTot();
		sungJuk.calcAvg();
		sungJuk.display();
		System.out.println();

	}


}
