package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;
import pageObjects.ShoppingPage;

public class ShopPage {
	public static void ExecuteSearchProduct(WebDriver driver) throws Exception 

	{
		ShoppingPage.SearchBar(driver);
		ShoppingPage.SearchBarClick(driver);
		ShoppingPage.ResultFilter(driver);
	}

}
