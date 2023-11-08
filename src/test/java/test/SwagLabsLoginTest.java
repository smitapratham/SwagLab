package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.SwagLabsLoginPage;

public class SwagLabsLoginTest extends BaseTest
{
	
		
		
		
		@BeforeMethod 
		public void openBrowser()
		{
			driver=LaunchBrowser.openBrowser();
			
		}
		
		
		@Test
		public void logincredintials1()
		{
			SwagLabsLoginPage slab=new SwagLabsLoginPage(driver);
			slab.enterUsername("standard_user");
			slab.enterPassword("secret_sauce");
			slab.clickLoginButton();
		}
		
		@Test
		public void logincredintials2()
		{
			SwagLabsLoginPage slab=new SwagLabsLoginPage(driver);
			slab.enterUsername("locked_out_user");
			slab.enterPassword("secret_sauce");
			slab.clickLoginButton();
		}
		@Test
		public void logincredintials3()
		{
			SwagLabsLoginPage slab=new SwagLabsLoginPage(driver);
			slab.enterUsername("problem_user");
			slab.enterPassword("secret_sauce");
			slab.clickLoginButton();
		}
		@Test
		public void logincredintials4()
		{
			SwagLabsLoginPage slab=new SwagLabsLoginPage(driver);
			slab.enterUsername("performance_glitch_user");
			slab.enterPassword("secret_sauce");
			slab.clickLoginButton();
		}
		@Test
		public void logincredintials5()
		{
			SwagLabsLoginPage slab=new SwagLabsLoginPage(driver);
			slab.enterUsername("error_user");
			slab.enterPassword("secret_sauce");
			slab.clickLoginButton();
		}
		@Test
		public void logincredintials6()
		{
			SwagLabsLoginPage slab=new SwagLabsLoginPage(driver);
			slab.enterUsername("visual_user");
			slab.enterPassword("secret_sauce");
			slab.clickLoginButton();
		}
		
		
		
	}

