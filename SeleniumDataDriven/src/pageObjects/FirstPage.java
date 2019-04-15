package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FirstPage {
	
public static WebElement element = null;
	
	public static WebElement SignUpProcessStart(WebDriver driver)
	{
		
		element = driver.findElement(By.xpath("//span[contains(text(),\"Hello, Sign in\")]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		return element;
	}
	
	public static WebElement clickOnSignUP(WebDriver driver)
	{
		
		element = driver.findElement(By.linkText("Start here."));
		return element;
	}

}
