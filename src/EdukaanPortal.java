import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EdukaanPortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ATUL006\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
	  	 WebDriver driver =new ChromeDriver();	
		
		
		driver.get("https://ibpodev.home.tatamotors/edukan_admin/#/sessions/signin4");
	WebElement Username =driver.findElement(By.xpath("//input[@id='mat-input-0']"));
	Username.sendKeys("JSS530248");
	
	WebElement Password =driver.findElement(By.xpath("//input[@id='mat-input-1']"));
	Password.sendKeys("Sfu#Iit@22");
	
	WebElement SubmitButton =driver.findElement(By.xpath("//div[@id='moveTop']/app-signin4/div/div[3]/form/div/button"));
	SubmitButton.click();
	SubmitButton.click();
	
	
	
	
	
	
	}

}
