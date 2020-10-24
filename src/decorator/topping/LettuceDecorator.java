package decorator.topping;

import decorator.sandwich.Sandwich;

public class LettuceDecorator extends ToppingDecorator {

	public LettuceDecorator(Sandwich sandwich) {
		super(sandwich); // 받은 객체를 super()를 통해 부모 생성자에게 넘겨줌
	}
	
	public void make() {
		super.make(); // super를 통해 부모 클래스의 make()메소드를 호출
		addLettuce();
	}
	
	private void addLettuce() {
		 System.out.println(" + 양상추");
	}
	
}
