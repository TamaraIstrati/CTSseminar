package adapter.clase;

public class AdapterClaseEBilet extends Bilet implements IAdapterEBilet{

	public AdapterClaseEBilet(float pret) {
		super(pret);
	}

	@Override
	public void vinde() {
		super.vindeClasic();
	}

	@Override
	public void rezerva() {
		super.rezervaClasic();
	}

}
