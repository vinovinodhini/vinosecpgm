package com.methodoverloading;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.xml.xpath.XPathExpressionException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class seleniumMethods  {
	public WebDriver driver;
	private void getChrome() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
private void getgecko() {
	System.setProperty("webdriver..driver","C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
}
private void microedge() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
}
private void urlLaunch(String url) {
	driver.get(url);
}
private void inspectUsername(String uid) {
	WebElement username = driver.findElement(By.id(uid));
	username.sendKeys("vino");
}
private void inspectPass(String pid) {
	WebElement passwordbox = driver.findElement(By.id(pid));
	passwordbox.sendKeys("12345");
}
private void clickLogin(String lid) {
	WebElement login = driver.findElement(By.id(lid));
	login.click();
}
private void title() {
	String title=driver.getTitle();
	System.out.println(title);
}
private void currentUrl() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
}
private void printSingletext(String singletext ) {
	WebElement stext = driver.findElement(By.xpath(singletext));
	String singtext = stext.getText();
	System.out.println(singtext);
}
private void printParagraph(String xpath) {
	WebElement paratext = driver.findElement(By.xpath(xpath));
	String para = paratext.getText();
	System.out.println(para);
}
private void createNewaccount(String createnewacc) throws InterruptedException  {
	
	WebElement createnewaccount = driver.findElement(By.xpath(createnewacc));
	createnewaccount.click();
	Thread.sleep(5000);
}
private void singnupdetailsfirstname(String firstname) {
	WebElement firstnamebox = driver.findElement(By.name(firstname));
	firstnamebox.sendKeys("vino");
}
private void lastName(String lastname) {
	WebElement lastnamebox = driver.findElement(By.name(lastname));
	lastnamebox.sendKeys("vinodhini");
}
private void navigateto(String navigatetourl) throws InterruptedException  {
	driver.navigate().to(navigatetourl);
	Thread.sleep(3000);
}
private void navigateBack() throws InterruptedException {
	driver.navigate().back();
	Thread.sleep(3000);
}
private void navigateForward() throws InterruptedException {
	driver.navigate().forward();
	Thread.sleep(3000);
}
private void navigateRefreah() {
	driver.navigate().refresh();
}
private void movetoElement(String mouseover,String mastermouseover) {
	WebElement mouse = driver.findElement(By.xpath(mouseover));
	Actions act=new Actions(driver);
	act.moveToElement(mouse).perform();
	WebElement master = driver.findElement(By.xpath(mastermouseover));
	act.moveToElement(master).perform();
}
private void dragandDroop(String source,String desnation) {
	WebElement sour = driver.findElement(By.id(source));
	WebElement des = driver.findElement(By.id(desnation));
	Actions act=new Actions(driver);
	act.dragAndDrop(sour, des).perform();
}
private void contextClick(String contentclk) {
	WebElement conclk = driver.findElement(By.xpath(contentclk));
	Actions act=new Actions(driver);
	act.contextClick().perform();
}
private void doubleClick() throws InterruptedException, AWTException {
	//keyboard action in robot predefined class
	Robot r=new Robot();
	//to cut the username box text
	for (int i = 0; i <4; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	
	//to past the copied text
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);

}
}


	

