package enumeraveis;

public class Person {

	enum Gender {
		Male, Female
	};

	private Gender gender;

	public Person(Gender gender) {
		super();
		this.gender = gender;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
