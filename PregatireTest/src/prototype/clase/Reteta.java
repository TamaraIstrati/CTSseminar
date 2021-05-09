package prototype.clase;

public abstract class Reteta{
	private String Denumire;
	private int cantitateSubstActiva;

	public Reteta(String denumire, int cantitateSubstActiva) {
		super();
		Denumire = denumire;
		this.cantitateSubstActiva = cantitateSubstActiva;
	}
	
	protected Reteta() {
		super();
	}

	public String getDenumire() {
		return Denumire;
	}

	public int getCantitateSubstActiva() {
		return cantitateSubstActiva;
	}

	public void setDenumire(String denumire) {
		Denumire = denumire;
	}

	public void setCantitateSubstActiva(int cantitateSubstActiva) {
		this.cantitateSubstActiva = cantitateSubstActiva;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Denumire=");
		builder.append(Denumire);
		builder.append(", cantitateSubstActiva=");
		builder.append(cantitateSubstActiva);
		return builder.toString();
	}
	
	
}
