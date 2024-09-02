package genericUtilityOrLib;




	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;

	import objectRepository.HomePage;
	import objectRepository.LoginPage;

	public class BaseClass {
		
		public static WebDriver driver=null;
		SeleniumUtility SUTIL=null;
		PropertiesUtility PUTIL=new PropertiesUtility();
		
		
		@BeforeSuite(alwaysRun=true)
		public void createConnection()
		{
			System.out.println("connection succesfull");
		}
		
		@BeforeClass(alwaysRun=true)
		public void launchBrowser() throws Exception
		{
			String URL=PUTIL.getDataFromProperties("url");
			SUTIL=new SeleniumUtility();
			driver=new ChromeDriver();	
			SUTIL.implicitWait(driver,10);
			SUTIL.maximizeWindow(driver);
			driver.get(URL);
			System.out.println("launch succesfull");
		}

		@BeforeMethod(alwaysRun=true)
		public void loginApp() throws Exception
		{
			String USERNAME=PUTIL.getDataFromProperties("username");
			String PASSWORD=PUTIL.getDataFromProperties("password");
			LoginPage lp=new LoginPage(driver);
			lp.loginOperation(USERNAME, PASSWORD);
			System.out.println("login succesfull");
			
		}

		@AfterMethod(alwaysRun=true)
		public void logoutApp() throws Exception
		{
			HomePage hp=new HomePage(driver);
			hp.logoutOperation(driver);
			System.out.println("logout successfull");
		}

		@AfterClass(alwaysRun=true)
		public void closeApp()
		{
			driver.quit();
			System.out.println("browser closed Successfully");
		}

		@AfterSuite(alwaysRun=true)
		public void closeConnection()
		{
			 System.out.println("connection closed succesfully");
		}

}
	
