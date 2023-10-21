package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLaptop {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
				 driver.manage().window().maximize();
		 
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 
		 //popup
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 Thread.sleep(2000);
		  driver.findElement(By.name("q")).sendKeys("laptop");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Processor']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//div[@class='_2gmUFU _3V8rao'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[contains(@class,'_3879cV')and(text()='Core i5')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Brand']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='HP']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		 Thread.sleep(2000);
		

		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
