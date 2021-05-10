package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements ISediu{
	private List<ISediu> listaSedii;

	public Agentie() {
		super();
		this.listaSedii = new ArrayList<>();
	}
	
	public Agentie(List<ISediu> listaSedii) {
		super();
		this.listaSedii = listaSedii;
	}

	@Override
	public void afisareDescriere() {
		// TODO Auto-generated method stub
		System.out.println("Este o agentie.");
		for(ISediu s : listaSedii){
			s.afisareDescriere();
		}
	}

	@Override
	public void adaugaNod(ISediu sediu) {
		listaSedii.add(sediu);
	}

	@Override
	public void stergeNod(ISediu sediu) {
		listaSedii.remove(sediu);
	}

	@Override
	public ISediu getNod(int pos) {
		// TODO Auto-generated method stub
		return listaSedii.get(pos);
	}

}
