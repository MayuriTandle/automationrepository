package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetcurrentUrlPage {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver = new ChromeDriver();
	driver.manage().window().maximize();
	 Thread.sleep(2000);
	driver.get("https://www.instagram.com/");
	 String urlofloginPage = driver.getCurrentUrl();
	 System.out.println(urlofloginPage);

	
	}

}
