package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase{
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement companyName;
	
	@FindBy(xpath="//tr/td[@colspan='2']/input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	public boolean verifyContactLabel() {
		return contactsLabel.isDisplayed();
	}
	
	public void selectContactsByName(String name){
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
				+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	}
	public void createNewContact(String title, String ftName, String ltName, String Comp) {
		Select select= new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		companyName.sendKeys(Comp);
		try {
		Thread.sleep(5000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		saveBtn.click();
	}
}
