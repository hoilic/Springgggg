package sample04;

import org.springframework.stereotype.Component;

@Component("calcAdd") // class 명과 id 명이 같으면 ("calcAdd")생략 가능하다.
public class CalcAdd implements Calc {
	public CalcAdd() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculate(int x, int y) {
		System.out.println(x +"+"+ y +"=" +(x+y) );
		
	}
}
