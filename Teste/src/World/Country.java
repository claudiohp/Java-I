package World;

public class Country {

	/**
	 * Classe Planet com atributo name;
	 */
	private Planet planet;
	private String name;

	/**
	 * Método construtor da Classe Country passando parametro name.
	 */
	public Country(Planet planet, String name) {
		super();
		this.planet = planet;
		this.name = name;
	}

	public Planet getPlanet() {
		return planet;
	}

	public void setPlanet(Planet planet) {
		this.planet = planet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Método getters e setters para name.
	 * 
	 */
	
	@Override
	public String toString() {
	
		return "Nome: " + this.getName();
	}
}
