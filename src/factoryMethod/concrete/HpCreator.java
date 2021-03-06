package factoryMethod.concrete;

import java.util.Date;

import factoryMethod.framework.Item;
import factoryMethod.framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("DB에서 체력 회복 물약에 대한 정보를 가져옴");
	}

	@Override
	protected void createItemLog() {
		System.out.println("체력 회복 물약을 생성 " + new Date());
	}

	@Override
	protected Item createItem() {
		return new HpPotion();
	}

}
