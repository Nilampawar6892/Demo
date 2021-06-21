package seleniumDemo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ATUL006\\Downloads\\chromedriver_win32 (3)\\Chromedriver.exe");
		
	WebDriver driver =new ChromeDriver ();
		
	driver.get ("http://www.nseindia.com/");
	
	WebElement Derivatives = driver.findElement(By.xpath("//*[@id=\"tabs\"]/div/div/div/nav/div/div/a[2]"));
	
	Derivatives.click();
	
	WebDriverWait wait2 = new WebDriverWait(driver, 10);
	wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\\\"nse-derivatives\\\"]/nav/div/div/a[2]")));
	driver.findElement(By.xpath("//*[@id=\\\"nse-derivatives\\\"]/nav/div/div/a[2]")).click();
	
//WebElement CurrencyDerivatives = driver.findElement(By.xpath("//*[@id=\"nse-derivatives\"]/nav/div/div/a[2]"));
	
//CurrencyDerivatives.click();
	
	
	
	/*TakesScreenshot screen = ((TakesScreenshot)driver);
	
	File Image1 =screen.getScreenshotAs(OutputType.FILE);
	
	System.out.println("Screenshot Captured");
	
	try 	{
	

		FileUtils.copyFile(Image1, new File ("D:\\seleniumDemo\\Image1.png"));
	
	}
	catch(Exception e)

	{
		System.out.println("Exception Occured");
	}*/
	

	//driver.close();
}
}