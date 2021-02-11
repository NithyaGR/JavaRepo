package javaPrograms;

public abstract class AbstractionEmployee {
	
	private String name;
	private int paymentPerHour;
	static String Organization = "Oracle";
	
	//Class constructor
	public AbstractionEmployee(String name, int paymentPerHour){
		
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}
	public static String checkStaticClassMEthod(){
	
		String s = "This is a static method from an abstract class - Employee";
		System.out.println(s);
		return s;
	}
	
	public abstract int calculateSalary();//abstract method 
	
	//getter
	public String getName(){
		return name;
	}
	
	//setter
	public void setName(String name){
		this.name = name;
	}
	
	public int getPaymentPerHour(){
		return paymentPerHour;
	}
	public void setPaymentPerHour(int paymentPerHour){
		this.paymentPerHour = paymentPerHour;
	}
	
	
	
	}
	
	
	


