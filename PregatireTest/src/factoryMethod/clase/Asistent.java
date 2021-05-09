package factoryMethod.clase;

public class Asistent extends PersonalSpital{

	public Asistent(String nume) {
		super(nume);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Asistent [");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
