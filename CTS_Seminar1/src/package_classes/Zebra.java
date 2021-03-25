package package_classes;

public class Zebra extends Animal{
	private int varsta;
	
	public Zebra(String name) {
		super(name);
		this.setVarsta(5);
	}

	public Zebra(String name, int varsta) {
		super(name);
		this.setVarsta(varsta);
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

}
