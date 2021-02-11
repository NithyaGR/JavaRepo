package practiceAssignments2020;

public class AnonymousClassDemo {

	public static void main(String[] args) {
		AnonymousClasses person = new AnonymousClasses(){
			void print(){
				System.out.println("This is AnonymousClasses Abrtact class's print method defined and called in this class");
			}
		};
		person.print();
		

	}

}
