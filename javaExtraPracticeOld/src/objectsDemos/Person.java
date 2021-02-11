package objectsDemos;

public class Person {
	String name;
	int age;
	/**
	 * The constructor here assigns the name and age to its corresponding object
	 * @param name
	 * @param age
	 */
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	/**
	 * This Person method converts an object o (which is the parameter) to another object whose age is different
	 * from o and returns the changed object
	 * @param o
	 * @return
	 */
	public Person change(Object o){
		Person p2 = (Person)o;
		p2.age = 40;
		
		return p2;
	}

	//Where is the java doc updates
	
	/**
	 *  This is to check the java docs, I don't get this
	 * @author Nithyakalyani
	 * @
	 * 
	 */
	public static void main(String[] args) {
		
		Person p1 = new Person("Nithya", 41);
		
		Person p2 = p1.change(p1);
		System.out.println("Name "+p2.name);
		System.out.println("Age "+p2.age);
		System.out.println("P1's Age "+p1.age);
		

	}

}
