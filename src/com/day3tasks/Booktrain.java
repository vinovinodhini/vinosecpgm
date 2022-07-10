package com.day3tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Booktrain {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.id("from_station"));
		from.sendKeys("Erode Junction (ED)");
		WebElement to = driver.findElement(By.id("to_station"));
		to.sendKeys("bangaloru");
		WebElement selectclass = driver.findElement(By.id("trainClass"));
		Select s=new Select(selectclass);
		s.selectByVisibleText("AC First Class (1A)");
		WebElement adult = driver.findElement(By.id("train_adults"));		
		Select s1=new Select(adult);
		s1.selectByValue("2");
		WebElement child = driver.findElement(By.id("train_children"));
		Select s2=new Select(child);
		s2.selectByIndex(1);
		WebElement men = driver.findElement(By.id("train_male_seniors"));
		Select s3=new Select(men);
		s3.selectByIndex(1);
		WebElement female = driver.findElement(By.id("train_female_seniors"));
		Select s4=new Select(female);
		s4.selectByVisibleText("2");
		WebElement sear = driver.findElement(By.id("trainFormButton"));
		sear.click();
		
	
	
	
	
	}

}
