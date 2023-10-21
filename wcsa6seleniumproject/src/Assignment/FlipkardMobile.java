package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkardMobile {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/?cmpid=sem_3856208402_Mobiles_dsa_goog&gclid=CjwKCAjwt52mBhB5EiwA05YKo2YlnK5y1HIExqWdPDPcQXc33bw-KPY9P2CSvSfRhX90MvzQcRK1ShoCPlwQAvD_BwE");
	Thread.sleep(2000);
	ChromeOptions co =new ChromeOptions();
	co.addArguments("--disable-notifications");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
	
	}

}
