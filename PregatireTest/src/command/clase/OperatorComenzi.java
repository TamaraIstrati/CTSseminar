package command.clase;

import java.util.ArrayList;
import java.util.List;

public class OperatorComenzi {
	private List<IComanda> comenzi;
	
	public OperatorComenzi() {
		super();
		this.comenzi = new ArrayList<>();
	}

	public void addComanda(IComanda comanda) {
		comenzi.add(comanda);
	}
	
	public void trimiteSpreExecutare() {
		if(comenzi.size()>0) {
			comenzi.get(0).executa();
			comenzi.remove(0);
		} else {
			throw new Error("Lista comenzi goala!");
		}
	}
}
