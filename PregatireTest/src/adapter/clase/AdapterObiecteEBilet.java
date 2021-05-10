package adapter.clase;

public class AdapterObiecteEBilet implements IAdapterEBilet{
	
	private Bilet bilet;
	

	public AdapterObiecteEBilet(Bilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void vinde(){
		if(this.bilet != null) {
			bilet.vindeClasic();
		} 
	}

	@Override
	public void rezerva() {
		if(this.bilet != null) {
			bilet.rezervaClasic();
		} 
	}

}
