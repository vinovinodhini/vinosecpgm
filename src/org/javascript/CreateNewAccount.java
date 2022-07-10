package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewAccount {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		WebElement email = driver.findElement(By.name("emailOrPhone"));
		Object emailbox = jk.executeScript("arguments[0], setAttribute('value','v.vinodhini.bsc@gmail.com')",email);
		jk.executeScript("return arguments[0].getAttribute('value')",emailbox);
		
		
	}

}
