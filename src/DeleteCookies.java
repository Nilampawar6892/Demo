import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ATUL006\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.rahulShettyacademy.com/AutomationPractice/");

	}

}
