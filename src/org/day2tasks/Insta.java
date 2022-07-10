package org.day2tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("vino@gmail.com");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("1233344");
}
}
