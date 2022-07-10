package org.Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {
public static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement usertext = driver.findElement(By.id("email"));
	usertext.sendKeys("vino");
	Wait w=new FluentWait(driver).withTimeout(Duration.ofSeconds(100)).pollingEvery(Duration.ofSeconds(20)).ignoring(Throwable.class);
	Object untill=w.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
	//WebElement element=(WebElement)until;
	//element.sendKeys("123456");
	
	//git push and pull
	System.out.println("fluentwait");
}
}
