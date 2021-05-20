package builder.main;

import builder.clase.AbstractBuilder;
import builder.clase.BuilderRezervareV1;
import builder.clase.BuilderRezervareV2;
import builder.clase.Product;
import builder.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		//V1
		AbstractBuilder builder1 = new BuilderRezervareV1();
		Rezervare r1 = ((BuilderRezervareV1)builder1).addAreBautura(true).addAreMancare(true).addAreBautura(true).build();
		Rezervare r2 = ((BuilderRezervareV1)builder1).addAreMancare(true).addAreBautura(true).addAreMuzicaAmbientala(true).build();
		
		System.out.println(r1);
		System.out.println(r2);
		
		//V2
		AbstractBuilder builder2 = new BuilderRezervareV2();
		Rezervare r3 = ((BuilderRezervareV2)builder2).addAreBautura(true).addAreScaunErgonomic(true).build();
		Rezervare r4 = ((BuilderRezervareV2)builder2).addAreMancare(true).build();
		
		System.out.println(r3);
		System.out.println(r4);
		
		System.out.println("---------");
		//inner
		Product product3 = new Product.ProductBuilder()
				.addName("milk")
				.addBarCode(12345)
				.addQuantity(23)
				.addIsVegetarianFriendly(true)
				.addIsGlutenFree(true)
				.build();
		System.out.println(product3);
	}

}
