package composite.clase;

public class Filiala extends InstitutieBancara{
	private String nume;

	public Filiala(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void afisareDescriere() {
		System.out.println("Filiala " + this.nume);
	}

	@Override
	public void addNod(InstitutieBancara nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteNod(InstitutieBancara nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public InstitutieBancara getNod(int poz) {
		throw new UnsupportedOperationException();
	}

}
