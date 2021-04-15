package ro.ase.cts.decorator.clase;

public class NotaDePlata implements INota{
	
	private int sumaDePlata;

	@Override
	public void printeaza() {
		System.out.println(String.format("S-a printat nota de plata cu suma %d", sumaDePlata));
		
	}

	public NotaDePlata(int sumaDePlata) {
		super();
		this.sumaDePlata = sumaDePlata;
	}
	
}
