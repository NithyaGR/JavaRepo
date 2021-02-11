package javaExtraPractice;

public class ConstructorClassPractice {
    int var1=100;
    static int var2=5;
    
    public ConstructorClassPractice(int i) // Class Constructor should have the same name as class
    {
    	//var1 = 100;
    	var1 = i;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ConstructorClassPractice obj1 = new ConstructorClassPractice(10);
        System.out.println(obj1.var1);// at the time of object creation, the value int var1 is assigned to the object
	    //System.out.print(VariablesAndDataTypes.st); Within the same package only you can access any static variables
        System.out.println(var2);
	}
	

}
