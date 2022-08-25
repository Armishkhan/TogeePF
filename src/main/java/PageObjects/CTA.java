package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.SMOKE_POF.BaseClass;

public class CTA {
	
	WebDriver driver; 
	WebDriverWait wait = new WebDriverWait(driver,30);
	
	public CTA(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(className = "chat_plugin_icon") 
	WebElement CTA_button;
	
	@FindBy(className = "close_icon_container") 
	WebElement Tooltip_Cancel;
	
	
	
	public void cta_Click() {
		CTA_button.click();
		}
}
