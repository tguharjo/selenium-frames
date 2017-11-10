package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

public WebDriver driver;
	
	By masuk = By.cssSelector(".inline.btn-login");
	By tiketpesawat = By.cssSelector("a[href*='home_flight']");
	By leftnavbar = By.cssSelector(".pull-left>ul>li>a");
	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(masuk);
	}
	
	public WebElement getTiketPesawat()
	{
		return driver.findElement(tiketpesawat);
	}
	
	public WebElement getLeftNavbar()
	{
		return driver.findElement(leftnavbar);
	}
}
