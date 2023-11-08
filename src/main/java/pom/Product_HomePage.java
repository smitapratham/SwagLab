package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_HomePage 
{

	
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement addtocart1;
	
	
	@FindBy (xpath="//div[@class='inventory_item_name ']")private List<WebElement> prodTitle ;
	
	
	@FindBy (xpath="//div[@class='inventory_item_price']")private List<WebElement> prodprice ;
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")private WebElement addtocart2;
	
	
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")private WebElement addtocart3;
	
	@FindBy (xpath="//button[@id='remove-sauce-labs-backpack']")private WebElement removebutton1;
	
	
	@FindBy (xpath="//button[@id='remove-sauce-labs-bike-light']")private WebElement removebutton2;
	
	
	@FindBy (xpath="//button[@id='remove-sauce-labs-bolt-t-shirt']")private WebElement removebutton3;
	
	
	@FindBy (xpath="//div[@id=\"shopping_cart_container\"]/a")private WebElement cart;
	
	
	@FindBy (xpath="//button[@id='continue-shopping']")private WebElement cartcontinueshopping;
	
	
	@FindBy (xpath="//button[@id='checkout']")private WebElement checkoutBcart;
	
	
	
	
	public Product_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addToCartButton1()
	{
		addtocart1.click();
	}
	public void addToCartButton2()
	{
		addtocart2.click();
	}
	
	public void addToCartButton3()
	{
		addtocart3.click();
	}
	public boolean removeButton1()
	{
		return removebutton1.isDisplayed();
	}
	
	public boolean removeButton2()
	{
		return removebutton2.isDisplayed();
	}
	
	public boolean removeButton3()
	{
		return removebutton3.isDisplayed();
	}
	public void cartclick()
	{
		cart.click();
	}
	public void removeButtonclick()
	{
		 removebutton1.click();
	}
	public void removeButtonclick2()
	{
		 removebutton2.click();
	}
	public void removeButtonclick3()
	{
		 removebutton3.click();
	}
	
	public void cartcontinueshoppingButton()
	{
		cartcontinueshopping.click();
	}
	
	public void checkoutCart()
	{
		checkoutBcart.click();
		
	}
	
	
	 public String getProductTitle(int index){
	        return prodTitle.get(index).getText();
	    }
	
	 public String getProductPrice(int index){
		 //double d=Double.parseDouble(prodprice.get(index).getText());
	        return prodprice.get(index+1).getText() ;
	    }
	
	
}
