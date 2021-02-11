package javaExtraPractice;

public class Human {

	String gender;//Non static class attribute or field which should be accessed by an object
	public Human(String gen){
		gender = gen;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human objNithya = new Human("female");
		System.out.println(objNithya.gender);
		//System.out.println(gender); As gender is non static, you should call it with the object
		
		// jre1.8.0_191
	}

}
