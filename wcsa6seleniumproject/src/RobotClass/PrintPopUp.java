package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopUp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//page
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		//to acess the method of robot class
		 Robot robot = new Robot();
		 
		// to press ctrl button
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 
		 // to press p button
		 robot.keyPress(KeyEvent.VK_P);
		 
		 //to relase ctrl button
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 // release the p button
		 robot.keyRelease(KeyEvent.VK_P);
		 
	}
}
