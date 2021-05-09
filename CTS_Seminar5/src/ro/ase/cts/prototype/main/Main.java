package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.clase.Reteta;

public class Main {

	public static void main(String[] args) {
		
		//Prototype
		Reteta reteta = new Reteta("Acid acetic", 250);
		Reteta retetaClona = (Reteta) reteta.copiaza();
	
		System.out.println(reteta);
		System.out.println(retetaClona);

	}

}
