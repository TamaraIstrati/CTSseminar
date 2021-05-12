package state.main;

import state.clase.Masa;

public class Main {

	public static void main(String[] args) {
		Masa masa = new Masa(5);
		masa.elibereazaMasa();
		masa.rezervaMasa();
		masa.rezervaMasa();
		masa.ocupaMasa();
		masa.ocupaMasa();
		masa.elibereazaMasa();
	}

}
