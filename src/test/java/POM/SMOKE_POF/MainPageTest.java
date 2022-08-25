package POM.SMOKE_POF;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import PageObjects.CTA;
import PageObjects.CreateShow;
import PageObjects.Home;
import PageObjects.RoomType;

public class MainPageTest {
        
	public static void main(String[] args) throws HeadlessException, UnsupportedFlavorException, IOException, InterruptedException {
		CTA obj_CTA;
		RoomType obj_RoomType;
		CreateShow obj_CreateShow;
		Home obj_Home;
		
	
		public static void setup() {
		ChromeOptions option = new ChromeOptions();
		//Allowing the camera and mic permissions
		Map<String, Object> prefs = new HashMap<String, Object>();
	    option.addArguments("auto-select-desktop-capture-source=Entire screen");
		prefs.put("profile.default_content_setting_values.media_stream_mic", 1);
		prefs.put("profile.default_content_setting_values.media_stream_camera", 1);
		option.setExperimentalOption("prefs", prefs);	
		//launching chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		//setting explicit wait condition
		WebDriverWait wait = new WebDriverWait(driver,30);
		//Maximizing the browser 
		driver.manage().window().maximize();	
		//Opening togee client
		driver.navigate().to("https://dropinn.shop/");
		
		
		//Creating CTA's page object
		obj_CTA = new CTA(driver);
		
		//Clicking on the CTA button
		obj_CTA.cta_Click();
	
		//Creating Room type page object
		obj_RoomType = new RoomType(driver);
		//Selecting room type
		
		obj_RoomType.Room_selection();
		
		//Creating Sign in page object
		obj_CreateShow = new CreateShow(driver);
		
		//Creating the room
		obj_CreateShow.Show_creation();
		
		//Creating Home object
		obj_Home = new Home(driver);
		
		//inviting participants
		obj_Home.Inviting_participants();
		
		//Sharing screen
		obj_Home.Screen_share();
		
		//Chat test
		obj_Home.chat();
		
		//Camera and mic test
		obj_Home.Camera_Mic();
		
	
		}
	}
	private static void setup() {
		// TODO Auto-generated method stub
		
	}

		
		
	}
