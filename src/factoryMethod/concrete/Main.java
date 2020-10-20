package factoryMethod.concrete;

import factoryMethod.framework.Item;
import factoryMethod.framework.ItemCreator;
import factoryMethod.framework.ItemFactory;

public class Main {
	public static void main(String[] args) {
		
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		item.use();
		creator = new MpCreator();
		item = creator.create();
		item.use();
		System.out.println();
		
		// itemFactory를 사용
		ItemFactory factory = new PotionFactory();
		item = factory.create("체력");
		item.use();
		item = factory.create("마력");
		item.use();
	}
}
