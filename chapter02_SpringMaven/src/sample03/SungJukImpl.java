package sample03;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // xml 에서 component 방식을 하겠다.
public class SungJukImpl implements SungJuk {
	@Autowired
	private SungJukDTO sungJukDTO = null; // DTO에 만들어 놓은 객체들을 DTO 에 담아옴
	
	/*
	@Autowired //property,constructor-arg 안쓰고 context:component-scan 을 쓰려고!!!
	public SungJukImpl(SungJukDTO sungJukDTO) {
		this.sungJukDTO = sungJukDTO;
	}
	*/
	@Override
	public void calcTot() {
		//sungJukDTO.setTot( sungJukDTO.getKor()+ sungJukDTO.getEng() + sungJukDTO.getMath());		
		int a = sungJukDTO.getKor()+ sungJukDTO.getEng() + sungJukDTO.getMath();
		sungJukDTO.setTot(a);
	}

	@Override
	public void calcAvg() {
		sungJukDTO.setAvg( sungJukDTO.getTot()/3.0);		
		
	}

	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		//System.out.println(sungJukDTO);
		
		
		System.out.println(sungJukDTO.getName()+"\t"
							+sungJukDTO.getKor()+"\t"
							+sungJukDTO.getEng()+"\t"
							+sungJukDTO.getMath()+"\t"
							+sungJukDTO.getTot()+"\t"
							+String.format("%.3f", sungJukDTO.getAvg())
							);
							
	}

	@Override
	public void modify() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		sungJukDTO.setName(scan.next());
			
		System.out.print("국어 입력 : ");
		sungJukDTO.setKor(scan.nextInt());
		
		System.out.print("영어 입력 : ");
		sungJukDTO.setEng(scan.nextInt());
	
		System.out.print("수학 입력 : ");
		sungJukDTO.setMath(scan.nextInt());
	
		
		
	}

}
