package ro.ase.cts.simpleFactory.clase;

public class Brancardier extends PersonalSpital{

	public Brancardier(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brancardier: ");
		builder.append(super.getNume());
		builder.append("\n");
		return builder.toString();
	}

	
}
