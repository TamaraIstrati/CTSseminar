package flyweight.clase;

import java.time.LocalDateTime;

public class Rezervare {
	private int nrMasa;
	private int nrPersoane;
	private LocalDateTime ora;
	
	public Rezervare(int nrMasa, int nrPersoane, LocalDateTime ora) {
		super();
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
		this.ora = ora;
	}

	public int getNrMasa() {
		return nrMasa;
	}

	public int getNrPersoane() {
		return nrPersoane;
	}

	public LocalDateTime getOra() {
		return ora;
	}

	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}

	public void setNrPersoane(int nrPersoane) {
		this.nrPersoane = nrPersoane;
	}

	public void setOra(LocalDateTime ora) {
		this.ora = ora;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [nrMasa=");
		builder.append(nrMasa);
		builder.append(", nrPersoane=");
		builder.append(nrPersoane);
		builder.append(", ora=");
		builder.append(ora);
		builder.append("]");
		return builder.toString();
	}
	
}
