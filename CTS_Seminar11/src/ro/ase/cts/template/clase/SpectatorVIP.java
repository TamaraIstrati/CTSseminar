package ro.ase.cts.template.clase;

public class SpectatorVIP extends SpectatorAbstract{
	private String nume;

	public SpectatorVIP(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareLaCoada() {
		System.out.println("Spectatorul VIP " + this.nume + " nu a stat in coada.");
	}

	@Override
	public void prezentareBilet() {
		System.out.println("Spectatorul VIP " + this.nume + " a prezentat biletul.");
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println("Spectatorul VIP " + this.nume + " a fost controlat.");
	}

	@Override
	public void ocupareLoc() {
		System.out.println("Spectatorul VIP " + this.nume + " a ocupat locul VIP.");
	}

}
