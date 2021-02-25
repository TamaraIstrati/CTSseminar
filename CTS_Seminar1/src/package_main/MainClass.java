package package_main;

import package_classes.Girafa;
import package_classes.Zoo;

public class MainClass {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		Girafa girafa1 = new Girafa("Girafa1");
		Girafa girafa2 = new Girafa("Girafa2");
		
		zoo.addAnimal(girafa1);
		zoo.addAnimal(girafa2);
		
		zoo.feedAllAnimals();
	}

}
