package ro.ase.cts.command.main;

import ro.ase.cts.command.clase.Comanda;
import ro.ase.cts.command.clase.ComandaOcupare;
import ro.ase.cts.command.clase.ComandaRezervare;
import ro.ase.cts.command.clase.Masa;
import ro.ase.cts.command.clase.Operator;

public class Main {

	public static void main(String[] args) {
		Masa masa = new Masa(1);
		
		Comanda comandaRezervare = new ComandaRezervare(masa);
		Comanda comandaOcupare = new ComandaOcupare(masa);
		Comanda comandaOcupare1 = new ComandaOcupare(masa);
		
		Operator operator = new Operator();
		operator.invocaComanda(comandaRezervare);
		operator.executaComanda();
		
		operator.invocaComanda(comandaOcupare);
		operator.invocaComanda(comandaOcupare1);
		
		operator.executaComanda();
	}

}
