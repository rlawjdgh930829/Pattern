package factoryMethod.framework;
// 템플릿 메소드와 차이점: 템플릿 메소드는 상속을 통해 부모 클래스의 확장을 위해 사용

// 팩토리 메소드
// 부모 클래스에서 무엇을 생성할지 정하지 않고 자식 클래스에게 어떤 객체 생성할지 결정
public abstract class ItemFactory {
	
	public Item create(String name) {
		Item item;
		
		requestItemsInfo(name);
		item = createItem(name);
		createItemLog(name);
		
		return item;
	}

	// private를 사용할 경우에는 하위 클래스에서 재정의를 하기위해 접근을 못하기 떄문에 protected를 사용
	// 알고리즘의 단계를 외부에 노출시키지 않기 위해 사용
	abstract protected void requestItemsInfo(String name);
	abstract protected void createItemLog(String name);
	abstract protected Item createItem(String name);
	
}
