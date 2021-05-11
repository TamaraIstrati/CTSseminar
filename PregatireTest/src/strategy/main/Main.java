package strategy.main;

import strategy.clase.Client;
import strategy.clase.PlatesteCard;
import strategy.clase.PlatesteCash;

public class Main {

	public static void main(String[] args) {
		Client client = new Client("Ion");
		client.setModPlata(new PlatesteCard());
		client.platesteSuma(100);
		client.setModPlata(new PlatesteCash());
		client.platesteSuma(22);
	}

}
