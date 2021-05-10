package proxy.main;

import proxy.clase.IOperatorCredite;
import proxy.clase.Moneda;
import proxy.clase.OperatorCredite;
import proxy.clase.ProxyOperatorCredite;

public class Main {

	public static void main(String[] args) {
		IOperatorCredite operator = new OperatorCredite();
		operator.creazaCredit(2000, Moneda.EUR);
		operator.creazaCredit(3000, Moneda.RON);
		
		IOperatorCredite proxyOperator = new ProxyOperatorCredite(operator);
		proxyOperator.creazaCredit(10000, Moneda.EUR);
		proxyOperator.creazaCredit(10000, Moneda.RON);
	}

}
