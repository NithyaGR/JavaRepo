package javaExtraPractice;

public class InheritanceBikesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubMountainBikes mb = new SubMountainBikes(3, 100, 25);
		System.out.println(mb.toString());
		mb.applyBrake(5);
		
		System.out.println(mb.speed);
		
		mb.speedUp(10);
		System.out.println(mb.speed);
		
		mb.setHeight(10);
		System.out.println(mb.seatHeight);
		BaseBicycle bb = new BaseBicycle(3,100);
		bb.applyBrake(2);
		System.out.println(bb.speed);
		bb.speedUp(5);
		bb.toString();
		System.out.println("Speed is "+bb.speed+" "+"No of Gears "+bb.gear);
		
		BaseBicycle bb1 = new SubMountainBikes(3, 100, 25);
		
		bb1.applyBrake(5);
		bb1.speedUp(10);
		//bb1.setHeight(24); //This is error, the method setHeight(int) is undefined for the type BaseBicycle
		//System.out.println(bb1.seatHeight);
		System.out.println(bb1.gear);
		System.out.println(bb1.speed);
		System.out.println(bb1.toString());
		
		
		
	}

}
