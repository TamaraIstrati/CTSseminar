package ro.ase.cts.program;

import ro.ase.cts.clase.Itinerar;
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
		
		//My Class
		Itinerar itinerar1= Itinerar.getInstance("ASE", "Domiciliu", 6, 28.7f);
		Itinerar itinerar2= Itinerar.getInstance("Bucuresti Mall", "Piata Unirii", 3, 18.5f);
		
		System.out.println(itinerar1.toString());
		System.out.println(itinerar2.toString());//observam ca sunt primele instante
		
		itinerar1.setStartLocation("Casa Poporului");
		itinerar2.setDistance(100);
		
		System.out.println(itinerar1.toString());
		System.out.println(itinerar2.toString());//observam ca ambele itinerare sunt modif
	}
	
}
