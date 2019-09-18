package org.test.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\universal\\Desktop\\selenium\\Selenium\\Driver\\chromedriver.exe");	
       WebDriver driver=new ChromeDriver();
       driver.get("http://toolsqa.com/automation-practice-table");
       List<WebElement> tRows = driver.findElements(By.tagName("tr"));
       int i; 
       int j;
       for( i=0;i<tRows.size();i++);
      {
    	
	WebElement row= tRows.get(i);
	{
List<WebElement> tDatas = row.findElements(By.tagName("td"));
for( j=0;j<tDatas.size();j++);
{
WebElement data = tDatas.get(j);
String text = data.getText();
System.out.println(text);
}}
}}}