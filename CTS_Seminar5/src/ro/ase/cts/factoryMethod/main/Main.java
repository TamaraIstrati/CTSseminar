package ro.ase.cts.factoryMethod.main;

import ro.ase.cts.factoryMethod.clase.FactoryAsistent;
import ro.ase.cts.factoryMethod.clase.FactoryBrancardier;
import ro.ase.cts.factoryMethod.clase.IFactory;
import ro.ase.cts.factoryMethod.clase.PersonalSpital;

public class Main {
	
	public static void afisareInformatiiPersonalSpital(IFactory factory, String nume) {
		PersonalSpital personalSpital = factory.getPersonal(nume);
		
		System.out.println(personalSpital.toString());
	}

	public static void main(String[] args) {
		afisareInformatiiPersonalSpital(new FactoryAsistent(), "Mircea");
		afisareInformatiiPersonalSpital(new FactoryBrancardier(), "Mihai");
	}
}
