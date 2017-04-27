package polimorfismo;

public class Professor extends Employee {

	/**
	 * Atributos ou variáveis da classe Professor.
	 */
	private float hoursMontly;
	private float hoursValue;

	/**
	 * Construtor da classe Professor. Recebendo ou Herdando propriedades da
	 * classe Employee pelo super.
	 */
	public Professor(String name, float hoursMontly, float hoursValue) {
		super(name);
		this.hoursMontly = hoursMontly;
		this.hoursValue = hoursValue;
	}

	/**
	 * Métodos getters e setters
	 */
	public float getHoursMontly() {
		return hoursMontly;
	}

	public void setHoursMontly(float hoursMontly) {
		this.hoursMontly = hoursMontly;
	}

	public float getHoursValue() {
		return hoursValue;
	}

	public void setHoursValue(float hoursValue) {
		this.hoursValue = hoursValue;
	}
	
	@Override
	public float getSalary() {
		return hoursMontly * hoursValue;
	}
	
	@Override
	public String toString() {
		return getName() + " "+ getSalary();
	}
	
}
