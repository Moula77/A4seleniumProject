package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is POM class for leads home page
 */
public class LeadsHomePage {
	
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createNewLeadButton;

	public LeadsHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreateNewLeadButton() {
		return createNewLeadButton;
	}
	/**
	 * this is business library to click on new button
	 */
	
	public void clickOnNewLeadBtn()
	{
		createNewLeadButton.click();	
	}
	

}