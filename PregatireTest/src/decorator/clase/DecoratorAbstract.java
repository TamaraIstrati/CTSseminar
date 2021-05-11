package decorator.clase;

public abstract class DecoratorAbstract implements INotaDePlata{
	private INotaDePlata notaDePlata;

	public DecoratorAbstract(INotaDePlata notaDePlata) {
		super();
		this.notaDePlata = notaDePlata;
	}
	
	@Override
	public void printeaza() {
		notaDePlata.printeaza();
	}

	public abstract void printeazaFelicitare();
	
}
