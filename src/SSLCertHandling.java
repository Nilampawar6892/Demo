import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		DesiredCapabilities Ch =DesiredCapabilities.chrome();
		Ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		Ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions CO =new ChromeOptions();
		Ch.merge(CO);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ATUL006\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(CO);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
