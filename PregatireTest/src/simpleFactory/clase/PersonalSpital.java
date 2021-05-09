package simpleFactory.clase;

public abstract class PersonalSpital {
	private String nume;

	public PersonalSpital(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("nume=");
		builder.append(nume);
		return builder.toString();
	};
	
}
