package ro.ase.cts.builder.main;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;
import ro.ase.cts.builder.clase.RezervareBuilderV2;

public class Main {

	public static void main(String[] args) {
		///Met 1 Build
		Rezervare rezervare1;
		Rezervare rezervare2;
		
		RezervareBuilder rezervareBuilder = new RezervareBuilder();
		rezervareBuilder.setCodRezervare(100).setAreMancare(true);
		rezervare1 = rezervareBuilder.build();
		
		rezervare2 = new RezervareBuilder(101).setAreMuzica(true).build();
		
		Rezervare rezervare3 = new Rezervare(102, true, false, true, true, "pop");
		
		//1 si 4 partajeaza memoria dar respectam DRY
		Rezervare rezervare4 = rezervareBuilder.setCodRezervare(104).setAreMuzica(true).setAreScaun(true).build();;
		
		System.out.println(rezervare1);
		System.out.println(rezervare2);
		System.out.println(rezervare3);
		System.out.println(rezervare4);
		
		///Met 2 Build
		RezervareBuilderV2 rbv2 = new RezervareBuilderV2().setAreMancare(true).setAreBautura(true).setAreScaunErgonomic(true);
		Rezervare rezervare5 = rbv2.setCodRezervare(140).build();
		//nu partajeaza memoria, dar DRY nu se respecta
		Rezervare rezervare6 = rbv2.setCodRezervare(150).build();
		
		System.out.println(rezervare5);
		System.out.println(rezervare6);
		
		
	}

}
