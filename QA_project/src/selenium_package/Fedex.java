package selenium_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fedex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.manage().window().maximize();
		
		browserObject.get("https://www.ups.com/track?loc=en_US&requester=ST/");
		browserObject.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		browserObject.findElement(By.id("stApp_trackingNumber")).sendKeys("1Z813R850399127300");
		browserObject.findElement(By.id("stApp_btnTrack")).click();
		
	}

}
