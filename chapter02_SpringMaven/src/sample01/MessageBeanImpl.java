package sample01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageBeanImpl implements MessageBean {

	private String fruit;

	private int cost, qty;
	
	
	public MessageBeanImpl(@Value("사과") String fruit) {
		this.fruit = fruit;
	}

	@Autowired //알아서 연결해라
	public void setCost(@Value("5000")int cost) {
		this.cost = cost;
	}

	@Autowired //알아서 연결해라
	public void setQty(@Value("3")int qty) {
		this.qty = qty;
	}
	

	@Override
	public void sayHello() {
		System.out.println(fruit +"\t"+cost+"\t"+qty);
		
	}

	@Override
	public void sayHello(String fruit, int cost) {
		System.out.println(fruit +"\t"+cost+"\t"+qty);
		
	}

	@Override
	public void sayHello(String fruit, int cost, int qty) {
		System.out.println(fruit +"\t"+cost+"\t"+qty);
		
	}

}
