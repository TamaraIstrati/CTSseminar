package decorator.main;

import decorator.clase.DecoratorAbstract;
import decorator.clase.DecoratorCraciunFericit;
import decorator.clase.DecoratorLaMultiAni;
import decorator.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		NotaDePlata nota = new NotaDePlata(100);
		nota.printeaza();
		
		DecoratorAbstract decoratorLaMultiAni = new DecoratorLaMultiAni(nota);
		decoratorLaMultiAni.printeazaFelicitare();
		decoratorLaMultiAni.printeaza();
		
		DecoratorAbstract decoratorComplex = new DecoratorCraciunFericit(decoratorLaMultiAni);
		decoratorComplex.printeazaFelicitare();
		decoratorComplex.printeaza();
	}

}
