package simpleFactory.clase;

public class FactoryPersonal {
	public PersonalSpital getPersonal(TipPersonal tip, String nume) {
		switch(tip) {
		case Brancardier: 
			return new Brancardier(nume);
		case Asistent:
			return new Asistent(nume);
		case Medic:
			return new Medic(nume);
		default:
			throw new IllegalArgumentException();
		}
	}
}
