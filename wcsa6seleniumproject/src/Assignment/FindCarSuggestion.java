package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindCarSuggestion {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
	    driver.switchTo().activeElement().sendKeys("car");       //to get the suggestion of element
	    Thread.sleep(2000);
	   
	
	     List<WebElement> carsuggestions = driver.findElements(By.xpath("//div[@class='pcTkSc']")); //(ctrl+1 click)
	         
	       for(int i=0; i<carsuggestions.size();i++)
	         {
	        	 Thread.sleep(2000);
	        	 System.out.println(carsuggestions.get(i).getText());  
	        	 
	        	 //sysout+ ctrl+bar
	        	 
	         }
	         Thread.sleep(2000);
        	 driver.quit();
	      
	
	}

}
//by using advance for loop read the list
 // for (  car : carsuggestions                    )





























