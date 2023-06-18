package io.github.prtko.inheritance;

public class ImheritanceDemo {

	public static void main(String[] args) 
	{
		MountainBike mountainBike=new MountainBike(12,56,3);
		
		System.out.println("Gear is: "+mountainBike.gear);
		System.out.println("Seat height is: "+mountainBike.seatHeight);
		System.out.println("bike speed  is: "+mountainBike.speed);
		
		mountainBike.applyBrake(1);
		System.out.println("bike speeed after applying brake  is: "+mountainBike.speed);
		
	}

}
