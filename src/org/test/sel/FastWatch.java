package org.test.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FastWatch {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\universal\\Desktop\\selenium\\Selenium\\Driver\\chromedriver.exe");	
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.amazon.in/");
	      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("fastrack watches men");
	      Robot r= new Robot();
	      r.keyPress(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_ENTER);
	      List<WebElement> items = driver.findElements(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])"));
	      int s = items.size();
	      System.out.println(s);
      for (WebElement x : items) {
    		 System.out.println(x.getText());
	    		    }
	    	items.get(4).click();

		

	    	
}
	     
	      
	      
	      }


