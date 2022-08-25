package POM.SMOKE_POF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest 
{
	//public static PageFactory page;
	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions(); 	
		driver = new ChromeDriver(option);
		//Maximizing the browser 
		driver.manage().window().maximize();
				
		//Opening togee client
		driver.navigate().to("https://dropinn.shop/");
		
	}

}
