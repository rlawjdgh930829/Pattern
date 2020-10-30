package builder;

public class Main {
	
	public static void main(String[] args) {
		
		Computer computer1 = ComputerBuilder1
				.start()
				.setCpu("i7")
				.setRam("16g")
				.setStorage("516gb")
				.build();
		System.out.println(computer1.toString());
		
		Computer computer2 = ComputerBuilder2
				.start()
				.setCpu("i7")
				.setRam("16g")
				.setStorage("516gb")
				.build();
		System.out.println(computer2.toString());
		
	}
	
}
