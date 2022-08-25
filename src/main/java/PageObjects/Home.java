package PageObjects;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	
	WebDriver driver;
	
	@FindBy(className = "tlss_invitation_button")
	WebElement Invite_participants_button;
	
	@FindBy(className = "tlss_feature_screen_share")
	WebElement Screen_share_button;
	
	@FindBy(className = "tlss_feature_message")
	WebElement Chat_button;
	
	@FindBy(className = "tlss_message_input")
	WebElement Chat_input_field;
	
	@FindBy(className = "tlss_message_input_send_icon")
	WebElement Message_send_button;
	
	@FindBy(className = "tlss_camera_enabled_icon")
	WebElement Camera_button;
	
	@FindBy(className = "tlss_feature_doddle")
	WebElement doodle_button;
	
	@FindBy(className = "tlss_doddle_color_picker_button")
	WebElement color_picker_button;
	
	@FindBy(className = "tlss_doddle_color2")
	WebElement selected_color2;
	
	@FindBy(xpath = "//*[@data-id='bags']")
	WebElement doodle1;
	
	@FindBy(xpath = "//*[@data-id='shoes']")
	WebElement doodle2;
	
	@FindBy(className = "tlss_doddle_color3")
	WebElement selected_color3;
	
	@FindBy(xpath = "//*[@data-id='blazers']")
	WebElement doodle3;
	
	@FindBy(how = How.CSS, using = "img[src='https://dropinn.shop/wp-content/uploads/2022/05/unsplash_b4Xk6bzgQWU-1-240x300.png']") 
	WebElement doodle4;
	
	@FindBy(className = "tlss_doddle_color4")
	WebElement selected_color4;
	
	@FindBy(xpath = "//*[@data-id='hoodies']")
	WebElement doodle5;
	
	@FindBy(how = How.CSS, using = "img[src='https://dropinn.shop/wp-content/uploads/2022/05/unsplash_KVDSfJ79_JU-240x300.png']") 
	WebElement doodle6;
	
	@FindBy(className = "tlss_doddle_color8")
	WebElement selected_color8;
	
	@FindBy(xpath = "//*[@data-id='tops']")
	WebElement doodle7;
	
	@FindBy(how = How.CSS, using = "img[src='https://dropinn.shop/wp-content/uploads/2022/05/unsplash_SLDpJ6UB1Qs-200x300.png']") 
	WebElement doodle8;
	
	@FindBy(className = "tlss_doddle_undo_icon_container")
	WebElement doodle_undo;
    
	@FindBy(className = "tlss_doddle_redo_icon_container")
	WebElement doodle_redo;
	
	@FindBy(className = "tlss_feature_star")
	WebElement home_star_icon;
	
	public Home(WebDriver driver) {
		   this.driver = driver;
		   PageFactory.initElements(driver, this);
	}
	
	public void Inviting_participants() {
		Invite_participants_button.click();		
	} 
	
	public void Screen_share() {
		Screen_share_button.click();
	} 
	
	public void chat() {
		Chat_button.click();
		for (int i=1; i<=10; i++)
        {
			Chat_input_field.sendKeys("Armishh" + i);	
			Message_send_button.click();					
      	}
		Chat_button.click();
	} 
	
	public void Camera_Mic() {
	   
	} 
	
}
