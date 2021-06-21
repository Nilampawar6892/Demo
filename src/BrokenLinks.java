import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ATUL006\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");

		  WebDriver driver =new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  driver.manage().window().maximize();
		  
	     List<WebElement> links =driver.findElements(By.cssSelector("li[class='gf-li\'] a"));
	     
	     SoftAssert a =new SoftAssert();
		  
		for( WebElement link:links)
		{
			String url = link.getAttribute("href");
			  
			  
			  HttpURLConnection Connection=  (HttpURLConnection)new URL(url).openConnection();
			  Connection.setRequestMethod("HEAD");
			  Connection.connect();
			  int respcode =Connection.getResponseCode();
			  
			  System.out.println(respcode);
			  
			    a.assertTrue(respcode<400, "The link with Text"+link.getText()+" is broken with code" +respcode);		
			    
		}
		 a.assertAll();
	}
	 	 


}
