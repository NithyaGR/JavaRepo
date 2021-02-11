package javaExtraPractice;

public class EmployeeConstructorTest {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1001, "Ram", 300000);
		Address address = new Address();
		address.setLine1("6 DunnerdaleRd");
		address.setLine2(" ");
		address.setCity("Morris Plains");
		address.setState("NJ");
		address.setZip("07950");
		
		emp1.setAddress(address);
		System.out.println(address);
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getAddress().getCity());
		System.out.println(emp1.getAddress().getZip());
		emp1.getAddress().setLine2("Powder Mill");
		System.out.println(address.getLine2());
		System.out.println(emp1.getAddress().getLine2());
		
		Technician tech = new Technician(2001);
		tech.setGrade("A");
		System.out.println(tech.calculateSalary());
		JuniorTechnician jt = new JuniorTechnician(4501);
		jt.setGrade("B");
		System.out.println(jt.calculateSalary());
		
		System.out.println(emp1);
		System.out.println(tech);
		System.out.println(jt);
		System.out.println(emp1.hashCode());
		System.out.println(tech.hashCode());
		System.out.println(jt.hashCode());
		 
				
			
		
	}

}
