package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.AddToCart;
import pageObjects.ShoppingPage;

public class CartPage {
	
	public static void ExecuteAddToCart(WebDriver driver) throws Exception 

	{
		AddToCart.MoveToNewWindow(driver);
		//AddToCart.SectingQuantity(driver);
		//AddToCart.AddToCartPption(driver);
	}

	
	

}
