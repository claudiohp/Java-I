package heranca;

public class Computador {

	private float cpu;
	private int ram;

	public Computador(float cpu, int ram) {
		super();
		this.cpu = cpu;
		this.ram = ram;
	}

	public float getCpu() {
		return cpu;
	}

	public void setCpu(float cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

}
