package com.day3tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("i-icon-profile"));
		findElement.click();
		WebElement signin = driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']"));
		signin.click();
		Thread.sleep(3000);
		WebElement mblno = driver.findElement(By.xpath("//input[@data-message='Please enter valid mobile number|Please enter valid mobile number']"));
		mblno.sendKeys("9176800246");
		WebElement checkbox = driver.findElement(By.id("recaptcha-anchor"));
		checkbox.click();
		WebElement otp = driver.findElement(By.id("otp-container"));
		otp.click();
	}
}
