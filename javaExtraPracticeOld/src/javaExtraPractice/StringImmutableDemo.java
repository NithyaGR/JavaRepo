package javaExtraPractice;

public class StringImmutableDemo {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "";
		System.out.println("Memory of s1: "+s1.hashCode());
		System.out.println("Memory of s2: "+s2.hashCode());
		s1 = "Hello Java";
		System.out.println("Memory of s1: "+s1.hashCode());
		s2 = "Hi World";
		System.out.println("Memory of s2: "+s2.hashCode());
		String s3 = "Hello";
		System.out.println("Memory of s3: "+s3.hashCode());
		String s4 = "";
		System.out.println("Memory of s4: "+s4.hashCode());
		String s5 = "Hello";
		System.out.println("Memory of s5: "+s5.hashCode());
		
		String string1 = new String("Nithya");
		String string2 = new String("Nithya");
		String string3 = "Selenium";
		String string4 = "Selenium";
		System.out.println(string1.equals(string2));
		System.out.println(string1==string2);//this checks memory address
		System.out.println(string3.equals(string4));
		System.out.println(string3==string4);
		System.out.println("Memory of string1: "+string1.hashCode());
		System.out.println("Memory of string2: "+string2.hashCode());
		System.out.println("Memory of string3: "+string3.hashCode());
		System.out.println("Memory of string4: "+string4.hashCode());
		
		String st1 = "welcome";
		System.out.println("memeory of st1 -welcome "+st1.hashCode());
		String st2 = "hello";
		System.out.println("memeory of st2 -hello "+st2.hashCode());
		st1 = "java";
		System.out.println("memeory of st1 -java "+st1.hashCode());
		String st3 = "welcome";
		System.out.println("memeory of st3 -welcome "+st3.hashCode());
			

	}

}
