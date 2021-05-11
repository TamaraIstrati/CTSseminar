package command.main;

import command.clase.ComandaOcupare;
import command.clase.ComandaRezervare;
import command.clase.IComanda;
import command.clase.Masa;
import command.clase.OperatorComenzi;

public class Main {

	public static void main(String[] args) {
		Masa masa = new Masa(1);
		
		IComanda comanda1 = new ComandaOcupare(masa);
		IComanda comanda2 = new ComandaRezervare(masa);
		IComanda comanda3 = new ComandaOcupare(masa);
		
		OperatorComenzi operator = new OperatorComenzi();
		operator.addComanda(comanda1);
		operator.trimiteSpreExecutare();
		
		operator.addComanda(comanda2);
		operator.addComanda(comanda3);
		
		operator.trimiteSpreExecutare();
		operator.trimiteSpreExecutare();
	}

}
