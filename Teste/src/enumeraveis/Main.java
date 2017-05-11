package enumeraveis;

import enumeraveis.Person.Gender;

public class Main {

	public static void main(String[] args) {
		new Person(Gender.Male);
		System.out.println(Gender.Male);
		System.out.println(Gender.Female);
	}
}
