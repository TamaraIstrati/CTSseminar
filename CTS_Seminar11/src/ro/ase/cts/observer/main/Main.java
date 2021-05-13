package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSalaSport;

public class Main {

	public static void main(String[] args) {
		ManagerSalaSport manager = new ManagerSalaSport();
		Client client1 = new Client("Ion");
		Client client2 = new Client("Maria");
		Client client3 = new Client("Ana");
		
		manager.adaugaObservator(client1);
		manager.adaugaObservator(client2);
		manager.adaugaObservator(client3);
		
		manager.anuntaMeci("Baschet");
		
		manager.stergeObservator(client2);
		manager.anuntaMeci("Fotbal");
	}

}
