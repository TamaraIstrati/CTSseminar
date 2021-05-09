package simpleFactory.clase;

public class Medic extends PersonalSpital{

	public Medic(String nume) {
		super(nume);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medic [");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
