package heranca;

public class Notebook extends Computador {

	private int bateria;

	public Notebook(float cpu, int ram, int bateria) {
		super(cpu, ram);
		this.bateria = bateria;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

}
