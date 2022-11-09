package sample04;

public class CalcAdd implements Calc {
	public CalcAdd() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculate(int x, int y) {
		System.out.println(x +"+"+ y +"=" +(x+y) );
		
	}
}
