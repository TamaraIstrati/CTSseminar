package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie extends InstitutieBancara{
	
	private List<InstitutieBancara> listaFiliale;	

	public Agentie() {
		super();
		this.listaFiliale = new ArrayList<>();
	}

	@Override
	public void afisareDescriere() {
		System.out.println("Este o agentie.");
		for(InstitutieBancara i: listaFiliale) {
			i.afisareDescriere();
		}
	}

	@Override
	public void addNod(InstitutieBancara nod) {
		listaFiliale.add(nod);
		
	}

	@Override
	public void deleteNod(InstitutieBancara nod) {
		listaFiliale.remove(nod);
	}

	@Override
	public InstitutieBancara getNod(int poz) {
		return listaFiliale.get(poz);
	}

}
