import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlersThreeTypes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//simple alert
		WebElement simpleclick = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simpleclick.click();
		Thread.sleep(3000);
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
		//confirm alert
		WebElement confirmclick = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		confirmclick.click();
		WebElement confirmboxclick = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		confirmboxclick.click();
		//Thread.sleep(3000);
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
		//Thread.sleep(3000);
		//prompt alert
		 WebElement prompt = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		 prompt.click();
		 WebElement promptboxclick = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		 promptboxclick.click();
		 //switch to alert
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("vino");
		promptalert.accept();
	}

}
