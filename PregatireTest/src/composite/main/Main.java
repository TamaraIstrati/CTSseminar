package composite.main;

import composite.clase.Agentie;
import composite.clase.Filiala;
import composite.clase.InstitutieBancara;
import composite.clase.Sucursala;

public class Main {

	public static void main(String[] args) {
		InstitutieBancara sucursala = new Sucursala();
		InstitutieBancara agentie1 = new Agentie();
		InstitutieBancara agentie2 = new Agentie();
		InstitutieBancara filiala1 = new Filiala("Filiala1");
		InstitutieBancara filiala2 = new Filiala("Filiala2");
		
		sucursala.addNod(agentie1);
		sucursala.addNod(agentie2);
		
		agentie1.addNod(filiala1);
		agentie2.addNod(filiala2);
		
		sucursala.afisareDescriere();
		System.out.println("-----");
		agentie1.afisareDescriere();
		System.out.println("-----");
		agentie2.afisareDescriere();
		System.out.println("-----");
		
		//filiala1.addNod(filiala2);
	}

}
