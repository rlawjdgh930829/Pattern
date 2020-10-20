package factoryMethod.concrete;

import java.util.Date;

import factoryMethod.framework.Item;
import factoryMethod.framework.ItemFactory;

public class PotionFactory extends ItemFactory {

	@Override
	protected void requestItemsInfo(String name) {
		System.out.println("DB에서 " + name + " 회복 물약에 대한 정보를 가져옴");
	}

	@Override
	protected void createItemLog(String name) {
		System.out.println(name + " 회복 물약을 생성 " + new Date());
	}

	@Override
	protected Item createItem(String name) {
		switch (name) {
		case "체력": return new HpPotion();
		case "마력": return new MpPotion();
		}
		return null;
	}

}
