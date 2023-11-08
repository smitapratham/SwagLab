package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.OverviewPage;
import pom.Product_HomePage;

public class OverviewPageTest extends BaseTest


{
	@BeforeMethod 
	public void openBrowser()
	{
		driver=LaunchBrowser.openBrowser();
		
	}
	
	@Test

	public void calculation1() throws InterruptedException
	{
		SwagLabsLoginTest obj1=new SwagLabsLoginTest();
		obj1.logincredintials1();///query----------------------------------------
		Product_HomePage obj2=new Product_HomePage(driver);
		OverviewPage overviewpage=new OverviewPage(driver);
		
		obj2.addToCartButton1();
		obj2.addToCartButton2();
		String t1=obj2.getProductTitle(0);
		String t2=obj2.getProductTitle(1);
		
		Thread.sleep(2000);
		String d1=obj2.getProductPrice(0);
		String d2=obj2.getProductPrice(1);
		System.out.println("Title1->"+t1);
		System.out.println("Title2->"+t2);
		System.out.println("Price1->"+d1);
		System.out.println("Price2->"+d2);
		Thread.sleep(2000);
		obj2.getProductTitle(0);
		obj2.getProductTitle(1);
		
		
		Assert.assertTrue(obj2.removeButton1());
		Assert.assertTrue(obj2.removeButton2());
		
		Thread.sleep(2000);
		obj2.cartclick();
		System.out.println("Cart 1->"+overviewpage.cart1Title());
		System.out.println("Cart 2->"+overviewpage.cart2Title());
		
		String c1=overviewpage.getcartProductPrice(0);
		String c2=overviewpage.getcartProductPrice(1);
		System.out.println("Cartprice 1->"+c1);
		System.out.println("Cartprice 2->"+c2);
		Assert.assertTrue(t1.equals(overviewpage.cart1Title()));
		Assert.assertTrue(t2.equals(overviewpage.cart2Title()));
		
	
		Thread.sleep(2000);
		
		obj2.checkoutCart();
		Thread.sleep(3000);
		overviewpage.infoContinueButton();
		overviewpage.enterfirstname();
		overviewpage.enterlastname();
		overviewpage.enterpostcode();
		overviewpage.infoContinueButton();
		
		
		
		
	}
	
	
	//////////////////////////////////////////////
	
	@Test

	public void calculation2() throws InterruptedException
	{
		SwagLabsLoginTest obj1=new SwagLabsLoginTest();
		obj1.logincredintials1();///query----------------------------------------
		Product_HomePage obj2=new Product_HomePage(driver);
		OverviewPage overviewpage=new OverviewPage(driver);
		
		obj2.addToCartButton1();
		obj2.addToCartButton2();
		String t1=obj2.getProductTitle(0);
		String t2=obj2.getProductTitle(1);
		
		Thread.sleep(2000);
		String d1=obj2.getProductPrice(0);
		String d2=obj2.getProductPrice(1);
		System.out.println("Title1->"+t1);
		System.out.println("Title2->"+t2);
		System.out.println("Price1->"+d1);
		System.out.println("Price2->"+d2);
		Thread.sleep(2000);
		obj2.getProductTitle(0);
		obj2.getProductTitle(1);
		
		
		Assert.assertTrue(obj2.removeButton1());
		Assert.assertTrue(obj2.removeButton2());
		
		Thread.sleep(2000);
		obj2.cartclick();
		System.out.println("Cart 1->"+overviewpage.cart1Title());
		System.out.println("Cart 2->"+overviewpage.cart2Title());
		
		String c1=overviewpage.getcartProductPrice(0);
		String c2=overviewpage.getcartProductPrice(1);
		System.out.println("Cartprice 1->"+c1);
		System.out.println("Cartprice 2->"+c2);
		
		
	
		Thread.sleep(2000);
		
		obj2.checkoutCart();
		Thread.sleep(3000);
		overviewpage.infoContinueButton();
		overviewpage.enterfirstname();
		overviewpage.enterlastname();
		overviewpage.enterpostcode();
		overviewpage.infoContinueButton();
		
	double price1=Double.parseDouble(c1.substring(1));
	double price2=Double.parseDouble(c2.substring(1));
	
	System.out.println("convertedoverviewprice 1->"+price1);
	System.out.println("convertedoverviewprice 1->"+price2);
	double itemtotal=price1+price2;
	System.out.println("itemtotal->"+itemtotal);
		//Assert.assertTrue(itemtotal==(price1+price2));
		
		
		
		
		
		
	}
}
