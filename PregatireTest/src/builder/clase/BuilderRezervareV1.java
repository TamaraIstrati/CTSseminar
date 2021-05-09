package builder.clase;

public class BuilderRezervareV1 implements AbstractBuilder{
	private Rezervare rezervare;

	public BuilderRezervareV1() {
		super();
		this.rezervare = new Rezervare(0, false, false, false, false,"");
	}

	public BuilderRezervareV1 addCodRezervare(int codRezervare) {
		this.rezervare.setCodRezervare(codRezervare);
		return this;
	}
	public BuilderRezervareV1 addAreMancare(boolean areMancare) {
		this.rezervare.setAreMancare(areMancare);
		return this;
	}
	public BuilderRezervareV1 addAreScaunErgonomic(boolean areScaunErgonomic) {
		this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}
	public BuilderRezervareV1 addAreBautura(boolean areBautura) {
		this.rezervare.setAreBautura(areBautura);
		return this;
	}
	public BuilderRezervareV1 addAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}
	public BuilderRezervareV1 addGenMuzica(String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}


	@Override
	public Rezervare build() {
		return rezervare;
	}
	
}
