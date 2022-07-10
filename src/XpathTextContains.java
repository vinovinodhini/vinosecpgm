import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTextContains {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//to get url page
	driver.get("https://www.javatpoint.com/java-tutorial");
	//to maxmize window
	driver.manage().window().maximize();
	
	//to get single text value
	WebElement singletext = driver.findElement(By.xpath("//a[text()='object-oriented']"));
	String text=singletext.getText();
	System.out.println(text);
	
	//to print entire paragraph
	WebElement paratext = driver.findElement(By.xpath("//p[contains(text(),'traditional')]"));
	String text1= paratext.getText();
	System.out.println(text1);
	WebElement paratext1 = driver.findElement(By.xpath("//p[contains(text(),'applications')][3]"));
	String text2= paratext1.getText();
	System.out.println(text2);
	
	
}
}
