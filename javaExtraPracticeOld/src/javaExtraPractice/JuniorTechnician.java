package javaExtraPractice;

public class JuniorTechnician extends Technician {
	
	public JuniorTechnician(int id){
		super(id);
		System.out.println("I'm a junior technician");
	}
	public double calculateSalary(){
		if(getGrade()=="A"){
			return super.calculateSalary() * .7;
			
		}
		else
			return super.calculateSalary() * .5;
	}
	

}
