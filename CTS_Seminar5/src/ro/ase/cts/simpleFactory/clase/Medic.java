package ro.ase.cts.simpleFactory.clase;

public class Medic extends PersonalSpital{

	public Medic(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medic: ");
		builder.append(super.getNume());
		builder.append("\n");
		return builder.toString();
	}
}
