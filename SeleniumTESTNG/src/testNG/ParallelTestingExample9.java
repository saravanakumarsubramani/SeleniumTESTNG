package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestingExample9 {
	
	@Test
	public void opengoogle() {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();	
		 driver.get("http://www.google.com");
	}
	@Test
    public void openbing() {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();	
		 driver.get("http://www.bing.com");
	}
}
