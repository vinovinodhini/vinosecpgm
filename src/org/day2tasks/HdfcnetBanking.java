package org.day2tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcnetBanking {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		WebElement hdfc = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
		hdfc.sendKeys("vinodhini22");
		WebElement continuebutton = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		continuebutton.click();
	}
}
