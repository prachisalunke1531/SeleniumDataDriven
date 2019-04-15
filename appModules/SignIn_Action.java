package appModules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.Homepage;
import pageObjects.LoginPage;
import utility.ExcelUtils;

public class SignIn_Action {

	public static void Execute(WebDriver driver) throws Exception 
	{
		//get value from excel
		LoginPage.signingIN(driver);
		String sUserName = ExcelUtils.getCellData(1, 1);
		
		String sPassword = ExcelUtils.getCellData(1, 2);
		
		LoginPage.enterNumber(driver).sendKeys(sUserName);
	WebElement	element1=driver.findElement(By.xpath("//input [@id=\"continue\"]"));
		element1.click();
		//LoginPage.continueButton(driver);
		LoginPage.EnterPasssword(driver).sendKeys(sPassword);
		WebElement	element2=	driver.findElement(By.xpath("//input [@id=\"signInSubmit\"]"));
		element2.click();
		//LoginPage.clickOnLogin(driver).click();
	
		
		/*LoginPage.LoginandSignupButton(driver).click();
		
		LoginPage.continueButton(driver).click();
		LoginPage.LoginwithPasswordButton(driver).click();
		LoginPage.EnterPasssword(driver).sendKeys(sPassword);
		LoginPage.clickOnLogin(driver).click();*/
		driver.getTitle();
		String title = driver.getTitle();
		System.out.println(title);
		boolean isHomePageButton = driver.findElements(By.xpath("//input[@title='Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in']")).size()>0;
		System.out.println(isHomePageButton);
		
		
	}
	
	
}
