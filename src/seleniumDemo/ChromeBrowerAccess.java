package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowerAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumDemo\\Resource\\chromedriver\\Chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https:www.facebook.com");
		
		//Alert alert = driver.switchTo().alert();		
		
        // Capturing alert message.    
       // String alertMessage= driver.switchTo().alert().getText();
		//System.out.println(driver.getTitle());
		/*WebElement EmailId =driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
	EmailId.sendKeys("Nilampawar6892@gmail.com");
	
	WebElement Password =driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	
	Password.sendKeys("Abhi@123");
	
	driver.findElement(By.name("login")).click();

	/*driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[1]/div/div[2]/div/a[2]")).click();	
*/
		
		
		
	}
}
