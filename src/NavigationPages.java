//import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NavigationPages {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	//going to new webpage
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(6000);
	//return back to flipkart page
	/*driver.navigate().back();
	Thread.sleep(5000);
	//forward to the webpage
	driver.navigate().forward();
	
	Thread.sleep(5000);
	
	//refresh to the webpage
	driver.navigate().refresh(); 
	Thread.sleep(5000);

    driver.get(driver.getCurrentUrl());
    Thread.sleep(5000);
	 
	driver.navigate().to(driver.getCurrentUrl());
	Thread.sleep(5000);*/
	
	driver. findElement(By.id("a-page")).sendKeys(Keys.F5);
}
}











//driver.findElement(By.name("q")).sendKeys(Keys.F5); 