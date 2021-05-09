package simpleFactory.clase;

public class Brancardier extends PersonalSpital{

	public Brancardier(String nume) {
		super(nume);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brancardier [");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
