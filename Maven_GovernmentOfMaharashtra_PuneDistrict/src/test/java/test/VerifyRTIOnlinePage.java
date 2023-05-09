package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.DistrictPuneGOMHomePage;

public class VerifyRTIOnlinePage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Lenovo\\Desktop\\SandipWakade\\chromedriver_win32 (042023)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://pune.gov.in/");
		DistrictPuneGOMHomePage districtPuneGOMHomePage = new DistrictPuneGOMHomePage(driver);
		districtPuneGOMHomePage.openRtiOnlinePage();
		String urlRTIOnlinePage=driver.getCurrentUrl();
		String titleRTIOnlinePage=driver.getTitle();
		System.out.println(urlRTIOnlinePage);
		System.out.println(titleRTIOnlinePage);
		if(urlRTIOnlinePage.equals("https://pune.gov.in/service/rti-online/")
				&& titleRTIOnlinePage.equals("RTI Online | District Pune ,Government of Maharashtra | India") )
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}

	}

}
