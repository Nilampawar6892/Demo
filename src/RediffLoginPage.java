

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RediffLoginPage {
	
	WebDriver driver;
	
	public RediffLoginPage(WebDriver driver)
	{
		this.driver =driver;
	}
	   	
    By username =By.xpath("//input[@id='login1']");
	By password =By.xpath("//input[@id='password']");
	By SubmitButton =By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]");
	
	
	public WebElement EmailId()
	{
		return driver.findElement(username);
	}
	public WebElement PassWod()
	{
		return driver.findElement(password);
	}
	
	public WebElement Signin()
	{
		return driver.findElement(SubmitButton);
	}
}
