package javaExtraPractice;

public class SubMountainBikes extends BaseBicycle {
	
	public int seatHeight;//class attribute 
	
	public SubMountainBikes(int gear, int speed, int startHeight)
	{
		super(gear, speed);//invoking base class constructor
		this.seatHeight = startHeight;
				
	}
	
	public void setHeight(int newHeight)
	{
		seatHeight = newHeight;
	}
	
	public String toString()
	{
		return (super.toString()+"\n"+"seatHeight is "+seatHeight);
	}

	
}
