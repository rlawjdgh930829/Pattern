package builder;

public class ComputerBuilder2 {
	
	private String cpu;
	private String ram;
	private String storage;

	public static ComputerBuilder2 start() {
		return new ComputerBuilder2();
	}

	public ComputerBuilder2 setCpu(String cpu) {
		this.cpu = cpu;
		return this;
	}

	public ComputerBuilder2 setRam(String ram) {
		this.ram = ram;
		return this;
	}

	public ComputerBuilder2 setStorage(String storage) {
		this.storage = storage;
		return this;
	}

	public Computer build() {
		return new Computer(cpu, ram, storage);
	}
	
}
