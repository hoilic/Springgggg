package sample04;

import org.springframework.stereotype.Component;

@Component
public class CalcMul implements Calc {
	public CalcMul() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculate(int x, int y) {
		System.out.println(x +"*"+ y +"=" +(x*y));
		
	}
}
