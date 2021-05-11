package command.clase;

public class Masa {
	private int nrMasa;
	private boolean esteOcupata;
	private boolean esteRezervata;
	
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.esteOcupata = false;
		this.esteRezervata = false;
	}
	
	public void ocupaMasa() {
		if(this.esteOcupata) {
			System.out.println("Masa " + this.nrMasa + " este deja ocupata.");
		} else {
			this.esteOcupata = true;
			System.out.println("Masa " + this.nrMasa + " s-a ocupat.");
		}
	}
	
	public void rezervaMasa() {
		if(this.esteOcupata || this.esteRezervata) {
			System.out.println("Masa " + this.nrMasa + " este deja ocupata/rezervata.");
		} else {
			this.esteRezervata = true;
			System.out.println("Masa " + this.nrMasa + " s-a rezervat.");
		}
	}
}
