package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample5 {
	WebDriver driver;
	long startingtime;
	long endtime;
	
	//Aim: open chrome and go to
	//google.com and bing.com and yahoo.com and close the browser
	
	@BeforeSuite
	public void launchBrowser() {
	    startingtime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		 driver=new ChromeDriver();	
	}
	@Test
	public void openagoogle() {
		driver.get("http://www.google.co.in");
	}
	@Test
    public void openabing() {
		driver.navigate().to("http://www.bing.com");
	}
	@Test
    public void openayahoo() {
		driver.navigate().to("http://www.yahoo.com");
	}
		@AfterSuite
		public void closethebrowser() {	
			driver.close();
			endtime=System.currentTimeMillis();
			long totaltime=endtime-startingtime;
			System.out.println("total time taken:"+totaltime);
}
}
