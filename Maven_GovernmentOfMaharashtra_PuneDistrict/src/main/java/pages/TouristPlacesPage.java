package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TouristPlacesPage {
	
	@FindBy(xpath="//a[text()='Lal Mahal']")
	private WebElement lalMahalButton;
	@FindBy(xpath="//a[text()='Sarasbaug-Peshve Park']")
	private WebElement sarasbaugPeshveParkButton;
	@FindBy(xpath="//a[text()='Khadakwasala Dam']")
	private WebElement KhadakwasalaDamButton;
	@FindBy(xpath="//a[text()='Shivneri Fort']")
	private WebElement shivneriFortButton;
	@FindBy(xpath="//a[text()='Shanivarwada']")
	private WebElement shanivarwadaButton;
	@FindBy(xpath="//a[text()='Aagakhan Palace']")
	private WebElement aagakhanPalaceButton;
	@FindBy(xpath="//a[text()='Sinhagad']")
	private WebElement sinhagadButton;
	@FindBy(xpath="//a[text()='Lonavala-Khandala']")
	private WebElement lonavalaKhandalaButton;
	
public TouristPlacesPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void openLalMahalPage()
{
	lalMahalButton.click();
}
public void openSarasbaugPeshveParkPage()
{
	sarasbaugPeshveParkButton.click();
}
public void openKhadakwasalaDamPage()
{
	KhadakwasalaDamButton.click();
}
public void openShivneriFortPage()
{
	shivneriFortButton.click();
}
public void openShanivarwadaPage()
{
	shanivarwadaButton.click();
	
}
public void openAagakhanPalacePage()
{
	aagakhanPalaceButton.click();
}
public void openSinhagadPage()
{
	sinhagadButton.click();
}
public void openLonavalaKhandalaPage()
{
	lonavalaKhandalaButton.click();
}

}
