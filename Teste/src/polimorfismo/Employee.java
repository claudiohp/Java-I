package polimorfismo;

// propriedades - tipo de dados
public class Employee {

	/**
	 * Atributos da classe employee.
	 */
	private String name;

	/**
	 * M�todo construtor de Employee recebendo parametros nome e salario.
	 */
	public Employee(String name) {
		super();
		this.name = name;
	}

	/**
	 * M�todos getters e setters
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return 0;
	}
	
}
