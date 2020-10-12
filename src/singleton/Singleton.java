package singleton;

public class Singleton {
	// 하나의 인스턴스만 존재해야 할 경우 사용
	// Singleton클래스 로딩시 LazyHolder클래스 초기화X
	// LazyHolder클래스는 Singleton의 getInstnace()메서드에서 LazyHolder.INSTANCE를 참조할 떄 로딩 및 초기화
	private Singleton() {}
	
	public static Singleton getInstnace() {
		return LazyHolder.INSTANCE;
	}
	
	private static class LazyHolder {
		private static final Singleton INSTANCE = new Singleton();
	}
	
}
