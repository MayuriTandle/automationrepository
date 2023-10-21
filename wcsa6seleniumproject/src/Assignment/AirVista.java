package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class AirVista {
	public static void main(String[] args) throws InterruptedException {
		
		//handle popup
		ChromeOptions co = new ChromeOptions();
co.addArguments("--disable-notifications");
		
		
WebDriver driver= new ChromeDriver(co);
driver.manage().window().maximize();
		
//web page
driver.get("https://www.airvistara.com/in/en/travel-information/vistara-exclusives/vistara-direct?gclid=CjwKCAjwq4imBhBQEiwA9Nx1BuI6TbLT51MVsyaq2Y9NjFthHbLf-Zh-T4YzUYgnfUy2xS6aXQLcZxoCunMQAvD_BwE&utm_source=google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=CjwKCAjwq4imBhBQEiwA9Nx1BuI6TbLT51MVsyaq2Y9NjFthHbLf-Zh-T4YzUYgnfUy2xS6aXQLcZxoCunMQAvD_BwE:G:s&s_kwcid=AL!596!3!659805002549!p!!g!!air%2520vistara&s_kwcid=AL!596!3!659805002549!p!!g!!air+vistara&gad=1");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Select Departure City']")).sendKeys("pune");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@aria-label='Search destination']")).sendKeys("mumbai");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@monthname='Jul']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).sendKeys("31");
Thread.sleep(2000);
}
}



