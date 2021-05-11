package strategy.clase;

public class PlatesteCard implements IPlata{

	@Override
	public void plateste(float suma) {
		System.out.println("A fost platita suma de " + suma + " lei cu cardul.");
	}

}
