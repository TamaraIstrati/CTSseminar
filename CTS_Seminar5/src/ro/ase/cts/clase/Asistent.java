package ro.ase.cts.clase;

public class Asistent extends PersonalSpital{

	public Asistent(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
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