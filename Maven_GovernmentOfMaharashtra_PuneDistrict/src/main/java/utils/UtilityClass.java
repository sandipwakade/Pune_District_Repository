package utils;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	
	
	public static void getExcelSheetData()
	{
		
	}

	public  void captureScreenshotCode(WebDriver driver) {
		
		TakesScreenshot t=(TakesScreenshot)driver;
		DateFormat dateFormat=new SimpleDateFormat("dd.MM.yyyy HH.mm.ss.SSS");
		Date date=new Date();
		String date1=dateFormat.format(date);
		File src=t.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Lenovo\\Desktop\\SandipWakade\\Screenshot\\test "+TestID+" "+date1+".jpg");
		FileHandler.copy(src, dest);
		
	}


	

}
