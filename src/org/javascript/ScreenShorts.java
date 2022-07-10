package org.javascript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShorts {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//type casting
		TakesScreenshot tk=(TakesScreenshot)driver;
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		
		//to store default location
		File sourcefile = tk.getScreenshotAs(OutputType.FILE);
		//to store desired location
		File desnation = new File("C:\\vino\\selenium01.png");
	    FileUtils.copyFile(sourcefile, desnation);
	    WebElement username = driver.findElement(By.id("email"));
	    Object usersendkeys = jk.executeScript("arguments[0].setattribute('value','vino@gmail.om')",username);
	  //to store default location
	  	File sourcefile1 = tk.getScreenshotAs(OutputType.FILE);
	  	//to store desired location
	  	File desnation1 = new File("C:\\vino\\selenium02.png");
	  	FileUtils.copyFile(sourcefile1, desnation1);  
	    
		
	}

}
