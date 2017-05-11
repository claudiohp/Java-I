package World;

public class Main {

	public static void main(String[] args) {

		/**
		 * Imprimir em tela os parâmetros dos três planetas.
		 */
		Country p = new Country(Planet.Marte, "PX9N");
		System.out.println(p.toString() + " Gravidade: " + p.getPlanet().getGravity() + " Raio: " + p.getPlanet().getRadius());

		Country a = new Country(Planet.Terra, "Brasil");
		System.out.println(a.toString() + " Gravidade: " + a.getPlanet().getGravity() + " Raio: " + a.getPlanet().getRadius());

		Country b = new Country(Planet.Saturno, "8WEWE");
		System.out.println(b.toString() + " Gravidade: " + b.getPlanet().getGravity() + " Raio: " + b.getPlanet().getRadius());
	
	}
}
