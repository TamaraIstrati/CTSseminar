package state.clase;

public class StareOcupata implements IStare{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof StareLibera || masa.getStare() instanceof StareRezervata) {
			masa.setStare(this);
			System.out.println("Masa cu numarul " + masa.getNrMasa() + " a fost ocupata.");
		} else {
			System.out.println("Masa " + masa.getNrMasa() + " este deja ocupata!");
		}
	}

}
