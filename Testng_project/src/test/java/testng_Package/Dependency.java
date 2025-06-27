package testng_Package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dependency {
	@Test()
	public void openamazon()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("amazon.com/");
	}

	@Test(dependsOnMethods="openamazon")
	public void opentwitter()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://www.twitter.com/");
	}

	@Test(dependsOnMethods="opentwitter")
	public void opengoogle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://www.google.com/");
	}





}
