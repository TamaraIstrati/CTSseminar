package adapter.clase;

public class Bilet {
	private float pret;

	public Bilet(float pret) {
		super();
		this.pret = pret;
	}
	
	public void vindeClasic() {
		System.out.println("S-a vandut un bilet cu pretul de " + this.pret + " lei.");
	}
	
	public void rezervaClasic() {
		System.out.println("S-a rezervat un bilet cu pretul de " + this.pret + " lei.");
	}
}
