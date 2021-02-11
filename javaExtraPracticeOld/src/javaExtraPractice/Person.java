package javaExtraPractice;

public class Person {
	
	String name;
	int age;
	char gender;
	
	public Person(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}

	public void women(){
		System.out.println("Women are strong, smart and kind");
	}
	public void men(){
		System.out.println("Men are string, caring and funny");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person obj1 = new Person("Nithya", 40,'f');
		if (obj1.gender == 'f'){
			obj1.women();
		}
		else if (obj1.gender == 'm'){
			obj1.men();
		}
		else {
			System.out.println("Invalid");
		}
			

	}

}
