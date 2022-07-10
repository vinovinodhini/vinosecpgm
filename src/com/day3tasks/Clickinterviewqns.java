package com.day3tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickinterviewqns {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
	WebElement interviewclick = driver.findElement(By.id("heading20"));
	interviewclick.click();
	WebElement cts = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
	cts.click();
	
	
	
	
	
	}
	
}
