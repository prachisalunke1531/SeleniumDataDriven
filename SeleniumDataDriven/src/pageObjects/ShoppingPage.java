package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ShoppingPage {
	
	
public static WebElement element = null;
	
	public static WebElement SearchBar(WebDriver driver)
	{
		
		element = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	  	element.sendKeys("Samsung 32 inches smart tv");
		return element;
		
	}
	
	public static WebElement SearchBarClick(WebDriver driver)
	{
		
		element = driver.findElement(By.xpath("//input[@value=\"Go\"]"));
		element.click();
	  	return element;
		
	}
	public static WebElement ResultFilter(WebDriver driver)
	{
		
		element = driver.findElement(By.xpath("//span[@id=\"a-autoid-0\"]"));
		element.click();
		WebElement selectdrpdown = driver.findElement(By.xpath("//select[@id=\"s-result-sort-select\"]"));
		Select s = new Select(selectdrpdown);
		s.selectByVisibleText("Price: Low to High");
		driver.findElement(By.linkText("Samsung 80 cm (32 Inches) Series 4 HD Ready LED TV UA32N4010AR (Black) (2018 model)")).click();
		return selectdrpdown;
		
	}
	
}
