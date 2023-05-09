package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.DistrictPuneGOMHomePage;

public class VerifyDigitallySigned7_12page {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Lenovo\\Desktop\\SandipWakade\\chromedriver_win32 (042023)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://pune.gov.in/");
		DistrictPuneGOMHomePage districtPuneGOMHomePage = new DistrictPuneGOMHomePage(driver);
		districtPuneGOMHomePage.openViewDigitallySigned712Page();
		String urlDigitallySigned7_12page=driver.getCurrentUrl();
		String titleDigitallySigned7_12page=driver.getTitle();
		System.out.println(urlDigitallySigned7_12page);
		System.out.println(titleDigitallySigned7_12page);
		if(urlDigitallySigned7_12page.equals("https://pune.gov.in/service/view-7-12/")
				&& titleDigitallySigned7_12page.equals("View Digitally Signed 7/12 | District Pune ,Government of Maharashtra | India") )
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}
