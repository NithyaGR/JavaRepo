package javaPrograms;

public class AbstractionDemo {

	public static void main(String[] args) {


		AbstractionContractor obj1 = new AbstractionContractor("Nithya", 98, 6);
		System.out.println(obj1.calculateSalary());
		
		System.out.println(AbstractionEmployee.checkStaticClassMEthod());
		AbstractionFullTimeEmployee obj2 = new AbstractionFullTimeEmployee("Kumar", 150);
		System.out.println(obj2.calculateSalary());
		//AbstractionEmployee obj3 = new AbstractionContractor("Nithya",100,6);
	    AbstractionContractor obj4 = new AbstractionContractor("Kalyani",135,6);
	    System.out.println(obj4.calculateSalary());
	    //AbstractionEmployee.Organization = "IBM"; Organization is not final, so you can change here if you need.
	    System.out.println("Name: "+obj4.getName()+" Payment per Hour: "+obj4.getPaymentPerHour()+ " Company: "+AbstractionEmployee.Organization);
	}

}
