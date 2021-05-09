package ro.ase.cts.simpleFactory.clase;

public class Infirmier extends PersonalSpital{

	public Infirmier(String nume) {
		super(nume);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Infirmier: ");
		builder.append(super.getNume());
		builder.append("\n");
		return builder.toString();
	}

	
}
