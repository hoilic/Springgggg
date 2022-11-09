package sample02;

public class HelloSpring {

	public static void main(String[] args) {
		//MessageBean messageBean = new MessageBean(); //객체생성 + 생성자
		
		MessageBean messageBean = new MessageBeanKo(); //결합도 낮추기, 다형성(부모 = 자식)
		
		messageBean.sayHello("Spring");
	}

}
