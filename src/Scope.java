import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ATUL006\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement FooterDriver =driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(FooterDriver.findElements(By.tagName("a")).size());
		
		WebElement ColumnDriver =FooterDriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
		
		System.out.println(ColumnDriver.findElements(By.tagName("a")).size());
		
		for(int i=1;i<ColumnDriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			
		}// opens all the tabs
		Set<String> abc=driver.getWindowHandles();//4
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
			
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
		
		}
		}
		
	
		
	}


