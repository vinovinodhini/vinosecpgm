package org.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
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
	//to check dropdown
	boolean multiple = s.isMultiple();
	System.out.println(multiple);
	
	//to print all the options
	List<WebElement> options = s.getOptions();
	
	//find size of the list
	int size = options.size();
	System.out.println(size);
	
		
	System.out.println(" ");
	
	for (int i = 0; i < options.size(); i++) {
		if (i<=4) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);  	
		}
			
	}
	System.out.println(" ");
	//print odd 
	for (int i = 0; i < options.size(); i++) {
		if (i%2!=0) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);  
		}	
	}
	System.out.println(" ");
	//print even
	for (int i = 0; i < options.size(); i++) {
		if (i%2==0) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);  
		}
	}
	
}
}
