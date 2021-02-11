package upcastingDowncasting;

public class AnimalTrainer {

	public void teach(Animal animal){
		animal.eat();
		animal.move();
		animal.sleep();
		if(animal instanceof Dog){
			Dog dog = new Dog();
			dog.bark();
		}
	}
}
