package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netfixlogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		
		//call the web page element netfix
		driver.findElement(By.id("id_userLoginId")).sendKeys("1234");
		// passwrod 
		driver.findElement(By.id("id_password")).sendKeys("heyyy");
		Thread.sleep(5000);
		
	driver.findElement(By.className("btn login-button btn-submit btn-small")).click();
				
		
		
				
	}

}
