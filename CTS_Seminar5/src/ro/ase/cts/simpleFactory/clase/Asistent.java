package ro.ase.cts.simpleFactory.clase;

public class Asistent extends PersonalSpital{

	public Asistent(String nume) {
		super(nume);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Asistent: ");
		builder.append(super.getNume());
		builder.append("\n");
		return builder.toString();
	}

} 
