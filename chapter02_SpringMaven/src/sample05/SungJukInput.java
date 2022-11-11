package sample05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Scope("prototype")
@Data
public class SungJukInput implements SungJuk {
	/*
	 스프링 컨테이너가 빈(@Component, @Bean)으로 생성된 것들중에서 SungJukDTO2 
	 타입을 찾아서 자동으로 주입해라 !!! 가 바로 @Autowired
	 */
	@Autowired
	private SungJukDTO2 sungJukDTO2;
	@Autowired
	@Qualifier("arrayList")
	//private ArrayList<SungJukDTO2> list;
	private List<SungJukDTO2> list;

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

		int tot = kor + eng + math;
		double avg = (double) tot / 3;

		// DB 작업

		// 응답

		sungJukDTO2.setName(name);
		sungJukDTO2.setKor(kor);
		sungJukDTO2.setEng(eng);
		sungJukDTO2.setMath(math);
		sungJukDTO2.setTot(tot);
		sungJukDTO2.setAvg(avg);

		list.add(sungJukDTO2);
		System.out.println(list);
	}

}
