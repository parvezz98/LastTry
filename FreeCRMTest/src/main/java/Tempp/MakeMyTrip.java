package Tempp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeMyTrip {
	public static WebDriver driver;
@Test
	public static void m2() throws Exception {
		System.setProperty("webdriver.chrome.driver","E:/OxygenWorkplace/FreeCRMTest/Drivers/chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
      driver.get("https://www.makemytrip.com/");

      //driver.findElement(By.className("input_fromto checkSpecialCharacters ui-autocomplete-input ui-autocomplete-loading")).click();
	//driver.findElement(By.xpath("//div[@class='inputM inputHlp inputFilter visited']/input[@id='hp-widget__sfrom']")).click();
  //    driver.findElement(By.id("departDate")).click();
	driver.findElement(By.cssSelector("#hp-widget__depart")).click();
	}
public static void m1() throws Exception {
	
	File scrFle= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String currentDir=  System.getProperty("user.dir");
	System.out.println(currentDir);
	File f= new File(currentDir+"/raiden/"+"Rain.png");
	//FileUtils.copyFile(scrFle, new File(currentDir+"/screanshot/"+System.currentTimeMillis()+" .word"));
	FileUtils.copyFile(scrFle, f);
	
}

}
