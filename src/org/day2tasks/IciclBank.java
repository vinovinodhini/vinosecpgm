package org.day2tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciclBank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		WebElement icici = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		icici.sendKeys("vinodhini");
		WebElement password = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		password.sendKeys("9876765");
}
}