package automation_Framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import utility.Constant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import appModules.CartPage;
import appModules.ShopPage;
import appModules.SignIn_Action;
import pageObjects.AddToCart;
import pageObjects.Homepage;
import utility.ExcelUtils;

public class Apache_POI_TC {
	
	private static WebDriver driver = null;
	
	public static int i = 1;
	
	
	public static void main(String args[]) throws Exception
	{
		ExcelUtils.setExcelFile(Constant.TestDataLocation,"Sheet1");
		System.setProperty("webdriver.chrome.driver", "F:\\Java\\Selenium required data\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URL);

		SignIn_Action.Execute(driver);
		ShopPage.ExecuteSearchProduct(driver);
		CartPage.ExecuteAddToCart(driver);
		//WebElement element3 = driver.findElement(By.xpath("//select[@name ='quantity']"));
		//Select s1 = new Select(element3);
	//	s1.deselectByValue("1");
		//WebElement element4 = driver.findElement(By.xpath("//input[@id=\"buy-now-button\"]"));
		//element4.click();
	//	Thread.sleep(5000);
		//System.out.println("***********");
		Homepage.lnk_Logout(driver);
	 // Homepage.action.moveToElement(MensSection).perform();
		System.out.println("***********");
		Thread.sleep(5000);
		
			Homepage.lnk_Logout(driver).click();
			System.out.println("111111");
			
			driver.close();
			System.out.println("Done");
	}

}
