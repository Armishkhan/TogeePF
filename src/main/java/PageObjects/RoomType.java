package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM.SMOKE_POF.BaseClass;

public class RoomType {
	
	WebDriver driver;
	
	@FindBy(className = "togee_card1")
	WebElement Public_type;
	
	@FindBy(className = "togee_card1")
	WebElement Private_type;
	
	@FindBy(className = "question_container")
	WebElement info_option;
	
	@FindBy(className = "footer_cancel_btn")
	WebElement Cancel_option;
	
	@FindBy(className = "footer_next_btn")
	WebElement Next_button;
	
	public RoomType(WebDriver driver) {
	   BaseClass.driver = driver;
	   PageFactory.initElements(driver, this);
	}
	
	public void Room_selection() {
	   Public_type.click();
	   Next_button.click();
	} 
	
}
