package sample01;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor // 내가 요청한 애들만 생성자 만들겠다.
public class MessageBeanImpl implements MessageBean {
	@NonNull
	private String fruit; //Constructor Injection
	@Setter //여기에 두면 cost qty 만 setter 가 만들어짐
	private int cost, qty; // Setter Injection 
	
	/*
	public MessageBeanImpl(String fruit) {
		this.fruit = fruit;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}
	 */

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
