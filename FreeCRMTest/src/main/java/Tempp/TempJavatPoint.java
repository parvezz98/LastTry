package Tempp;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TempJavatPoint {
	@Test
	public void ruN() throws Exception {
		 System.setProperty("webdriver.chrome.driver","E:/OxygenWorkplace/FreeCRMTest/Drivers/chromedriver.exe");
 
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) d;
		d.get("http://demo.guru99.com/Agile_Project/Agi_V1/");
		//d.findElement(By.xpath("//td[@id='gs_tti50']/input")).sendKeys("Ruby");
		//d.findElement(By.xpath("//td[@id='gs_tti50']/input")).sendKeys(Keys.ENTER);
		//js.executeScript("window.scrollBy(0,2500)", "");
	//	String parent= d.getWindowHandle();
		//System.out.println(parent);
		d.switchTo().frame("_mN_main_224278574_0_n");
		Thread.sleep(5000);
		d.findElement(By.id("dk1")).click();
		Set<String> wndwss=d.getWindowHandles();
		Iterator<String> itr=wndwss.iterator();
		String parent=itr.next();
		String child=itr.next();
		System.out.println(parent);
		System.out.println(child);
	/* String child= d.getWindowHandle();
	 System.out.println(child);*/
	 d.switchTo().window(child);
	 
	d.findElement(By.id("ResultsLogoImg1")).getText();
	
		
		
	}
}
