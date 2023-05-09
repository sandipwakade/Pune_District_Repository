package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDistrictPuneGOMHomePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Lenovo\\Desktop\\SandipWakade\\chromedriver_win32 (042023)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://pune.gov.in/");
		String urlDistrictPuneGOMHomePage=driver.getCurrentUrl();
		String titleDistrictPuneGOMHomePage=driver.getTitle();
		System.out.println(urlDistrictPuneGOMHomePage);
		System.out.println(titleDistrictPuneGOMHomePage);
		if(urlDistrictPuneGOMHomePage.equals("https://pune.gov.in/"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}

	}

}
