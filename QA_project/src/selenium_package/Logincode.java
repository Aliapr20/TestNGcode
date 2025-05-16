package selenium_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.manage().window().maximize();
		
		browserObject.get("https://demo.itlearn360.com/");
		browserObject.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		browserObject.findElement(By.id("loginlabel")).click();
		browserObject.findElement(By.id("user_login")).sendKeys("Demo12");
		browserObject.findElement(By.id("user_pass")).sendKeys("Test123456$");
		browserObject.findElement(By.id("wp-submit")).click();
		
	}

}
