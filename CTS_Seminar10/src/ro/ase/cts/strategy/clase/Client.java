package ro.ase.cts.strategy.clase;

public class Client {
	private IPlata tipPlata = new PlataCash();
	private String nume;
	public Client(String nume) {
		super();
		this.nume = nume;
	}
	public IPlata getTipPlata() {
		return tipPlata;
	}
	public void setTipPlata(IPlata tipPlata) {
		this.tipPlata = tipPlata;
	}
	
	public void plateste(float suma) {
		System.out.println("Clientul " + this.nume + " are de platit " + suma +" lei.");
		tipPlata.plateste(suma);
	}
}
