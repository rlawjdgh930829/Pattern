package factoryMethod.concrete;

import factoryMethod.framework.Item;
import factoryMethod.framework.ItemCreator;

public class Main {
	public static void main(String[] args) {
		
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		item.use();
		System.out.println();
		creator = new MpCreator();
		item = creator.create();
		item.use();
		
	}
}
