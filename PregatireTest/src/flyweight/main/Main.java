package flyweight.main;

import java.time.LocalDateTime;

import flyweight.clase.FlyweightClient;
import flyweight.clase.FlyweightClientiFactory;
import flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare r1 = new Rezervare(1, 3, LocalDateTime.now());
		Rezervare r2 = new Rezervare(2, 4, LocalDateTime.now());
		Rezervare r3 = new Rezervare(3, 10, LocalDateTime.now());
		
		FlyweightClientiFactory factory = new FlyweightClientiFactory();
		FlyweightClient client1 = (FlyweightClient) factory.getClient("111");
		client1.setNume("Ana");
		client1.setEmail("ana@gmail.com");
		client1.printeazaRezervare(r1);
		
		System.out.println("--------------");
		factory.getClient("222").printeazaRezervare(r2);
		
		System.out.println("--------------");
		((FlyweightClient) factory.getClient("111")).setEmail("ana.ana@yahoo.com");
		client1.printeazaRezervare(r1);
		factory.getClient("111").printeazaRezervare(r3);
	}

}
