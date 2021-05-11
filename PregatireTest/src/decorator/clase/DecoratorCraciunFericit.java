package decorator.clase;

public class DecoratorCraciunFericit extends DecoratorAbstract{

	public DecoratorCraciunFericit(INotaDePlata notaDePlata) {
		super(notaDePlata);
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("FELICITARE: Craciun fericit!!!");
	}

	@Override
	public void printeaza() {
		super.printeaza();
		System.out.println("Craciun fericit!");
	}

}
