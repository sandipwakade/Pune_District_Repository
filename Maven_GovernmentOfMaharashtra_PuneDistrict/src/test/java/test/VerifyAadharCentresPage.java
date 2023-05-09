package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.DistrictPuneGOMHomePage;

public class VerifyAadharCentresPage {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Lenovo\\Desktop\\SandipWakade\\chromedriver_win32 (042023)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://pune.gov.in/");
		DistrictPuneGOMHomePage districtPuneGOMHomePage = new DistrictPuneGOMHomePage(driver);
		districtPuneGOMHomePage.openAdharCentresPage();
		String urlAdharCentresPage=driver.getCurrentUrl();
		String titleAdharCentresPage=driver.getTitle();
		System.out.println(urlAdharCentresPage);
		System.out.println(titleAdharCentresPage);
		if(urlAdharCentresPage.equals("https://pune.gov.in/service/aadhar-centres/")
				&& titleAdharCentresPage.equals("Aadhar Centres | District Pune ,Government of Maharashtra | India") )
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}

	}

}
