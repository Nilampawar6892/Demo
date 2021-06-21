import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tableexsercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ATUL006\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.rahulShettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		List<WebElement>Values =driver.findElementsByCssSelector(".tableFixHead td:nth-child(4)");
		
		int count =Values.size();
		
		int sum =0;
		
		for(int i=0;i<count;i++)
		{
			sum=sum+Integer.parseInt(Values.get(i).getText());
			
		
		}
		
		System.out.println("Sumation of Value Field is "  +sum);
		
		int Total =Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		int updatedtotal =Total+1;
		
        org.testng.Assert.assertEquals(updatedtotal,sum);		
		
		JavascriptExecutor Js =(JavascriptExecutor)driver;
		
	    Js.executeScript("window.scrollBy(0,500)");
	
        Thread.sleep(3000);
    
        Js.executeScript("document.querySelector('.tableFixHead').scrolltop=5000");
	
       

	}

}
