package ro.ase.cts.command.clase;

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
		if(this.esteOcupata == false && this.esteRezervata==false) {
			System.out.println("Masa poate fi ocupata");
			this.esteOcupata = true;
		} else {
			System.out.println("Masa nu poate fi ocupata");
		}
	}
	
	public void rezervaMasa() {
		if(this.esteOcupata == false && this.esteRezervata==false) {
			System.out.println("Masa poate fi rezervata");
			this.esteRezervata = true;
		} else {
			System.out.println("Masa nu poate fi rezervata");
		}
	}
	
}
