package testng_Package;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoit360 {
	
	ChromeDriver browserObject;
	
	@Test(priority=1,groups="login")
	public void opendemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		  browserObject = new ChromeDriver();
		browserObject.get("https://demo.itlearn360.com/");
		browserObject.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
	@Test(priority=2,groups="login")
public void openlogin()

{
browserObject.findElement(By.id("loginlabel")).click();
browserObject.findElement(By.id("user_login")).sendKeys("Demo12");
browserObject.findElement(By.id("user_pass")).sendKeys("Test123456$");
browserObject.findElement(By.id("wp-submit")).click();
	
	
}
	@Test(priority=4,groups="explore")
	public void opensearch()
	
	{
	browserObject.findElement(By.id("search_course")).sendKeys("HTML for beginners");	
	browserObject.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button")).click();	
		
		
	
	}
	@Test(priority=3)
	public void dash()
	{
	
		String expectedValue="Dashboard";
		String actualValue=browserObject.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a")).getText();
		assertEquals(expectedValue,actualValue);
	}
	
	
	
}
