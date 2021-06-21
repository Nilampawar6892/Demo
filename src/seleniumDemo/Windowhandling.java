package seleniumDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ATUL006\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//a[contains(text(),'Free Access to InterviewQues/ResumeAssistance/Mate')]")).click();
		
		Set<String>windows =driver.getWindowHandles();//Parent and child Id 
		Iterator<String> I = windows.iterator();
		String Parent_Id =I.next();
		String Child_Id =I.next();
		driver.switchTo().window(Child_Id);
		
		
		System.out.println(driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-interview-material[1]/div[1]/div[1]/div[2]/p[2]")).getText());
		//driver.findElement(By.cssSelector(".im-para red")).getText();
		
		String emailid =driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-interview-material[1]/div[1]/div[1]/div[2]/p[2]")).getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(emailid);
		driver.switchTo().window(Parent_Id);
		
      WebElement username =driver.findElement(By.cssSelector("#username"));
      
      
      username.sendKeys(emailid);
	}

}
