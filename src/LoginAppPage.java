
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginAppPage {

	public static void main(String[]args) {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ATUL006\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");

     WebDriver driver =new ChromeDriver();	
     driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

     RediffLoginPage RediffPage =new RediffLoginPage(driver);
  
     RediffPage.EmailId().sendKeys("nilampawar6892@gmail.com");
     RediffPage.PassWod().sendKeys("Pari@123");
     RediffPage.Signin().click();
     
           
	}

}