package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzQzMTI4NzQwLCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");
		browserObject.findElement(By.name("firstname")).sendKeys("John");
		browserObject.findElement(By.name("lastname")).sendKeys("Mark");
		
		WebElement Month=browserObject.findElement(By.name("birthday_month"));
		Select cn=new Select(Month);
		cn.selectByVisibleText("Feb");
		WebElement Day=browserObject.findElement(By.name("birthday_day"));
		Select sn=new Select(Day);
		sn.selectByVisibleText("10");
		WebElement Year=browserObject.findElement(By.name("birthday_year"));
		Select yn=new Select(Year);
		yn.selectByVisibleText("1990");
		browserObject.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/span/span[2]/label")).click();
		browserObject.findElement(By.name("reg_email__")).sendKeys("Johnmark123@aol.com");
		browserObject.findElement(By.id("password_step_input")).sendKeys("John5421$");
		
	}

}
