package testCaseRepository;



import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

@Listeners(genericUtilityOrLib.ListenersImplementationClass.class)
public class LE_01 extends BaseClass {

	@Test//(retryAnalyzer=genericUtilityOrLib.RetryAnalyzerImplementationClass.class)
	public void le_01Case() throws Exception {
	
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL = new ExcelUtility();
		String FIRSTNAME = EUTIL.readDataFromExcel("Leads", 1, 1);
		String LASTNAME = EUTIL.readDataFromExcel("Leads", 1, 2);
		String COMPANY = EUTIL.readDataFromExcel("Leads", 1, 3);
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadPage cn = new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME +num, LASTNAME, COMPANY);
		System.out.println("tc1 executed!!");
		Thread.sleep(4000);

	}

}
