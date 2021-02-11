package javaExtraPractice;

public class Employee {
	
	private int empId;
	private String empName;
	private double empSalary;
	private Address address;
	private String Grade;
	
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public Employee(int id) {
		this.empId = id;
		System.out.println("I'm an employee");
	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(int empId, String empName, double empSalary){
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public double calculateSalary(){
		return 1000;
		
	}
	public String toString() {
        return empId+ " "+empName+" "+empSalary;
    } 
	

}
