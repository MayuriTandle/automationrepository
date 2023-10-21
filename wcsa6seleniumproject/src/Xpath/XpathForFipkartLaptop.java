package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForFipkartLaptop {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//call the web page
		driver.get("https://www.flipkart.com/search?q=laptop&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");

		
				//
		//laptop
		driver.findElement(By.xpath("//div[text()='Infinix INBook Y1 Plus Intel Core i3 10th Gen - (8 GB/256 GB SSD/Windows 11 Home) XL28 Thin and Light ...']")).click();
	
	}

}
//div[text()='Infinix INBook Y1 Plus Intel Core i3 10th Gen - (8 GB/256 GB SSD/Windows 11 Home) XL28 Thin and Light ...']