package org.Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverWait {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement usertext = driver.findElement(By.id("email"));
	usertext.sendKeys("vino@gmail.com");
	//Thread.sleep(3000);
	
	//webdriverwait
	WebDriverWait w=new WebDriverWait(driver,10);
	WebElement textpass = w.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
	textpass.sendKeys("12345678");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement login = driver.findElement(By.name("login"));
	login.click();
}
}
