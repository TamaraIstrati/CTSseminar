package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.clase.Moneda;
import ro.ase.cts.proxy.clase.OperatorCredite;
import ro.ase.cts.proxy.clase.OperatorCrediteProxy;

public class ProxyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperatorCredite operator = new OperatorCredite();
		operator.creareCredit(Moneda.EUR, 4000);
		
		OperatorCrediteProxy proxy = new OperatorCrediteProxy(operator);
		proxy.creareCredit(Moneda.EUR, 4000);
		proxy.creareCredit(Moneda.RON, 10000);
	}

}
