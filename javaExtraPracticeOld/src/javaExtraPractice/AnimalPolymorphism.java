package javaExtraPractice;

public class AnimalPolymorphism {

	
		  public void animalSound() {
		    System.out.println("The animal makes a sound");
		  }
		}

		class Pig extends AnimalPolymorphism {
		  public void animalSound() {
		    System.out.println("The pig says: oink oink");
		  }
		}

		class Dog extends AnimalPolymorphism {
		  public void animalSound() {
		    System.out.println("The dog says: bow wow");
		  }
		}	

		
	


