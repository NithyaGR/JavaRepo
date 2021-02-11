package javaExtraPractice;

public class BaseBicycle {
	
	//the following are class variables, or class attributes, or fields. 
	public int gear;
	public int speed;
	
	// class constructor for BaseBicycle
	
	public BaseBicycle(int gear, int speed)
	
	{
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBrake(int decrement)
	{
		speed -= decrement;
	}
	
	public void speedUp(int increment)
	{
		speed += increment;
	}
	
	public String toString()
	{
		return("No of Gears are "+gear +"\n"+ "Speed is "+speed);
	}

}
