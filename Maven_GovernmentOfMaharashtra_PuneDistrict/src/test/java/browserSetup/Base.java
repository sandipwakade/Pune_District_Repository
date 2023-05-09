package browserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	

	
	public static WebDriver openFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\Lenovo\\Desktop\\SandipWakade\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		return driver;
	}

	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Lenovo\\Desktop\\SandipWakade\\chromedriver_win32 (042023)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
		
	}
	
	public static WebDriver openEdgeBrowser()
	{
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\Lenovo\\Desktop\\SandipWakade\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		return driver;
		
	}
	
	

}

