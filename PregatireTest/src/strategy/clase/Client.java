package strategy.clase;

public class Client {
	private IPlata modPlata;
	private String nume;

	public Client(String nume) {
		super();
		this.nume = nume;
	}

	public void setModPlata(IPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	public void platesteSuma(float suma) {
		if(this.modPlata != null) {
			System.out.println("Clientul " + this.nume + " are de platit suma de " + suma + " lei...");
			this.modPlata.plateste(suma);
		} else {
			throw new UnsupportedOperationException();
		}
	}
}
