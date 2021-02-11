package javaPrograms;

public class AbstractionContractor extends AbstractionEmployee{

	private int workingHours;
	
	public AbstractionContractor(String name, int paymentPerHour, int workingHours){
		super(name, paymentPerHour);
		this.workingHours = workingHours;
		
	}
	public static String checkStaticClassMEthod(){
		
		String s = "This is a static method from an abstract class - contractor";
		System.out.println(s);
		//AbstractionEmployee s1 = AbstractionEmployee.checkStaticClassMEthod();
		return s;
	}
	
	public int calculateSalary(){
		
		return getPaymentPerHour()*workingHours;
	}
	
	
}
