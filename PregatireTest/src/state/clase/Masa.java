package state.clase;

public class Masa {
	private IStare stare;
	private int nrMasa;
	
	public Masa(int nrMasa) {
		super();
		this.stare = new StareLibera();
		this.nrMasa = nrMasa;
	}
	public IStare getStare() {
		return stare;
	}
	public int getNrMasa() {
		return nrMasa;
	}
	public void setStare(IStare stare) {
		this.stare = stare;
	}
	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	};
	
	public void ocupaMasa() {
		StareOcupata stareOcupata = new StareOcupata();
		stareOcupata.modificaStare(this);
	}
	
	public void rezervaMasa() {
		StareRezervata stareRezervata = new StareRezervata();
		stareRezervata.modificaStare(this);
	}
	
	public void elibereazaMasa() {
		StareLibera stareLibera = new StareLibera();
		stareLibera.modificaStare(this);
	}
}
