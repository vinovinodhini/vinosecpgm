import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.javatpoint.com/java-tutorial");	
		driver.manage().window().maximize();
		
	/*	String title=driver.getTitle();
		System.out.println(title);
		//to print the url of the page
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);*/
		//to print single text 
	//	WebElement singletext = driver.findElement(By.xpath("//p[text()='Java was developed by'] "));
	  //  String text=singletext.getText();
	    //System.out.println(text);  
	    //to print entire paragraph
    	WebElement para = driver.findElement(By.xpath("//p[contains(text(),'Java')]"));
	    String text2=para.getText();
	    System.out.println(text2); 
	}

}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// find index value(check box and gender): WebElement male = driver.findElement(By.xpath("//input[@class='@_8esa'][2]"));
		//male.click();
	   /* WebElement loginid = driver.findElement(By.id("username"));
		loginid.sendKeys("vinodhini");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("vino123");
	    WebElement signin = driver.findElement(By.id("submitBtn"));
		signin.click();
		
		WebElement userlogin = driver.findElement(By.id("username"));
		userlogin.sendKeys("vinodhini");
		WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys("123456");
		WebElement signin = driver.findElement(By.id("submit"));
	    signin.click();
	    
	    WebElement username = driver.findElement(By.id("signin_username"));
		username.sendKeys("vinodhinivenkatachalam");
		WebElement password = driver.findElement(By.id("signin_password"));
		password.sendKeys("vino@22");
		WebElement signin = driver.findElement(By.id("submit"));
		signin.click();
		*/
	