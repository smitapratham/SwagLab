package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage 

{
	
	@FindBy (xpath="//input[@id='continue']")private WebElement infoContinueB;
	
	
	@FindBy (xpath="//input[@id='first-name']")private WebElement firstname;
	
	
	
	@FindBy (xpath="//input[@id='last-name']")private WebElement lastname;

	@FindBy (xpath="//input[@id='postal-code']")private WebElement postcode;
	
	
	
	@FindBy (xpath="//a[@id='item_4_title_link']")private WebElement cart1title;
	@FindBy (xpath="//a[@id='item_0_title_link']")private WebElement cart2title;
	
	@FindBy (xpath="//div[@class='inventory_item_price']")private List<WebElement> cartprice;
	
	
	//div[@class='inventory_item_price']
	
	
	public OverviewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterfirstname()
	{
		firstname.sendKeys("Smita");
	}
	
	public void enterlastname()
	{
		lastname.sendKeys("Patil");
	}
	
	public void enterpostcode()
	{
		postcode.sendKeys("421301");
	}
	public void infoContinueButton()
	{
		infoContinueB.click();
		
	}
	
	
	public String  cart1Title()
	{
		return cart1title.getText();
		
	}
	public String  cart2Title()
	{
		return cart2title.getText();
		
	}
	
	 public String getcartProductPrice(int index){
		
	        return cartprice.get(index).getText() ;
	    }
}
