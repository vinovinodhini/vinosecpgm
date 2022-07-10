package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Typecasting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//typecasting
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		//inspect userid box
		WebElement textuserid = driver.findElement(By.id("email"));
		//insert values using javascriptexecutor
		jk.executeScript("arguments[0].setAttribute('value','vino@gmail.com')",textuserid);
		//inspect password
		WebElement textpass = driver.findElement(By.id("pass"));
		jk.executeScript("arguments[0].setAttribute('value','1234567')",textpass);
		//inspect loginbutton
		WebElement login = driver.findElement(By.name("login"));
		jk.executeScript("arguments[0].click()",login);
			}

}
