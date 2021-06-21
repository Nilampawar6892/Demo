package seleniumDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumDemo\\Resource\\chromedriver\\Chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
	
		
	            	WebElement Login =driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]\r\n" + 
	            			""));
	            	Login.sendKeys("nilampawar");
	                }


}
	