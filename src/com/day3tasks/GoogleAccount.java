package com.day3tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAccount {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("vino");
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("vinodhini");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("vvinodhinibsc455");
		WebElement pass = driver.findElement(By.name("Passwd"));
		pass.sendKeys("vino@123vino@123");
		WebElement cpass = driver.findElement(By.name("ConfirmPasswd"));
		cpass.sendKeys("vino@123vino@123");
		WebElement nex = driver.findElement(By.xpath("//span[text()='Next']"));
		nex.click();
		Thread.sleep(3000);;
		WebElement mblno = driver.findElement(By.id("phoneNumberId"));
		mblno.sendKeys("9176800246");
		WebElement ne = driver.findElement(By.xpath("//span[text()='Next']"));
		ne.click();
	
	}
	
}
