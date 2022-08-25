package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateShow  {
	
	WebDriver driver;
	@FindBy(className = "name_input")
	WebElement Name_input_field;
	
	@FindBy(className = "privacy_policy_text_anchor")
	WebElement Privacy_policy;
	
	@FindBy(className = "terms_of_conditions_text_anchor")
	WebElement Terms_of_service;
	
	@FindBy(className = "cw_back_btn")
	WebElement Back_button;
	
	@FindBy(className = "cw_footer_cancel_btn")
	WebElement Cancel_option;
	
	@FindBy(className = "cw_footer_create_btn")
	WebElement Create_room_button;

	
	
	public CreateShow(WebDriver driver) {
		   this.driver = driver;
		   PageFactory.initElements(driver, this);
		}
		
		public void Show_creation() {
			Name_input_field.sendKeys("Armish");
			Create_room_button.click();
		} 
		
}
