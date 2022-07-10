import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPerform {
public static void main(String[] args) throws InterruptedException  {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thikshitha RV\\eclipse-workspace\\SeleniumFirstPgm\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.greenstechnologys.com/java-training-in-chennai.html");
driver.manage().window().maximize();
WebElement mouse = driver.findElement(By.xpath("//div[text()='Courses ']" ));
Actions act=new Actions(driver);
//to perform the mouse over actions
act.moveToElement(mouse).perform();
WebElement mousesubtitle = driver.findElement(By.xpath("//span[text()='Master Program (8)']"));
act.moveToElement(mousesubtitle).perform();


}

}








/*driver.get("https://demo.guru99.com/test/drag_drop.html");
driver.manage().window().maximize();
WebElement source = driver.findElement(By.id("credit2"));
WebElement desnation = driver.findElement(By.id("bank"));
Actions act=new Actions(driver);
act.dragAndDrop(source, desnation).perform();
*/




