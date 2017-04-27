package stactic1;

public class Main {

	public static void main(String[] args) {

		Client c1 = new Client("Fabricio");
		Client c2 = new Client("Claudio");
		Client c3 = new Client();
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());

		if (80 > Client.MIN_SCORE) {
			// passou de fase
		} else {
		// continua tentando
		}

	}

}
