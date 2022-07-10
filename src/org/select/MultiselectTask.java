package org.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectTask {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement createnewacc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	createnewacc.click();
	Thread.sleep(3000);
	WebElement month = driver.findElement(By.id("month"));
	//to select
	Select s=new Select(month);
	List<WebElement> options = s.getOptions();
	
	System.out.println("first 5 values:");
	for (int i = 0; i < 5; i++) {
	WebElement webElement = options.get(i);
	String text = webElement.getText();
	System.out.println(text);
	}

	System.out.println("last 5 values");
	for (int i = 7; i < options.size(); i++) {
		WebElement webElement = options.get(i);
		String text2 = webElement.getText();
		System.out.println(text2);
	}
	System.out.println("odd values");
	for (int i = 0; i < options.size(); i++) {
		if (i%2==0) {
			WebElement webElement = options.get(i);
			String text3 = webElement.getText();
			System.out.println(text3);  
		}
		} 
		System.out.println("even values");
		for (int i = 0; i < options.size(); i++) {
			if (i%2!=0) {
				WebElement webElement = options.get(i);
				String text4 = webElement.getText();
				System.out.println(text4);  
			}	
		}
		
		System.out.println("middle values");
		System.out.println(options.get(5).getText());
		System.out.println(options.get(6).getText());
		
	}
}











