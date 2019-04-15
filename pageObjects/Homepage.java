package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Homepage {
	public static WebElement element = null;
	
	
	public static WebElement MouseHoverlnk_Logout(WebDriver driver)
	{
		Actions act = new Actions(driver);
		element = driver.findElement(By.id("nav-link-accountList"));
		act.moveToElement(element).build().perform();
		return element;
	}
	
	public static WebElement lnk_Logout(WebDriver driver)
	{
		
		element = driver.findElement(By.xpath("//span[contains(text(),\"Hello, Prachi\")]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		WebElement e2 = driver.findElement(By.linkText("Sign Out"));
		e2.click();
		return element;
	}
	
	

}
