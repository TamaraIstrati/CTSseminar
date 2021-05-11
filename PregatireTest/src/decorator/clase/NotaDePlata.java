package decorator.clase;

public class NotaDePlata implements INotaDePlata{
	private float suma;

	public NotaDePlata(float suma) {
		super();
		this.suma = suma;
	}

	@Override
	public void printeaza() {
		System.out.println("Nota de plata in suma de: " + this.suma + ".");
	}

}
