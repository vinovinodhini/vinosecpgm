package org.day2tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registerform {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		username.sendKeys("vino");
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("vinodhini");
		WebElement email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		email.sendKeys("vinodhini.bsc@gmail.com");
		WebElement phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		phone.sendKeys("123456");
		//WebElement lang = driver.findElement(By.id("msdd"));
		//lang.sendKeys("tamil");
		WebElement fpass = driver.findElement(By.id("firstpassword"));
		fpass.sendKeys("123@123");
		WebElement secpass = driver.findElement(By.id("secondpassword"));
		secpass.sendKeys("123@123");
		
		
		
	}
	
}
