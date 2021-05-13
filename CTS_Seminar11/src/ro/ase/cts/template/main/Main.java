package ro.ase.cts.template.main;

import ro.ase.cts.template.clase.Spectator;
import ro.ase.cts.template.clase.SpectatorAbstract;
import ro.ase.cts.template.clase.SpectatorVIP;

public class Main {

	public static void main(String[] args) {
		SpectatorAbstract spectator = new Spectator("Ion");
		SpectatorAbstract spectatorVIP = new SpectatorVIP("Marius");
		
		spectator.intrareInStadion();
		spectatorVIP.intrareInStadion();
	}

}
