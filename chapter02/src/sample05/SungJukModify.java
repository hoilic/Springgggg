package sample05;

import java.util.ArrayList;
import java.util.Scanner;

import lombok.Data;
@Data
public class SungJukModify implements SungJuk {
	private SungJukDTO2 sungJukDTO2;
	private ArrayList<SungJukDTO2> list;

	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수정할 이름 입력 : ");
		String name = scan.next();
		
	
		for(SungJukDTO2 sungJukDTO2 : list) {
			if(!sungJukDTO2.getName().equals(name)) { // 번호 입니까? 맞다면 아래 출력					
			}//if
			else if(sungJukDTO2.getName().equals(name)) {
				System.out.println();
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(sungJukDTO2);
				
				System.out.println();
			
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
				
				sungJukDTO2.calc();
				
				System.out.println(name +"님의 데이터를 수정 하였습니다.");
				return;
			}
			
		}//for
		System.out.println("찾고자하는 이름이 없습니다.");	
		
		
	

	}

}
