package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DistrictPuneGOMHomePage {
	@FindBy(xpath="(//div[@class='list-text'])[1]")
	private WebElement telephoneNumebersButton;

	@FindBy(xpath="(//div[@class='list-text'])[2]")
	private WebElement tourismButton;
	
	@FindBy(xpath="(//div[@class='list-text'])[3]")
	private WebElement rtiOnlineButton;
	
	@FindBy(xpath="(//div[@class='list-text'])[4]")
	private WebElement aadharCentresButton;
	
	@FindBy(xpath="(//div[@class='list-text'])[5]")
	private WebElement viewDigitallySigned7_12Button; 
	
	public DistrictPuneGOMHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openWhosWhoPage()
	{
		telephoneNumebersButton.click();
	}
	
	public void openTouristPlacePage()
	{
		tourismButton.click();
	}
	public void openRtiOnlinePage()
	{
		rtiOnlineButton.click();
	}
	public void openAdharCentresPage()
	{
		aadharCentresButton.click();
	}
	public void openViewDigitallySigned712Page()
	{
		viewDigitallySigned7_12Button.click();
	}
}
