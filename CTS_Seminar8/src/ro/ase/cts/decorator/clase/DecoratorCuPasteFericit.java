package ro.ase.cts.decorator.clase;

public class DecoratorCuPasteFericit extends DecoratorAbstract{

	public DecoratorCuPasteFericit(INota nota) {
		super(nota);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printeaza() {
		// TODO Auto-generated method stub
		super.printeaza();
		System.out.println("Paste fericit!");
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("FELICITARE: Paste fericit!");
		
	}

}
