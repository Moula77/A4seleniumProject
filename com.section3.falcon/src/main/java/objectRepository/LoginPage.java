package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement username;
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void loginOperation(String uname,String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
	}

}
