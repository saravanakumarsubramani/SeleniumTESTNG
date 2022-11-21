package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement4 {
	
	//1.example for dependencies 
	//problem1: you have to admit a student to engineering
	//problem2: you have to admit a student to highschool
	
	@Test(enabled = true)
	public void highschool() {
		System.out.println("high school");
	}
	@Test(dependsOnMethods = "highschool")
	public void highersecondaryschool() {
		System.out.println("high secondary school");
	}
	@Test(dependsOnMethods = "highersecondaryschool")
	public void college() {
		System.out.println("engineering");
	}

}
