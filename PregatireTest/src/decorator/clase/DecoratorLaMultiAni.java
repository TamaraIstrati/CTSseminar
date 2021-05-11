package decorator.clase;

public class DecoratorLaMultiAni extends DecoratorAbstract{

	public DecoratorLaMultiAni(INotaDePlata notaDePlata) {
		super(notaDePlata);
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("FELICITARE: La multi ani!!!");
	}

	@Override
	public void printeaza() {
		super.printeaza();
		System.out.println("La multi ani!");
	}
	
}
