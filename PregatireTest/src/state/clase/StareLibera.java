package state.clase;

public class StareLibera implements IStare{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof StareLibera) {
			System.out.println("Masa " + masa.getNrMasa() + " deja libera!");
		} else {
			masa.setStare(this);
			System.out.println("Masa cu numarul " + masa.getNrMasa() + " a fost eliberata.");
		}
	}

}
