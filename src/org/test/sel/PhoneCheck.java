package org.test.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneCheck {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\universal\\Desktop\\selenium\\Selenium\\Driver\\chromedriver.exe");	
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.flipkart.com");
	      WebElement Crs=driver.findElement(By.xpath(("//button[@class='_2AkmmA _29YdH8']")));
			Crs.click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("fast track watches men");
			 Robot f=new Robot();
		       f.keyPress(KeyEvent.VK_ENTER);
		       f.keyRelease(KeyEvent.VK_ENTER);
		       List<WebElement> items = driver.findElements(By.xpath("(//div[@class='_3JlYXy'])"));
		       int p = items.size();
		       System.out.println(p);
		       
	      
}
}