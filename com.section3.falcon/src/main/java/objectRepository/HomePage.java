package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilityOrLib.SeleniumUtility;

public class HomePage {
	@FindBy(xpath="(//a[text()='Leads'])[1]")
	private WebElement leads;
	@FindBy(xpath="(//a[text()='Organization'])[1]")
	private WebElement org;
	@FindBy(xpath="(//td[@class='small'])[2]")
	private WebElement preferences;
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutOption;
	public HomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public WebElement getLeads() {
		return leads;
	}
	public WebElement getOrg() {
		return org;
	}
	public WebElement getPreferences() {
		return preferences;
	}
	public WebElement getSignoutOption() {
		return signoutOption;
	}
	public void clickOnLeads() {
		leads.click();
	}
	public void clickOnOrg() {
		org.click();
	}
	public void logoutOperation(WebDriver driver)throws Exception{
		SeleniumUtility SUTIL =new SeleniumUtility();
		SUTIL.moveCursorToAnELement(driver,preferences);
		Thread.sleep(3000);
		SUTIL.moveCursorToAnELement(driver,signoutOption);
	}
	
	

}
