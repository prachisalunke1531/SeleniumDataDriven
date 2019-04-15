package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
	
	 public static WebElement element = null;
	
	public static WebElement signingIN(WebDriver driver)
	{
		
		WebElement element1  = driver.findElement(By.xpath("//span[contains(text(),\"Hello, Sign in\")]"));
		Actions act = new Actions(driver);
		act.moveToElement(element1).build().perform();
		
		element = driver.findElement(By.linkText("Sign in"));
	     element.click();
		System.out.println("******************");
		return element;
		
	}
	
	
	public static WebElement enterNumber(WebDriver driver)
	{
		
		element = driver.findElement(By.xpath("//input [@name=\"email\"]"));
		return element;
	}
	
	public static WebElement continueButton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//input [@id=\"continue\"]"));
		//element = driver.findElement(By.xpath("//div[@class=\"a-section\"]//span[@id=\"continue\"]//span[@class='a-button-inner']//input[@id=\"continue\"]"));
		return element;
	}
	
	
	public static WebElement EnterPasssword(WebDriver driver)
	{

		element = driver.findElement(By.xpath("//input [@name=\"password\"]"));
		return element;
	}
	
	public static WebElement clickOnLogin(WebDriver driver)
	{
		
		//element = driver.findElement(By.xpath("//input [@id=\"signInSubmit\"]"));
		return element;
		
	
	}
}
