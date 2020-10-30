package builder;

public class ComputerBuilder1 {
	
	private Computer computer;
	
	private ComputerBuilder1() {
		computer = new Computer("default", "default", "default");
	}

	public static ComputerBuilder1 start() {
		return new ComputerBuilder1();
	}

	public ComputerBuilder1 setCpu(String cpu) {
		computer.setCpu(cpu);
		return this;
	}

	public ComputerBuilder1 setRam(String ram) {
		computer.setRam(ram);
		return this;
	}

	public ComputerBuilder1 setStorage(String storage) {
		computer.setStorage(storage);
		return this;
	}

	public Computer build() {
		return this.computer;
	}
	
}
