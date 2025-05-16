package selenium_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		browserObject.findElement(By.id("alert")).click();
		Alert dn= browserObject.switchTo().alert();
		dn.accept();
		
		browserObject.findElement(By.id("confirm")).click();
		Alert an=browserObject.switchTo().alert();
		an.dismiss();
		
		browserObject.findElement(By.id("prompt")).click();
		Alert cn=browserObject.switchTo().alert();
		cn.sendKeys("John A");
		cn.accept();
		
		}

}
