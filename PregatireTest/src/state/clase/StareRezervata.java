package state.clase;

public class StareRezervata implements IStare{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof StareLibera) {
			masa.setStare(this);
			System.out.println("Masa cu numarul " +masa.getNrMasa() + " a fost rezervata");
		} else {
			System.out.println("Masa " +masa.getNrMasa() + " e deja ocupata sau rezervata!");
		}
	}

}
