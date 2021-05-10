package proxy.clase;

public class OperatorCredite implements IOperatorCredite{

	@Override
	public void creazaCredit(float suma, Moneda moneda) {
		System.out.println("S-a creat un credit in valoare de " + suma + " " + moneda.toString());
	}

}
