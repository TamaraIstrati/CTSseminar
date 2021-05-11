package strategy.clase;

public class PlatesteCash implements IPlata{

	@Override
	public void plateste(float suma) {
		System.out.println("Suma de " + suma + " lei a fost platita cash.");
	}

}
