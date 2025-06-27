package testng_Package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Openwebsite {
	
@Test(priority=1)
public void openamazon()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	
	ChromeDriver  browserObject = new ChromeDriver();
	browserObject.get("http://www.amazon.com/");
}

@Test(priority=2)
public void opentwitter()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	
	ChromeDriver  browserObject = new ChromeDriver();
	browserObject.get("http://www.twitter.com/");
}

@Test(priority=3)
public void opengoogle()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	
	ChromeDriver  browserObject = new ChromeDriver();
	browserObject.get("http://www.google.com/");
}




}
