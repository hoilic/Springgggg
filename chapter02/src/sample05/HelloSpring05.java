package sample05;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpring05 {
	private static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
	public static void main(String[] args) {
		HelloSpring05 helloSpring05 = (HelloSpring05)context.getBean("helloSpring05");
		helloSpring05.menu();
	}
	
	public void menu() { //메뉴함수 만들기
		Scanner scan = new Scanner(System.in);
		int num;
		SungJuk sungJuk = null; 
		// 지역변수 이기 때문에 초기값을 설정하여 
		
		while(true) {
			System.out.println();
			System.out.println("***************");
			System.out.println("   1. 입력 ");
			System.out.println("   2. 출력 ");
			System.out.println("   3. 수정 ");
			System.out.println("   4. 삭제 ");
			System.out.println("   5. 끝 ");
			System.out.println("***************");
			System.out.print("   번호 :  ");
			num = scan.nextInt();
			if(num == 5) break;
			
			if(num == 1) {
				sungJuk = (SungJuk)context.getBean("sungJukInput");
				//1번을 누르면 SungJukInsert 가 생성되서 sungJuk에 담음

			}
			else if(num ==2){
				sungJuk = (SungJuk)context.getBean("sungJukOutput");

			}
			else if(num ==3) {
				sungJuk = (SungJuk)context.getBean("sungJukModify");
			}
			else if(num ==4) {
				sungJuk = (SungJuk)context.getBean("sungJukDelete");
			}
			
			sungJuk.execute();
			
		
			
		}// while	
		
	}// menu

}
