package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.DistrictPuneGOMHomePage;

public class VerifyWhosWhoPage {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Lenovo\\Desktop\\SandipWakade\\chromedriver_win32 (042023)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://pune.gov.in/");
		DistrictPuneGOMHomePage districtPuneGOMHomePage = new DistrictPuneGOMHomePage(driver);
		districtPuneGOMHomePage.openWhosWhoPage();
		String urlWhosWhoPage=driver.getCurrentUrl();
		String titleWhosWhoPage=driver.getTitle();
		System.out.println(urlWhosWhoPage);
		System.out.println(titleWhosWhoPage);
		if(urlWhosWhoPage.equals("https://pune.gov.in/about-pune/whos-who/")
				&& titleWhosWhoPage.equals("Who�s Who | District Pune ,Government of Maharashtra | India") )
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}

	}

}
