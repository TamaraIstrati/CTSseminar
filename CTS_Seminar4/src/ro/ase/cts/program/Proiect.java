package ro.ase.cts.program;

import ro.ase.cts.clase.Presedinte;
import ro.ase.cts.clase.PresedinteLazy;

public class Proiect {
	
	public static void main(String[] args) {
		//Eager
		Presedinte presedinte1 = Presedinte.getInstanta();
		Presedinte presedinte2 = Presedinte.getInstanta();
		
		presedinte1.setNume("Basescu");
		presedinte2.setMandat(2);
		
		System.out.println(presedinte1.toString());
		System.out.println(presedinte2.toString());
		
		//Lazy
		//Va ramane prima instanta pana modificam noi prin sett-eri
		PresedinteLazy presedinteLazy1 = PresedinteLazy.getInstance("presedinte lazy", 40, 4);
		PresedinteLazy presedinteLazy2 = PresedinteLazy.getInstance("presedinte lazy2", 44, 1);
		
		System.out.println(presedinteLazy1.toString());
		System.out.println(presedinteLazy2.toString());
	}
	
}
