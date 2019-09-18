package org.test.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class FlightJourney {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\universal\\Desktop\\selenium\\Selenium\\Driver\\chromedriver.exe");	
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://paytm.com/flights");
//	       WebElement from = driver.findElement(By.xpath("((//input[@type='text'])[1])"));
//	       from.click();
//	       WebElement delbtn = driver.findElement(By.xpath("((//span[@class='_2xZQ'])[1])"));
//	       delbtn.click();
//	       WebElement to = driver.findElement(By.xpath("((//input[@type='text'])[2])"));
//	        to.click();
//	        WebElement banbtn = driver.findElement(By.xpath("((//span[@class='_2xZQ'])[2])"));
//	        banbtn.click();
//	       WebElement btn = driver.findElement(By.xpath("(//button[@class='button button--default button--bold _3LRd'])"));
//	      btn.click(); 
	       WebElement clk = driver.findElement(By.xpath("((//button[@class='_15aE'])[1])"));
	       clk.click();
	       List<WebElement> flights = driver.findElements(By.xpath("//div[@class='_3H-S']"));
	       int s = flights.size();
	       System.out.println(s);
	       for (WebElement x : flights) {
	    	   System.out.println(x);
			}
	       flights.get(0).click();
	       
 
	 }}