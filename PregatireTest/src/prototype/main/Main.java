package prototype.main;

import prototype.clase.Reteta;
import prototype.clase.RetetaComprimate;
import prototype.clase.SubstantaActiva;

public class Main {

	public static void main(String[] args) {
		Reteta reteta = new RetetaComprimate("Acid acetil salicilic", 200 , new SubstantaActiva("NaCl", 55));
		Reteta reteta1 = (RetetaComprimate)((RetetaComprimate) reteta).cloneaza();
				
		System.out.println(reteta);
		System.out.println(reteta1);
		
		reteta.setDenumire("nurofen");
		((RetetaComprimate) reteta).setSubstantaActiva(new SubstantaActiva("ibuprofenum", 209));
		System.out.println(reteta);
		System.out.println(reteta1);
	}

}
