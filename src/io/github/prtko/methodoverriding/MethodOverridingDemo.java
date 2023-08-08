package io.github.prtko.methodoverriding;

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Bicycle bicycle=new Bicycle(10,1);
		System.out.println("Bicycle gear is:"+bicycle.gear);
		System.out.println("Bicycle speed is:"+bicycle.speed);
		bicycle.applyBrake(1);
		System.out.println("Bicycle speed after applying break is:"+bicycle.speed);
		
		Bicycle mountainBike=new MountainBike(50,50,3);
		System.out.println("Mountain Bike Gear is "+mountainBike.gear);
		System.out.println("Mountain Bike Speed is "+mountainBike.speed);
		mountainBike.applyBrake(1);
		System.out.println("Mountain Bike speed after brake : "+mountainBike.speed);
		mountainBike.speedUp(10);
		System.out.println("Mountain Bike Gear is "+mountainBike.speed);
	}

}
