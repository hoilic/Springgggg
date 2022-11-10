package sample05;

import java.util.ArrayList;
import java.util.Scanner;

import lombok.Data;

@Data
public class SungJukInput implements SungJuk {
	
	private SungJukDTO2 sungJukDTO2;
	private ArrayList<SungJukDTO2> list;


	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		

		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("국어 입력 : ");
		int kor = scan.nextInt();
		System.out.print("영어 입력 : ");
		int eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		int math = scan.nextInt();
		
		 sungJukDTO2.setName(name);
		 sungJukDTO2.setKor(kor);
		 sungJukDTO2.setEng(eng);
		 sungJukDTO2.setMath(math);
		 
		 list.add(sungJukDTO2);
	}

}
