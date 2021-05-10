package composite.clase;

public abstract class InstitutieBancara {
	public abstract void afisareDescriere();
	public abstract void addNod(InstitutieBancara nod) throws UnsupportedOperationException;
	public abstract void deleteNod(InstitutieBancara nod) throws UnsupportedOperationException;
	public abstract InstitutieBancara getNod(int poz) throws UnsupportedOperationException;
}
