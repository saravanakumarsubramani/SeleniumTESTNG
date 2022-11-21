package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample8 {
	
	//1.parameterization example .we will import a parameters.
	
	@Test
	@Parameters("Name")
	public void printname(String name) {
		System.out.println("name is"+name);
	}

}
