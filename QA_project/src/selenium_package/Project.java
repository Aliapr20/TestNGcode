package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		
		browserObject.findElement(By.name("name")).sendKeys("John MArk");
		browserObject.findElement(By.id("eml")).sendKeys("john12@yahoo.com");
		browserObject.findElement(By.name("website")).sendKeys("www.amazon.com");
		browserObject.findElement(By.name("comment")).sendKeys("good website");
		browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
		browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
		browserObject.findElement(By.name("bike")).click();
		browserObject.findElement(By.name("car")).click();
		browserObject.findElement(By.name("boat")).click();
		browserObject.findElement(By.name("horse")).click();
		
		WebElement country=browserObject.findElement(By.name("country"));
		Select cn=new Select(country);
		cn.selectByVisibleText("Ethiopia");
		WebElement skills=browserObject.findElement(By.name("skill"));
		Select sn=new Select(skills);
		sn.selectByVisibleText("Database");
		sn.selectByVisibleText("Quality Assurance");
		browserObject.findElement(By.name("submit")).click();
		
		
	}

}
