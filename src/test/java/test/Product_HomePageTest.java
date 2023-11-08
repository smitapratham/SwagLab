package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.Product_HomePage;

public class Product_HomePageTest extends BaseTest
{
	@BeforeMethod 
	public void openBrowser()
	{
		driver=LaunchBrowser.openBrowser();
		
	}
	@Test
	
public void addTocart1Product() throws InterruptedException
{
	SwagLabsLoginTest obj1=new SwagLabsLoginTest();
	obj1.logincredintials1();///query----------------------------------------
	Product_HomePage obj2=new Product_HomePage(driver);
	obj2.addToCartButton1();
	Assert.assertTrue(obj2.removeButton1());
	Thread.sleep(2000);
	obj2.cartclick();
}
	
	
	@Test
	
	public void removeProduct1FromCart() throws InterruptedException
	{
		SwagLabsLoginTest obj1=new SwagLabsLoginTest();
		obj1.logincredintials1();///query----------------------------------------
		Product_HomePage obj2=new Product_HomePage(driver);
		obj2.addToCartButton1();
		Assert.assertTrue(obj2.removeButton1());
		Thread.sleep(2000);
		obj2.cartclick();
		Thread.sleep(2000);
		obj2.removeButtonclick();
		Thread.sleep(2000);
		obj2.cartcontinueshoppingButton();
	}
	
	@Test
	
	public void addTocart1_2Products() throws InterruptedException
	{
		SwagLabsLoginTest obj1=new SwagLabsLoginTest();
		obj1.logincredintials1();///query----------------------------------------
		Product_HomePage obj2=new Product_HomePage(driver);
		obj2.addToCartButton1();
		obj2.addToCartButton2();
		Assert.assertTrue(obj2.removeButton1());
		Assert.assertTrue(obj2.removeButton2());
		Thread.sleep(2000);
		obj2.cartclick();
		
	}
@Test
	
	public void remove1_2Products() throws InterruptedException
	{
		SwagLabsLoginTest obj1=new SwagLabsLoginTest();
		obj1.logincredintials1();///query----------------------------------------
		Product_HomePage obj2=new Product_HomePage(driver);
		obj2.addToCartButton1();
		obj2.addToCartButton2();
		obj2.addToCartButton3();
		Assert.assertTrue(obj2.removeButton1());
		Assert.assertTrue(obj2.removeButton2());
		Assert.assertTrue(obj2.removeButton3());
		Thread.sleep(2000);
		obj2.cartclick();
		Thread.sleep(2000);
		obj2.removeButtonclick();
		obj2.removeButtonclick2();
		obj2.removeButtonclick3();
		Thread.sleep(2000);
		obj2.cartcontinueshoppingButton();
	}



}
