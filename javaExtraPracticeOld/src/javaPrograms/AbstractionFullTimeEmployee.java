package javaPrograms;

public class AbstractionFullTimeEmployee extends AbstractionEmployee {
	
	public AbstractionFullTimeEmployee(String name, int paymentPerHour){
		
		super(name, paymentPerHour);
	}

	public int calculateSalary(){
		
		return getPaymentPerHour()*8;
	}
	
}
