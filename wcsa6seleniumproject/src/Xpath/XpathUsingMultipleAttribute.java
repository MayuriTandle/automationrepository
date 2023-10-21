package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qsp.ChromeBrowser;

public class XpathUsingMultipleAttribute {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		//get the selenium webpage
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		
		//java and python
		driver.findElement(By.xpath())
		
	}

}
