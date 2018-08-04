package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
 
	@FindBy(xpath="//td[@align='left']/font")
	@CacheLookup
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactLink;
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement NewContactLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement taskLink;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
		
	}
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}
	public ContactPage clickOnContactLink() {
		contactLink.click();
		return new ContactPage();
	}
	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}
	public TaskPage clickOnTaskLink() {
		taskLink.click();
		return new TaskPage();
	}
	public void ClickOnNewContactLink() {
		Actions action= new Actions(driver);
		action.moveToElement(contactLink).build().perform();;
		NewContactLink.click();
	}
	
	
}
