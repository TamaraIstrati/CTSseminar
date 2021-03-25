package ro.ase.cts.clase;

public class Reteta implements PrototipAbstract{
	private String denumireSolutie;
	private int cantitateSolutie;
	
	public Reteta(String denumireSolutie, int cantitateSolutie) {
		//validari
		super();
		this.denumireSolutie = denumireSolutie;
		this.cantitateSolutie = cantitateSolutie;
	}
	
	
	private Reteta() {
		//nu se mai fac validari
		super();
	}


	public String getDenumireSolutie() {
		return denumireSolutie;
	}

	public int getCantitateSolutie() {
		return cantitateSolutie;
	}

	public void setDenumireSolutie(String denumireSolutie) {
		this.denumireSolutie = denumireSolutie;
	}

	public void setCantitateSolutie(int cantitateSolutie) {
		this.cantitateSolutie = cantitateSolutie;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reteta [denumireSolutie=");
		builder.append(denumireSolutie);
		builder.append(", cantitateSolutie=");
		builder.append(cantitateSolutie);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public PrototipAbstract copiaza() {
		Reteta copie = new Reteta();
		copie.cantitateSolutie = this.cantitateSolutie;
		copie.denumireSolutie=this.denumireSolutie;
		return copie;
	}
	
	
}
