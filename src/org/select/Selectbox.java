package org.select;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("vinodhiniranjith");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("21V3HP");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		Thread.sleep(3000);
		
	/*	WebElement clickhere = driver.findElement(By.xpath("//a[text()='Click here']"));
		clickhere.click();
		
		//emailrecovery
		WebElement emailrecovery = driver.findElement(By.id("emailadd_recovery"));
		emailrecovery.sendKeys("v.vinodhini.bsc@gmail.com");
		*/
		
		
		// to select location
		WebElement location = driver.findElement(By.id("location"));
		Select s=new Select(location);
		//to select based on index
		s.selectByIndex(5);
		Thread.sleep(3000);
		
		// to select hotel
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1=new Select(hotel);
		//to select based on visible text
		s1.selectByVisibleText("Hotel Sunshine");
		Thread.sleep(3000);
		
		//to select room type
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s2=new Select(roomtype);
		//to select based on visible text
		s2.selectByVisibleText("Deluxe");
		Thread.sleep(3000);
		
		//to select number of rooms
		WebElement numberofrooms = driver.findElement(By.id("room_nos"));
		Select s3=new Select(numberofrooms);
		//to select attribute value
		//s3.selectByVisibleText(4 - Four);
		s3.selectByIndex(4);
		Thread.sleep(3000);
		
		// to select checkin date
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		//checkin.sendKeys("10/08/2000");
		//Select s4=new Select(checkin);
		//to select  attribute value
		
		//checkout
		Thread.sleep(3000);
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys("20/08/2000");
		Thread.sleep(3000);
		
		//to select adult per room
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s5=new Select(adult);
		//to select adult
		s5.selectByVisibleText("2 - Two");
		Thread.sleep(3000);
		
		//to select children
		WebElement children = driver.findElement(By.id("child_room"));
		Select s6=new Select(children);
		//to select based on visible text
		s6.selectByVisibleText("1 - One");
		Thread.sleep(3000);
		
		//search
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
		//NEXT PAGE SELECT RADIO BUTTON
		
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		radiobutton.click();
		
		//click continue
		WebElement clickcontinue = driver.findElement(By.id("continue"));
		clickcontinue.click();
		
		//fill first name box
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("vinodhini");
		
		//fill lastname
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("venkatachalam");
		
		//address
		WebElement billingaddreess = driver.findElement(By.id("address"));
		billingaddreess.sendKeys("12/74 s.pudhupalayam. namakkal");
		
		//enter cridit card no
		WebElement criditno = driver.findElement(By.id("cc_num"));
		criditno.sendKeys("1234 1234 1234 1234");
		
		//cridit card type
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		// to select based on attribute value
		Select s7=new Select(cardtype);
		s7.selectByValue("MAST");
		
		//expiry date select month
		WebElement expdate = driver.findElement(By.id("cc_exp_month"));
		Select s8=new Select(expdate);
		//to select visiblity text
		s8.selectByVisibleText("November");
		
		//expiry date select year
		WebElement expmonth = driver.findElement(By.id("cc_exp_year"));
		Select s9=new Select(expmonth);
		//to select based on attribute value
		s9.selectByValue("2022");
		
		//cvv number
		WebElement cvvno = driver.findElement(By.id("cc_cvv"));
		cvvno.sendKeys("987");
		
		//click boo now
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();
		
		//click itinerary
		//JavascriptExecutor jk=(JavascriptExecutor)driver;
		WebElement clickitinerary = driver.findElement(By.name("my_itinerary"));
		//jk.executeScript("arguments[0].ScrollIntoView()",clickitinerary);
		clickitinerary.click();
}
}