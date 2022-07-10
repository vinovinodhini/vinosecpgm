package com.day3tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registerform {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fname.sendKeys("vino");
		WebElement lname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lname.sendKeys("vinodhini");
		Thread.sleep(3000);
		//WebElement address = driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']"));
		//address.sendKeys("namakkal");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("v.vinodhini.bsc@gmail.com");
		WebElement phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		phone.sendKeys("9876543223");
		WebElement female = driver.findElement(By.xpath("//input[@value='FeMale']"));
		female.click();
		WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.id("checkbox3"));
		checkbox2.click();
		//WebElement lang = driver.findElement(By.id("msdd"));
		//lang.sendKeys("english");
		WebElement skill = driver.findElement(By.id("Skills"));
		Select s4=new Select(skill);
		s4.selectByVisibleText("Javascript");
		Thread.sleep(3000);
		WebElement country = driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']"));
        country.sendKeys("India");
		WebElement year = driver.findElement(By.id("yearbox"));
		Select s0=new Select(year);
		s0.selectByIndex(4);
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s=new Select(month);
		s.selectByIndex(2);
		WebElement day = driver.findElement(By.id("daybox"));
		Select s1=new Select(day);
		s1.selectByIndex(3);
		WebElement fpass = driver.findElement(By.id("firstpassword"));
		fpass.sendKeys("12345");
		WebElement lpass = driver.findElement(By.id("secondpassword"));
		lpass.sendKeys("12345");
		WebElement submit = driver.findElement(By.id("submitbtn"));
		submit.click();
		
}
}