package decorator.topping;

import decorator.sandwich.Sandwich;

public class PickleDecorator extends ToppingDecorator {

	public PickleDecorator(Sandwich sandwich) {
		// 받은 객체: LettuceDecorator
		super(sandwich);
	}
	
	public void make() {
		super.make(); // 이 떄의 super.make()는 LettuceDecorator의 make()를 호출한 결과
		addPickle();
	}
	
	private void addPickle() {
		System.out.println(" + 피클");
	}
	
}
