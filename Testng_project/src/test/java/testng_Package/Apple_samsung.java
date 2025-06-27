package testng_Package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Apple_samsung {
	@Test(priority=1)
	public void openapple()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://www.apple.com/");
	}
	@Test(priority=2)
	public void opensamsung()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://www.samsung.com/");
	}
	
}
