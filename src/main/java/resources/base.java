package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/teguhbudi/eclipse/workspace/testPergi"
				+ "/Staging/src/main/java/resources/data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName + " is running");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","/Users/teguhbudi/Downloads/webdriver/chromedriver");
			driver = new ChromeDriver();
		}else if (browserName.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}else if (browserName.equals("safari"))
		{
			
		}
		return driver;
	}
}
