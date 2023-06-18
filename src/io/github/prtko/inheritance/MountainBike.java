package io.github.prtko.inheritance;

public class MountainBike extends bicycle 
{
	public int seatHeight;
	public MountainBike(int startHeight, int startSpeed, int startGear )
	{
		super(startSpeed,startGear);
		this.seatHeight=startHeight;
		
	}
	
	public void setHeight(int newValue)
	{
		this.seatHeight=newValue;
	}

}
