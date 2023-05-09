package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browserSetup.Base;
import pages.DistrictPuneGOMHomePage;
import utils.UtilityClass;

public class TestNGClass1 extends Base {
	private WebDriver driver;
	private DistrictPuneGOMHomePage districtPuneGOMHomePage;
	int i=1;
	private int TestID;
	private UtilityClass utilityClass;
	@Parameters("browser")
	
	@BeforeTest
	public void launchBrowser(String browserName)
	{
		if(browserName.equals("chrome"))
				{
			driver=openChromeBrowser();
			    }
		if(browserName.equals("firefox"))
		{
	driver=openFirefoxBrowser();
	    }
		if(browserName.equals("edge"))
		{
			driver=openEdgeBrowser();
		}
		
	}
	@BeforeClass
	public void launchBrowser()
	{
		
	}
	
	@BeforeMethod
	public void goToDistrictPuneGOMHomePage()
	{
		driver.get("https://pune.gov.in/");
		districtPuneGOMHomePage = new DistrictPuneGOMHomePage(driver);
	}
	
	@Test(priority=1)
	public void verifyDistrictPuneGOMHomePage()
	{
		TestID=11;
		System.out.println("wakade");
		System.out.println("Sandip");
		System.out.println("Test "+i);
		i++;
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
	@Test(priority=2)
	public void verifyWhosWhoPage()
	{
		TestID=12;
		System.out.println("Test "+i);
		i++;
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
	@Test(priority=3)
	public void VerifyTouristPlacesPage()
	{
		TestID=13;
		System.out.println("Test "+i);
		i++;
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
	
	@Test(priority=4)
	public void verifyRtiOnlinePage()
	{
		TestID=14;
		System.out.println("Test "+i);
		i++;
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
	
	@Test(priority=5)
	public void verifyAdharCentresPage()
	{
		TestID=15;
		System.out.println("Test "+i);
		i++;
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
	@Test(priority=6)
	public void verifyViewDigitallySigned712Page()
	{
		TestID=16;
		System.out.println("Test "+i);
		i++;
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
		
	@AfterMethod
	public void closePage()
	{
		utilityClass.captureScreenshotCode(driver);
	}
	@AfterClass
	public void removeObjects()
	{
		districtPuneGOMHomePage=null;
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	}
	
	
	
	
	
	


