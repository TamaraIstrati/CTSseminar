package command.clase;

public class ComandaRezervare implements IComanda{

	private Masa masa;

	public ComandaRezervare(Masa masa) {
		super();
		this.masa = masa;
	}
	
	@Override
	public void executa() {
		this.masa.rezervaMasa();
	}

}
