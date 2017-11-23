package Threads;

public class Test {

	public static void main(String[] args) {

		Contador c1 = new Contador("Thread1");
		Contador c2 = new Contador("Thread2");

		c1.start();
		c2.start();
		
		VerificaEmail verifica = new VerificaEmail();
		verifica.start();

	}

}
