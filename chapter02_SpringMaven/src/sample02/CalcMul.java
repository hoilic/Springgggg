package sample02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component 컴포넌트 안한다고 했으닌까 xml 에 안쓰고 Configuration java 파일을 만들어서 사용
public class CalcMul implements Calc {
	private int x, y;

	@Autowired
	public void setX(@Value("25")int x) {
		this.x = x;
	}

	@Autowired
	public void setY(@Value("36")int y) {
		this.y = y;
	}


	@Override
	public void calculate() {
		System.out.println(x +"*"+ y +"=" +(x*y));
		
	}
}
