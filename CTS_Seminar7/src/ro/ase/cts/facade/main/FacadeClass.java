package ro.ase.cts.facade.main;

import ro.ase.cts.facade.clase.Persoana;
import ro.ase.cts.facade.clase.VerificatorPersoane;

public class FacadeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persoana persoana = new Persoana("Alex", "1952013232655");
		if(VerificatorPersoane.esteEligibila(persoana)) {
			System.out.println("Putem sa-i oferim creditul");
		} else {
			System.out.println("Nu putem sa-i oferim creditul");
		}
		
	}

}
