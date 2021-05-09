package factoryMethod.main;

import factoryMethod.clase.FactoryBrancardier;
import factoryMethod.clase.FactoryMedic;
import factoryMethod.clase.IFactory;
import factoryMethod.clase.PersonalSpital;

public class Main {
	public static void getDetaliiPersonal(IFactory factory, String nume) {
		PersonalSpital personal = factory.getPersonal(nume);
		System.out.println(personal);
	}
	public static void main(String[] args) {
		getDetaliiPersonal(new FactoryMedic(), "Ioana");
		getDetaliiPersonal(new FactoryBrancardier(), "Ion");
	}

}
