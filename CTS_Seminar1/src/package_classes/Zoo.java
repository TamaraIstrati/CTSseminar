package package_classes;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements ZooInterface{
	private Zookeeper zookeeper;
	private List<Animal> animals;
	
	public Zoo(Zookeeper zookeeper, List<Animal> animals) {
		super();
		this.zookeeper = zookeeper;
		this.animals = animals;
	}
	public Zoo() {
		this.zookeeper = new Zookeeper("Ion");
		this.animals = new ArrayList<>();
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void feedAllAnimals() {
		for(Animal animal: animals) {
			zookeeper.feed(animal);
		}
	}
	
}
