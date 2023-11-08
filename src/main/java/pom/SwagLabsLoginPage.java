package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//"https://www.saucedemo.com/"
public class SwagLabsLoginPage 
{
	//all datamembers are declared globally and private
	
		
	@FindBy (xpath="//input[@id='user-name']")private WebElement username;
	
	@FindBy (xpath="//input[@id='password']")private WebElement password;
	
	
	@FindBy (xpath="//input[@id='login-button']")private WebElement loginbutton;
	
	public SwagLabsLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		}
	
	public void enterUsername(String s1)
	{
		username.sendKeys(s1);
	}
	
	public void enterPassword(String s2)
	{
	password.sendKeys(s2);
	}
	
	
	
	public void clickLoginButton()
	{
		loginbutton.click();
	}
	
}
