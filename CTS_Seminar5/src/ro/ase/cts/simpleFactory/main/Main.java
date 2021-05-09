package ro.ase.cts.simpleFactory.main;

import ro.ase.cts.prototype.clase.Reteta;
import ro.ase.cts.simpleFactory.clase.FactoryAsistent;
import ro.ase.cts.simpleFactory.clase.FactoryBrancardier;
import ro.ase.cts.simpleFactory.clase.FactoryInfirmier;
import ro.ase.cts.simpleFactory.clase.FactoryPersonal;
import ro.ase.cts.simpleFactory.clase.IFactory;
import ro.ase.cts.simpleFactory.clase.PersonalSpital;
import ro.ase.cts.simpleFactory.clase.TipPersonal;

public class Main {
	
	public static void afisareInformatiiPersonalSpital(IFactory factory, String nume) {
		PersonalSpital personalSpital = factory.getPersonal(nume);
		
		System.out.println(personalSpital.toString());
	}
	
	public static void main(String[] args) {
		FactoryPersonal factoryPersonal = new FactoryPersonal();
		
		PersonalSpital asistent = factoryPersonal.createPersonal(TipPersonal.Asistent, "David");
		PersonalSpital medic = factoryPersonal.createPersonal(TipPersonal.Medic, "Razvan");

		System.out.println(asistent.toString());
		System.out.println(medic.toString());
		
		afisareInformatiiPersonalSpital(new FactoryAsistent(), "Mircea");
		afisareInformatiiPersonalSpital(new FactoryBrancardier(), "Mihai");
		
		afisareInformatiiPersonalSpital(new FactoryInfirmier(), "Ion");

	}

}
