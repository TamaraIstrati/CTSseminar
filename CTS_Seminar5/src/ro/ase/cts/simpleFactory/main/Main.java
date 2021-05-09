package ro.ase.cts.simpleFactory.main;

import ro.ase.cts.prototype.clase.Reteta;
import ro.ase.cts.simpleFactory.clase.FactoryPersonal;
import ro.ase.cts.simpleFactory.clase.PersonalSpital;
import ro.ase.cts.simpleFactory.clase.TipPersonal;

public class Main {
	
	public static void main(String[] args) {
		FactoryPersonal factoryPersonal = new FactoryPersonal();
		
		PersonalSpital asistent = factoryPersonal.createPersonal(TipPersonal.Asistent, "David");
		PersonalSpital medic = factoryPersonal.createPersonal(TipPersonal.Medic, "Razvan");

		System.out.println(asistent.toString());
		System.out.println(medic.toString());

	}

}
