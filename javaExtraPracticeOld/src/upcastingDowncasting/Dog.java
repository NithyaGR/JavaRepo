package upcastingDowncasting;

public class Dog extends Animal{
	
	public void eat(){
		System.out.println("Dog - Eating");
	}

	public void sleep(){
		System.out.println("Dog - Sleeping");
	}
	
	
	public void move(){
		System.out.println("Dog - Moving");
	}
	public void bark(){
		System.out.println("The object is: "+ this);
		System.out.println("Dog - Barks... Bow Wow");
	}
	public static void main(String[] args) {
		
		Dog myDog1 = new Dog();
		Animal myAnimal = (Animal) myDog1; // This is what upcasting. Casting to  super type, upward to the 
		//inheritance tree
		
		System.out.println("myDog1: "+myDog1);
		System.out.println("myAnimal1: "+myAnimal);
		/*Animal myDog1 = new Dog();//This is also upcasting - If defined like this, you can skip line 20. 
		myDog1.eat();*/
		
		//myAnimal.eat();// both lines 27 and 28 print the same result. 
		//Then why we use the upcasting? check below - when we need to use the general code that uses only
		// the super type - here animal trainer - teach method uses animal as a parameter.  
		
		AnimalTrainer trainer = new AnimalTrainer();
		//trainer.teach(myDog1);//myDog1 is of type animal by line 22
		trainer.teach(myAnimal);
		
		//Downcasting --- casting to a subtype - downward to the inheritance tree
		Animal myAnimal2 = new Dog();
		Dog dog2 = (Dog) myAnimal2; // myAnimal2 is of dog type - explicitly mentioning 
		
		System.out.println("myAnimal2: "+myAnimal2);
		System.out.println("dog2: "+dog2);
		
		// why down casting? To use a specific behavior of a subtype. Here it's barking
		if(myAnimal2 instanceof Dog){
			((Dog) myAnimal2).bark();
			dog2.bark();
		}

	}
}



/*
 * The output of the above code
 * myDog1: upcastingDowncasting.Dog@1db9742
myAnimal1: upcastingDowncasting.Dog@1db9742
Dog - Eating
Dog - Moving
Dog - Sleeping
The object is: upcastingDowncasting.Dog@106d69c
Dog - Barks... Bow Wow
myAnimal2: upcastingDowncasting.Dog@52e922
dog2: upcastingDowncasting.Dog@52e922
The object is: upcastingDowncasting.Dog@52e922
Dog - Barks... Bow Wow
The object is: upcastingDowncasting.Dog@52e922
Dog - Barks... Bow Wow
 */



