import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.diver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement usernamebox = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		usernamebox.sendKeys("vinodhini");
		WebElement passbox = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		passbox.sendKeys("vino123");
		WebElement loginbox = driver.findElement(By.xpath("//input[@type='submit']"));
		loginbox.click();
	}
	
}
