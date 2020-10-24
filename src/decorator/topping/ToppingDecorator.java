package decorator.topping;

import decorator.sandwich.Sandwich;

public class ToppingDecorator extends Sandwich {
	
	private Sandwich sandwich;
	
	public ToppingDecorator(Sandwich sandwich) {
		this.sandwich = sandwich;
	}

	@Override
	public void make() {
		sandwich.make();
	}

}
