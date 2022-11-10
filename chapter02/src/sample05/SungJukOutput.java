package sample05;

import java.util.ArrayList;

import lombok.Data;

@Data
public class SungJukOutput implements SungJuk {
	private SungJukDTO2 sungJukDTO2;
	private ArrayList<SungJukDTO2> list;
	
	@Override
	public void execute() {
		System.out.println();
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
	
		for(SungJukDTO2 sungJukDTO2 : list) {
			System.out.println(sungJukDTO2.toString());
			//.toString() 생략 가능  : 주소값을 가져온다
		
		}

	}

}
