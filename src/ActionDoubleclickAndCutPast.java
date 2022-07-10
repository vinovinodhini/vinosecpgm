
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDoubleclickAndCutPast {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		//inspect username box
		WebElement username = driver.findElement(By.id("heading20"));
		username.click();
		//to create object for action
		Actions act=new Actions(driver);
		//to perform double click on username box
		act.contextClick(username).perform();
		Thread.sleep(3000);
		//Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_WINDOWS);
		//r.keyRelease(KeyEvent.VK_WINDOWS);
	//	r.keyPress(KeyEvent.VK_CONTROL);
	//	r.keyPress(KeyEvent.VK_X);
	//	r.keyRelease(KeyEvent.VK_CONTROL);
	//	r.keyRelease(KeyEvent.VK_X);
	}
}
		
	









/*	//keyboard action in robot predefined class
		Robot r=new Robot();
		//to cut the username box text
		for (int i = 0; i <4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(4000);
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		//to past the copied text
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
	}
}	
		*/
		
		/*
		 //keyboard actions keypress and keyrelease
		  //keyboard action in robot predefined class
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		//Thread.sleep(3000);
		
	//	r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);*/
		
		
	