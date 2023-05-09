package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassSample{

	public static void main(String[] args) {
		System.out.println("Start");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\SandipWakade\\chromedriver_win32 (042023)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		System.out.println("End");
	}

}
