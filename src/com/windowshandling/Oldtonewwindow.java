package com.windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.g;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;



public class Oldtonewwindow {

	public static WebDriver driver; // Static variable

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		/// To Inspect the SearchBox and Click the with key
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 13 pro max", Keys.ENTER);

		// To Click the Silver Mobile
		WebElement iphone13 = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Pro Max (512GB) - Silver']"));
		iphone13.click();

		// To Find the Parent windows Id of the WebPAge
		String parentWindowsId = driver.getWindowHandle();
		System.out.println(parentWindowsId);

		// To Find out All the Windows id :
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);

		for (String x : allWindowsId) {

			if (!parentWindowsId.equals(x)) {

				driver.switchTo().window(x);

			}

		}

		// To Click the Add to cart
		WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
		addToCart.click();

		Thread.sleep(3000);

		// Switch Back To the ParentWindows
		driver.switchTo().window(parentWindowsId);

		WebElement goldIphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Pro Max (256GB) - Gold']"));
		goldIphone.click();

		// To Finmd All The Windows ID
		Set<String> allWindowsId2 = driver.getWindowHandles();

		List<String> li = new LinkedList<>();
		li.addAll(allWindowsId2);

		for (int i = 0; i < li.size(); i++) {

			String object = li.get(2);

			// To Switch To Second windows
			driver.switchTo().window(object);

		}

		// To Click the Add to caret Button
		WebElement addToCartGold = driver.findElement(By.id("add-to-cart-button"));
		addToCartGold.click();
		
		///*****
		//switch back again parent window
		driver.switchTo().window(parentWindowsId);
		/// To Inspect the SearchBox and Click the with key
				WebElement searchBox3 = driver.findElement(By.id("twotabsearchtextbox"));
				searchBox3.clear();
				searchBox3.sendKeys("OPPO F19 Pro", Keys.ENTER);
				
		//to click oppo f19 pro
				WebElement oppof19pro = driver.findElement(By.xpath("//span[text()='OPPO F19 Pro (Fluid Black, 8GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers']"));
				oppof19pro.click();
		//to find all the windows id
				Set<String> allwindowsid3 = driver.getWindowHandles();
			List<String> li1=new LinkedList<>();
			li1.addAll(allwindowsid3);
			for (int i = 0; i < li1.size(); i++) {
				String li1obj = li1.get(3);
				driver.switchTo().window(li1obj);
				
			}
		//add to cart
			WebElement oppoaddToCart = driver.findElement(By.id("add-to-cart-button"));
			oppoaddToCart.click();
		///*******
			//switch back again parent window
			driver.switchTo().window(parentWindowsId);
			/// To Inspect the SearchBox and Click the with key
					WebElement searchBox4 = driver.findElement(By.id("twotabsearchtextbox"));
					searchBox4.clear();
					searchBox4.sendKeys("vivo mobiles", Keys.ENTER);
			Thread.sleep(3000);
			//to click oppo f19 pro
					WebElement vivombl = driver.findElement(By.xpath("//span[text()='Vivo V21e 5G (Sunset Jazz, 8GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers']"));
					vivombl.click();
					
					//to find all the windows id
					Set<String> allwindowsid4 = driver.getWindowHandles();
				List<String> li2=new LinkedList<>();
				li1.addAll(allwindowsid4);
				for (int i = 0; i < li2.size(); i++) {
					String li2obj = li1.get(4);
					driver.switchTo().window(li2obj);
					
				}
				Thread.sleep(3000);
			//add to cart
				WebElement vivoaddtocart = driver.findElement(By.id("add-to-cart-button"));
				vivoaddtocart.click();
	}
}