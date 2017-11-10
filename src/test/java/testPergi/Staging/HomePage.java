package testPergi.Staging;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class HomePage extends base {

	@BeforeTest
	public void initialize() throws IOException 
	{
		driver = initializeDriver();
		
		driver.get(prop.getProperty("url"));
		
		//driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(1600, 900));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void homePageNavigation() throws IOException, InterruptedException
	{
		
		Thread.sleep(5000);
		LandingPage landingpage = new LandingPage(driver);
		landingpage.getLogin().click();
		
		
	}
	
	@AfterTest
	public void shutDown()
	{
		driver.close();
	}
}
