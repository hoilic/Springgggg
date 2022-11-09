package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
				ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				CalcAdd calcAdd = (CalcAdd) context.getBean("calcAdd"); //자식 = 부모
				calcAdd.calculate(25,36);
				System.out.println();
				
				CalcMul calcMul = (CalcMul) context.getBean("calcMul", CalcMul.class); //자식 = 부모
				calcMul.calculate(25,36);
				System.out.println();

	}

}
