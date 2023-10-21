package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://desktop-isuqd6k/login.do");
		
		driver.findElement(By.xpath("//input[@class='textField']")).sendKeys("admin");
		Thread.sleep(4000);
		
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='content tt_selected selected']/descendant::div[.='Time-Track']")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//div[@class='label' and(.='Tasks') ]/ancestor::a")).click();
		 Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@class='label' and (.='Reports')]/ancestor::a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='label' and(.='Users') ]/ancestor::a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='label' and(.='Work Schedule')]/ancestor::a")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@class='label' and(.='Settings')]/ancestor::a")).click();
	Thread.sleep(3000);
	
	}
	

}
