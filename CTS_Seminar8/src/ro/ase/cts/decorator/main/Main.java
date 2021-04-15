package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorCuLaMultiAni;
import ro.ase.cts.decorator.clase.DecoratorCuPasteFericit;
import ro.ase.cts.decorator.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NotaDePlata notaDePlata = new NotaDePlata(55);
		notaDePlata.printeaza();
		
		DecoratorAbstract decoratorLaMultiAni = new DecoratorCuLaMultiAni(notaDePlata);
		decoratorLaMultiAni.printeazaFelicitare();
		decoratorLaMultiAni.printeaza();
		
		System.out.println();
		DecoratorAbstract decoratorPaste = new DecoratorCuPasteFericit(notaDePlata);
		decoratorPaste.printeaza();
		
		System.out.println();
		NotaDePlata notaCompusa = new NotaDePlata(150);
		DecoratorAbstract decoratorCompusAni = new DecoratorCuLaMultiAni(notaCompusa);
		DecoratorAbstract decoratorCompusPasti = new DecoratorCuPasteFericit(decoratorCompusAni);
		decoratorCompusPasti.printeaza();
	}

}
