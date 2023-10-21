package Wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qsp.ChromeBrowser;

public class ImplicitWait {
	public static void main(String[] args) {
		
	WebDriver driver	= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait()
	driver.get("http://desktop-isuqd6k/login.do");
	
	
	}

}
