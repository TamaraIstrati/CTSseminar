package flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightClientiFactory {
	private Map<String, IFlyweightClient> clienti;
	
	
	
	public FlyweightClientiFactory() {
		super();
		this.clienti = new HashMap<>();
	}



	public IFlyweightClient getClient(String nrTelefon) {
		if(clienti.containsKey(nrTelefon)) {
			System.out.println("...client exisent...");
			return clienti.get(nrTelefon);
		} else {
			IFlyweightClient client = new FlyweightClient("---", nrTelefon, "---");
			clienti.put(nrTelefon, client);
			System.out.println("...client creat...");
			return client;
		}
	}
}
