package selenium_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://demo.itlearn360.com/");
		List<WebElement> link=browserObject.findElements(By.tagName("a"));
		
		for(WebElement links:link)
		{
			String url=links.getAttribute("href");
			System.out.println(url);
		}
	}

}
