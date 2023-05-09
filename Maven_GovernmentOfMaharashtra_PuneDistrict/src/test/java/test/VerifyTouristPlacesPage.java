package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.DistrictPuneGOMHomePage;

public class VerifyTouristPlacesPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Lenovo\\Desktop\\SandipWakade\\chromedriver_win32 (042023)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://pune.gov.in/");
		DistrictPuneGOMHomePage districtPuneGOMHomePage = new DistrictPuneGOMHomePage(driver);
		districtPuneGOMHomePage.openTouristPlacePage();
		String urlTouristPlacesPage=driver.getCurrentUrl();
		String titleTouristPlacesPage=driver.getTitle();
		System.out.println(urlTouristPlacesPage);
		System.out.println(titleTouristPlacesPage);
		if(urlTouristPlacesPage.equals("https://pune.gov.in/tourist-places/")
				&& titleTouristPlacesPage.equals("Tourist Places | District Pune ,Government of Maharashtra | India") )
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
	}

}
