package POM.SMOKE_POF;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;
    public static Properties prop;
    
    public static void browser_initialization(String Browser)
    {
    	String browser_name = prop.getProperty("Browser");
    	if(browser_name.equals("Chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver", "C:\\\\Chromedriver\\\\chromedriver.exe");
    		driver = new ChromeDriver(); 
    	}
    	else if (browser_name.equals("Firefox"))
    	{
    		System.setProperty("webdriver.gecko.driver", "C:\\\\GecoDriver\\\\geckodriver.exe");
    		driver = new FirefoxDriver();
    	}
    	
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.navigate().to("https://dropinn.shop/");
    	//driver.get(prop.getProperty("https://dropinn.shop/"));
    }	
}
