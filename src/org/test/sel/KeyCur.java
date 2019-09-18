package org.test.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyCur {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\universal\\Desktop\\selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.sprint.com/");
//			WebElement CurMove=driver.findElement(By.xpath("(//button[@class='unstyled-button sprint-menu__root js-nav-link-root'])[4]"));
//			Actions a=new Actions(driver);
//			a.moveToElement(CurMove).perform();
//			Robot r=new Robot();
//			for(int i=1;i<10;i++);
//			{
//				r.keyPress(KeyEvent.VK_DOWN);
//				r.keyRelease(KeyEvent.VK_DOWN);
//				
//			}
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);
//			WebElement pressBtn=driver.findElement(By.xpath("(//a[@class='js-nav-link'][1])"));
//			pressBtn.click();
		driver.get("https://www.flipkart.com");
		WebElement Crs=driver.findElement(By.xpath(("//button[@class='_2AkmmA _29YdH8']")));
		Crs.click();
		WebElement ck=driver.findElement(By.xpath("(//input[@title='Search for products, brands and more'])"));
		ck.sendKeys("iphone");
		WebElement clk=driver.findElement(By.xpath("(//button[@class='vh79eN'])"));
		clk.click();
		List<WebElement> dr  = driver.findElements(By.xpath("(//div[@class='_3BTv9X'])"));
  
		
		
		

		 
	}

}
