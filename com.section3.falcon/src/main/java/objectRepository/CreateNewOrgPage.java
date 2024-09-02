package objectRepository;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CreateNewOrgPage {
		
		@FindBy(xpath="//input[@name='accountname']")
		private WebElement orgName;
		
		@FindBy(xpath="//input[@name='website']")
		private WebElement website;
		
		@FindBy(xpath="//input[@name='employees']")
		private WebElement employees;
		
		@FindBy(xpath="//input[@name='phone']")
		private WebElement phone;
		
		@FindBy(xpath="//input[@name='otherphone']")
		private WebElement otherPhn;
		
		@FindBy(xpath="//input[@name='email1']")
		private WebElement email;
		
		@FindBy(xpath="//textarea[@name='bill_street']")
		private WebElement billingAddress;
		
		@FindBy(xpath="//input[@name='bill_city']")
		private WebElement billingCity;
		
		@FindBy(xpath="//input[@name='bill_state']")
		private WebElement billingState;
		
		@FindBy(xpath="(//input[@name='button'])[3]")
		private WebElement saveBtn;

		public CreateNewOrgPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
			
		}

		public WebElement getOrgName() {
			return orgName;
		}

		public WebElement getWebsite() {
			return website;
		}

		public WebElement getEmployees() {
			return employees;
		}

		public WebElement getPhone() {
			return phone;
		}

		public WebElement getOtherPhn() {
			return otherPhn;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getBillingAddress() {
			return billingAddress;
		}

		public WebElement getBillingCity() {
			return billingCity;
		}

		public WebElement getBillingState() {
			return billingState;
		}
		
		public WebElement getSaveBtn() {
			return saveBtn;
		}
		
		/**
		 * business library for TC-01
		 * @param organisationName
		 * @param web
		 * @param emp
		 */
		
		public void createOrganisation(String organisationName,String web,String emp)
		{
			orgName.sendKeys(organisationName);
			website.sendKeys(web);
			employees.sendKeys(emp);
		}
		
		/**
		 * business library for TC-02
		 * @param organisationName
		 * @param web
		 * @param emp
		 * @param phoneNumber
		 * @param otherPhone
		 * @param emailId
		 */
		public void createOrganisation(String organisationName,String web,String emp,String phoneNumber,String otherPhone,String emailId)
		{
			orgName.sendKeys(organisationName);
			website.sendKeys(web);
			employees.sendKeys(emp);
			phone.sendKeys(phoneNumber);
			otherPhn.sendKeys(otherPhone);
			email.sendKeys(emailId);
		}
		
		/**
		 * business library for TC-03
		 * @param organisationName
		 * @param web
		 * @param billAddress
		 * @param billCity
		 * @param billState
		 */
		public void createOrganisation(String organisationName,String web,String billAddress,String billCity,String billState)
		{
			orgName.sendKeys(organisationName);
			website.sendKeys(web);
			billingAddress.sendKeys(billAddress);
			billingCity.sendKeys(billCity);
			billingState.sendKeys(billState);
			
		}
		
		/**
		 * business library for TC-04
		 * @param organisationName
		 * @param web
		 * @param emp
		 * @param phoneNumber
		 * @param otherPhone
		 * @param emailId
		 * @param billAddress
		 * @param billCity
		 * @param billState
		 */
		public void createOrganisation(String organisationName,String web,String emp,String phoneNumber,String otherPhone,String emailId,String billAddress,String billCity,String billState)
		{
			orgName.sendKeys(organisationName);
			website.sendKeys(web);
			employees.sendKeys(emp);
			phone.sendKeys(phoneNumber);
			otherPhn.sendKeys(otherPhone);
			email.sendKeys(emailId);
			billingAddress.sendKeys(billAddress);
			billingCity.sendKeys(billCity);
			billingState.sendKeys(billState);
			saveBtn.click();
		}
	}


