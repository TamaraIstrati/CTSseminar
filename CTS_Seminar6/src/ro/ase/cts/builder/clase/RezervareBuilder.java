package ro.ase.cts.builder.clase;

public class RezervareBuilder implements AbstractBuilder{
	private Rezervare rezervare;
	

	public RezervareBuilder() {
		super();
		this.rezervare = new Rezervare(0, false, false, false, false, "undef");
	}
	
	public RezervareBuilder(int codRezervare) {
		super();
		this.rezervare = new Rezervare(codRezervare, false, false, false, false, "");
	}

	public RezervareBuilder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}
	
	public RezervareBuilder setAreMancare(boolean areMancare) {
		rezervare.setAreMancare(areMancare);
		return this;
	}
	
	public RezervareBuilder setAreScaun(boolean areScaun) {
		rezervare.setAreScaunErgonomic(areScaun);
		return this;
	}
	
	public RezervareBuilder setAreBautura(boolean areBautura) {
		rezervare.setAreBautura(areBautura);
		return this;
	}
	
	public RezervareBuilder setAreMuzica(boolean areMuzica) {
		rezervare.setAreMuzicaAmbientala(areMuzica);
		return this;
	}
	
	public RezervareBuilder setGenMuzica(String gen) {
		rezervare.setGenMuzica(gen);
		return this;
	}
	
	@Override
	public Rezervare build() {
		return rezervare;
	}

	
}
