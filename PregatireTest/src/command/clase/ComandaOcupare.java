package command.clase;

public class ComandaOcupare implements IComanda{
	private Masa masa;

	public ComandaOcupare(Masa masa) {
		super();
		this.masa = masa;
	}

	@Override
	public void executa() {
		this.masa.ocupaMasa();
	}

}
