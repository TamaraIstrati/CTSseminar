package builder.clase;

public class BuilderRezervareV2 implements AbstractBuilder{
	private int codRezervare;
	private boolean areMancare;
	private boolean areScaunErgonomic;
	private boolean areBautura;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	
	
	
	public BuilderRezervareV2() {
		super();
		this.codRezervare = 0;
		this.areMancare = false;
		this.areScaunErgonomic = false;
		this.areBautura = false;
		this.areMuzicaAmbientala = false;
		this.genMuzica = "";
	}
	
	public BuilderRezervareV2 addCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}
	public BuilderRezervareV2 addAreMancare(boolean areMancare) {
		this.areMancare = areMancare;
		return this;
	}
	public BuilderRezervareV2 addAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}
	public BuilderRezervareV2 addAreBautura(boolean areBautura) {
		this.areBautura = areBautura;
		return this;
	}
	public BuilderRezervareV2 addAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		return this;
	}
	public BuilderRezervareV2 addGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}
	
	@Override
	public Rezervare build() {
		Rezervare r = new Rezervare(codRezervare, areMancare, areScaunErgonomic, areBautura, areMuzicaAmbientala, genMuzica);
		this.codRezervare = 0;
		this.areMancare = false;
		this.areScaunErgonomic = false;
		this.areBautura = false;
		this.areMuzicaAmbientala = false;
		this.genMuzica = "";
		return r;
	}
	
	
}
