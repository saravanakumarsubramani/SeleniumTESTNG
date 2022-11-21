package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample10 {
	
	//1.asseration means checking equals or not with given input
	
	String name="agni";
	boolean value=false;
	
	@Test
	public void checkequal() {
		Assert.assertNotEquals(name, "Agni");
		Assert.assertFalse(value, "this should not be true");	
	}
}
