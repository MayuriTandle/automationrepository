package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		//create a new account on Facebook
		
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("mannu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("patil");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys("2233445566");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[contains(@id,'day')]")).sendKeys("7");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[contains(@id,'month')]")).sendKeys("Nov");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[contains(@id,'year')]")).sendKeys("1998");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@name,'websubmit')]")).click();
		Thread.sleep(2000);
	}

}
