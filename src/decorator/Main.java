package decorator;
// 데코레이터 패턴
// 어떤 기능에 추가적으로 기능을 덧붙이고 싶은 경우 사용

import decorator.sandwich.Bread;
import decorator.sandwich.Sandwich;
import decorator.topping.LettuceDecorator;
import decorator.topping.PickleDecorator;

public class Main {
	
	public static void main(String[] args) {
		
		Sandwich sandwichWithLettuce = new LettuceDecorator(new Bread());
		sandwichWithLettuce.make();
		
		System.out.println();
		Sandwich sandwichWithLettuceAndPickle1 = new PickleDecorator(sandwichWithLettuce);
		sandwichWithLettuceAndPickle1.make();
		Sandwich sandwichWithLettuceAndPickle2 = new PickleDecorator(new LettuceDecorator(new Bread()));
		sandwichWithLettuceAndPickle2.make();
		
	}

}
