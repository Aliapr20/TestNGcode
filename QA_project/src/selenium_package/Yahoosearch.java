package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoosearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://www.yahoo.com/");
		browserObject.findElement(By.id("uh-sbq")).sendKeys("samsungS24");
		browserObject.findElement(By.xpath("//*[@id=\"module-uh\"]/div/div[1]/form/div[3]/button")).click();
	
	}

}
