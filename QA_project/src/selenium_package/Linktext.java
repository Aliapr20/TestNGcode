package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://google.com");
		browserObject.findElement(By.linkText("Gmail")).click();
		
		
	}

}
