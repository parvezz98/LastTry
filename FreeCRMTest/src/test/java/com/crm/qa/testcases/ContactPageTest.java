package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactPage contactPage;
	String sheetNamee = "contacts";
	
	public ContactPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil= new TestUtil();
		loginPage= new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.switchToFrame();
		contactPage=homePage.clickOnContactLink();
		
	}
	@Test(priority=1)
	public void  verifyContactPageLabel() {
		
		Assert.assertTrue(contactPage.verifyContactLabel(),"contact  Lael is missing on the page");
	}
	@Test(priority=2)
	public void selectSingleContactByName() {
		contactPage.selectContactsByName("aaa ccc");
	}
	@Test(priority=3)
	public void selectMultipleContactByName() {
		contactPage.selectContactsByName("aaa ccc");
		contactPage.selectContactsByName("aaaaaaaaaaa aaaaaaa");
	}
	
	@DataProvider
	public Object[][] getCRMTestData() {
		Object data[][]=TestUtil.getTestData(sheetNamee);
		return data;
	}
	@Test(priority=4, dataProvider="getCRMTestData")
	
	public void validateCreateNewContact(String title,String ftName,String ltName, String comp) {
		homePage.ClickOnNewContactLink();
		contactPage.createNewContact(title, ftName, ltName, comp);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
