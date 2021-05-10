package proxy.clase;

public class ProxyOperatorCredite implements IOperatorCredite{
	private IOperatorCredite operator;

	public ProxyOperatorCredite(IOperatorCredite operator) {
		super();
		this.operator = operator;
	}

	@Override
	public void creazaCredit(float suma, Moneda moneda) {
		if(moneda==Moneda.RON) {
			operator.creazaCredit(suma, moneda);
		} else {
			System.out.println("Nu se permit credite de valuta straina!");
		}
	}

}
