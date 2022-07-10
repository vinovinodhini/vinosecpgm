package org.javascript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleScreenshots {
	public static WebDriver driver;
	public static void screenShots(String name) throws IOException {
		//type casting
		TakesScreenshot tk=(TakesScreenshot)driver;
		//to store default location
		File sourcefile = tk.getScreenshotAs(OutputType.FILE);
		//to store desired location
		File desnation=new File("C:\\vino\\src"+name+".png");
		FileUtils.copyFile(sourcefile, desnation);
	}
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	public static void launchBrowser(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static WebElement id(String idvalue) {
		WebElement findElement = driver.findElement(By.id(idvalue));
		return findElement;
	}
	public static WebElement password(String pwd) {
		
		WebElement findElement2 = driver.findElement(By.id(pwd));
		return findElement2;
	}
	public static void action() {
		Actions act=new Actions(driver);
		WebElement source = driver.findElement(By.id("credit2"));
		WebElement desnation = driver.findElement(By.id("bank"));
		act.dragAndDrop(source, desnation).perform();
	}
	public static void doubleClick() {
		Actions act=new Actions(driver);
		act.doubleClick().perform();

	}
	public static void robot() throws AWTException, InterruptedException {
		Robot r=new Robot();
		//cut
		for(int i=0;i<2;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//past
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
			
	}
	
	public static void alert()   {
	WebElement alertwithok = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));	
	alertwithok.click();
		}
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
		getDriver();
		launchBrowser("https://www.facebook.com/");
		id("email").sendKeys("vino");
		screenShots("UserName");
		password("pass").sendKeys("123456");;
		screenShots("password");
		launchBrowser("https://demo.guru99.com/test/drag_drop.html");
		action();
		screenShots("action");
		launchBrowser("https://www.facebook.com/");
		id("email").sendKeys("vino");
		doubleClick();
		screenShots("doubleClick");
		robot();
		screenShots("robot");
		launchBrowser("http://demo.automationtesting.in/Alerts.html");
		alert();
		screenShots("aalert");
	
		
	}

}
