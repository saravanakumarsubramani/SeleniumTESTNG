package testNG;

import org.testng.annotations.Test;

public class SkipATestCase3 {
	
	//Example for skip the testcase and enabled =false using this keyword 
	//we will skip
	
	@Test(priority=0)
	public void StarttheCar() {
		System.out.println("StarttheCar");
	}
	@Test(priority=0,enabled = false)
	public void Turnonthemusic() {
		System.out.println("Music turned ON");
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
