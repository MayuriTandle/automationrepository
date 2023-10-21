package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindPohaSuggestion {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		//TO GET THE SUGGESTION ELEMNENT 
		driver.switchTo().activeElement().sendKeys("poha");
		Thread.sleep(2000);
		
		
		
		for()
	}

}
