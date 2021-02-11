package javaExtraPractice;

public class PolymorphismPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		    AnimalPolymorphism myAnimal = new AnimalPolymorphism();  // Create a Animal object
		    AnimalPolymorphism myPig = new Pig();  // Create a Pig object
		    AnimalPolymorphism myDog = new Dog();  // Create a Dog object

		    myAnimal.animalSound();
		    myPig.animalSound();
		    myDog.animalSound();
		  }
		
	

}
