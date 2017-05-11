package World;

public enum Planet {
	
	/**
	 * Defini��o das enumera��es passando os parametros em float.
	 */
	Marte(7.5f, 5.6f), Terra(12.7f, 9.5f), Saturno(19.7f, 15.5f);
	
	/**
	 * Defini��o dos atributos da Classe Planet.
	 */
	private final float radius;
	private final float gravity;
	
	/**
	 * M�todo Construtor Planet passando os par�metros radius e gravity.
	 */
	private Planet(float radius, float gravity) {
		this.radius = radius;
		this.gravity = gravity;
	}
	
	/**
	 *  M�todo para retornar radius e gravity.
	 */
	public float getRadius() {
		return radius;
	}

	public float getGravity() {
		return gravity;
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}
}
