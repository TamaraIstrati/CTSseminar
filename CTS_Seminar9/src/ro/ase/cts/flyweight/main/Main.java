package ro.ase.cts.flyweight.main;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(10, 52, 15);
		Rezervare rezervare2 = new Rezervare(13, 53, 13);
		Rezervare rezervare3 = new Rezervare(14, 54, 12);
		Rezervare rezervare4 = new Rezervare(105, 5, 11);
		
		FlyweightFactory factory = new FlyweightFactory();
		Client client1 = (Client) factory.getFlyweight("1234");
		client1.printeazaRezervare(rezervare1);
		
		factory.getFlyweight("1234").printeazaRezervare(rezervare2);
		factory.getFlyweight("12333").printeazaRezervare(rezervare3);
		factory.getFlyweight("12333").printeazaRezervare(rezervare4);
	}

}
