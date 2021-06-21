package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcademysampleTest {

	public static void main(String[] args) {
		
		
		
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ATUL006\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
	  	 WebDriver driver =new ChromeDriver();	
		
		
		driver.get("http://qaclickacademy.com/");
		
		
		
		WebElement RegisterButton =driver.findElement(By.xpath(" //span[contains(text(),'Register')]")	);
		
		RegisterButton.click();

		WebElement FullName =driver.findElement(By.cssSelector(" #user_name"));
		
		FullName.sendKeys("Nilam");

		WebElement EmailId =driver.findElement(By.cssSelector("#user_email"));
		
		EmailId.sendKeys("nilampawar6892@gmail.com");

		WebElement Password =driver.findElement(By.cssSelector("#user_password"));
		
		Password.sendKeys("Pari@123");

		WebElement ConfirmPassword =driver.findElement(By.cssSelector("#user_password_confirmation"));
		
		ConfirmPassword.sendKeys("Pari@123");
  
		WebElement Checkbox1 =driver.findElement(By.xpath("//input[@id='user_unsubscribe_from_marketing_emails']"));
		
		Checkbox1.click();

		WebElement Checkbox2 =driver.findElement(By.xpath("//input[@id='user_agreed_to_terms']"));

		Checkbox2.click();


		WebElement SubmitButton =driver.findElement(By.xpath("//input[@type='submit']"));
		
		SubmitButton.click();

	}


}
