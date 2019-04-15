package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
	
public static WebElement element = null;
	
	public static WebElement custName(WebDriver driver)
	{
		
		element = driver.findElement(By.xpath("//input[@name=\"customerName\"]"));
		return element;
	}
	public static WebElement cust_mail(WebDriver driver)
	{
		
		element = driver.findElement(By.xpath("//input[@name=\"secondaryLoginClaim\"]"));
		return element;
	}
	
	public static WebElement cust_pwd(WebDriver driver)
	{
		
		element = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		return element;
	}


}
