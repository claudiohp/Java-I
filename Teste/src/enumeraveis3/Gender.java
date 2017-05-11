package enumeraveis3;

public enum Gender {
	
	Male("M"),
	Female("F");
	
	private final String value;
	
	private Gender(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}	
