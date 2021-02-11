package javaExtraPractice;

public class Technician extends Employee{
	
	public Technician(int id){
		super(id);
		System.out.println("I'm a Technician");
		
	}
	
	public double calculateSalary(){
		if(getGrade() =="A"){
			return super.calculateSalary() +300 ;	
		}
		else
			return super.calculateSalary() +200;
	}

}
