package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sucursala extends InstitutieBancara{
	private List<InstitutieBancara> listaAgentii;

	public Sucursala() {
		super();
		this.listaAgentii = new ArrayList<>();
	}

	@Override
	public void afisareDescriere() {
		System.out.println("Este o sucursala.");
		for(InstitutieBancara i: listaAgentii) {
			i.afisareDescriere();
		}
	}

	@Override
	public void addNod(InstitutieBancara nod) {
		listaAgentii.add(nod);
		
	}

	@Override
	public void deleteNod(InstitutieBancara nod) {
		listaAgentii.remove(nod);
	}

	@Override
	public InstitutieBancara getNod(int poz) {
		return listaAgentii.get(poz);
	}

}
