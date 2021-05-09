package simpleFactory.main;

import simpleFactory.clase.FactoryPersonal;
import simpleFactory.clase.PersonalSpital;
import simpleFactory.clase.TipPersonal;

public class Main {

	public static void main(String[] args) {
		FactoryPersonal factory = new FactoryPersonal();
		
		PersonalSpital asistent = factory.getPersonal(TipPersonal.Asistent, "Ioana");
		PersonalSpital medic = factory.getPersonal(TipPersonal.Medic, "Andreea");
		PersonalSpital brancardier = factory.getPersonal(TipPersonal.Brancardier, "Ion");
		
		System.out.println(asistent + "..." + medic + "..." + brancardier);
	}

}
