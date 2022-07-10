import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebugCreateNewAccountFb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//launch the browser
		driver.get("https://www.facebook.com/");
		//to maxmize the window
		driver.manage().window().maximize();
		//to click the create new account button
		WebElement createnewaccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createnewaccount.click();
		//static wait method
	//	Thread.sleep(5000);
		//to insert values on first name box
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("vino");
		WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("vinodhini");
	}

}
