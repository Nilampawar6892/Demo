package seleniumDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.ui.Select;



public class FirefoxBrowserAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        
        FirefoxOptions ffopt = new FirefoxOptions()
                .addPreference("dom.webnotifications.enabled", false)
                .addPreference("geo.enabled", false)
                .addPreference("geo.provider.use_corelocation", false)
                .addPreference("geo.prompt.testing", false)
                .addPreference("geo.prompt.testing.allow", false);


        System.setProperty("webdriver.gecko.driver","C:\\Users\\ATUL006\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver =new FirefoxDriver(ffopt);
        
        driver.get(("http://www.shoppersstop.com"));
        
driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]")).click();

WebElement brand =driver.findElement(By.xpath("/html/body/main/nav/div[1]/div/ul/li[8]/a"));
brand.click();


WebElement ele = driver.findElement(By.xpath("/html/body/main/section/div/div/div/ul/li[1]/div/div[2]/a"));
JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", ele);

TakesScreenshot screen1 =((TakesScreenshot)driver);

File screenfile = screen1.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(screenfile, new File("C:\\Users\\ATUL006\\Desktop\\Picture.png"));

System.out.println("Screenshot is taken");

driver.close();
        		
	}

}
