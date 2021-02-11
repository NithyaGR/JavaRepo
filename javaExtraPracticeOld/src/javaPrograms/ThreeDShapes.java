package javaPrograms;

public class ThreeDShapes {

	double length; // instance variables
	double width;
	double height;
	double radious;
	
	public void aprintVolume(double d1){
		
		System.out.println("volume of cuboid is "+" "+d1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double volume;
        ThreeDShapes cuboid = new ThreeDShapes();
        cuboid.length = 5.0;
        cuboid.width = 3.5;
        cuboid.height = 2.0;
        volume = cuboid.length*cuboid.width*cuboid.height;
        
        cuboid.aprintVolume(volume);
        System.out.println("Done");
        System.out.println(VariablesAndDataTypes.st);
	}

}
