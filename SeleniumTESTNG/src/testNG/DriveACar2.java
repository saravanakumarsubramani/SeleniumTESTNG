package testNG;

import org.testng.annotations.Test;

public class DriveACar2 {
	
	//example for drive a car and priority 
	
	@Test(priority=0)
	public void StarttheCar() {
		System.out.println("StarttheCar");
	}
	@Test(priority=1)
	public void PutFirstGear() {
		System.out.println("FirstGear");
	}
	@Test(priority=2)
	public void PutSecondGear() {
		System.out.println("SecondGear");
	}
	@Test(priority=3)
	public void PutThirdGear() {
		System.out.println("ThirdGear");
	}
	@Test(priority=4)
	public void PutFourthGear() {
		System.out.println("FourthGear");
	}
}
