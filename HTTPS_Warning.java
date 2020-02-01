import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class https_warning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Handling HTTPS warning
		
		// general Chrome profile
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts(); // Solution #1;
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true); // Solution #2;
		
		// Local Chrome profile
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\feroz\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		
		

	}

}
