package adapter.main;

import adapter.clase.AdapterClaseEBilet;
import adapter.clase.AdapterObiecteEBilet;
import adapter.clase.Bilet;
import adapter.clase.IAdapterEBilet;

public class Main {
	
	private static void rezervaSiAfiseazaBiletClasic(Bilet bilet) {
		bilet.rezervaClasic();
		bilet.vindeClasic();
	}
	
	private static void rezervaSiAfiseazaBiletOnline(IAdapterEBilet bilet) {
		bilet.rezerva();
		bilet.vinde();
	}

	public static void main(String[] args) {
		//Adaptor obiecte
		Bilet bilet = new Bilet(40f);
		rezervaSiAfiseazaBiletClasic(bilet);
		rezervaSiAfiseazaBiletOnline(new AdapterObiecteEBilet(bilet));

		//Adaptor clase
		rezervaSiAfiseazaBiletClasic(new AdapterClaseEBilet(55));
		rezervaSiAfiseazaBiletOnline(new AdapterClaseEBilet(55));
	}

}
