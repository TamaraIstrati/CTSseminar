package ro.ase.cts.simpleFactory.clase;

public class FactoryAsistent implements IFactory{

	@Override
	public PersonalSpital getPersonal(String nume) {
		return new Asistent(nume);
	}

}
