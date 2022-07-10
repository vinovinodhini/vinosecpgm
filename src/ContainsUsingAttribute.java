import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsUsingAttribute {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/AccountChooser/identifier?flowName=GlifWebSignIn&flowEntry=AccountChooser");
	//inspect username values based on contains using attribute to print username values 
	WebElement useridtext = driver.findElement(By.xpath("//input[contains(@autocomplete,'username')]"));
	useridtext.sendKeys("vinodhini@gmail.com");
	String attribute= useridtext.getAttribute("value");
	System.out.println(attribute);
	// to print attribute values
	String attribute2=useridtext.getAttribute("autocomplete");
	System.out.println(attribute2);
	driver.close();
	
}
}
