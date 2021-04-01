package ro.ase.cts.main;

import ro.ase.cts.adapter.clase.Bilet;
import ro.ase.cts.adapter.clase.BiletAdapterClase;
import ro.ase.cts.adapter.clase.BiletAdaptor;
import ro.ase.cts.adapter.clase.IBiletOnline;

public class MainAdaptor {
	
	private static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet) {
		bilet.rezervare();
		bilet.vanzare();
	}
	
	private static void rezervaSiAfiseazaBiletOnline(IBiletOnline bilet) {
		bilet.rezervaBiletOnline();
		bilet.vindeBiletOnline();
	}

	public static void main(String[] args) {
		//Adaptor obiecte
		Bilet bilet = new Bilet(30f);
		rezervaSiAfiseazaBiletLaCasa(bilet);
		
		IBiletOnline adaptor = new BiletAdaptor(bilet);
		rezervaSiAfiseazaBiletOnline(adaptor);
		
		//Adaptor clase
		IBiletOnline adaptorClase = new BiletAdapterClase(50);
		rezervaSiAfiseazaBiletOnline(adaptorClase);
	}

}
