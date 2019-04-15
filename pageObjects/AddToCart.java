package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {
	
	public static WebElement element = null;
	
	public static void MoveToNewWindow(WebDriver driver)
	{
		
		driver.getCurrentUrl();
		System.out.println(driver.getTitle());
	}
	//input[@name ='submit.add-to-cart']
	public static WebElement SectingQuantity(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//select[@name ='quantity']"));
	Select s1 = new Select(element);
	s1.deselectByValue("1");
	return element;
	
		
	}
	
	public static WebElement AddToCartPption(WebDriver driver)
	{
		
		element = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		element.click();
	  	return element;
		
	}
}
