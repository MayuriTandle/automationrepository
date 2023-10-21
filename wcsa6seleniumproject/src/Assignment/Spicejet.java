package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Spicejet {
public static void main(String[] args) throws InterruptedException {
	
	//handle notification popup
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--disable-notifications");
	
	
	//-------
	WebDriver driver= new ChromeDriver(co);
	driver.manage().window().maximize();
	
	//spicejet
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-jwli3a r-xb2eav r-majxgm r-q4m81j'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-jwli3a r-xb2eav r-majxgm r-q4m81j'])[2]")).click();
		Thread.sleep(2000);
	
	
 }
}

