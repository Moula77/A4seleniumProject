package testCaseRepository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class LE_02 extends BaseClass {
	
	@Test(groups= {"regression","smoke"})
	public void le_02Case() throws Exception
	{
	
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();
		String FIRSTNAME=EUTIL.readDataFromExcel("Leads", 4, 1);
		String LASTNAME=EUTIL.readDataFromExcel("Leads", 4, 2);
		String COMPANY=EUTIL.readDataFromExcel("Leads", 4, 3);
		String TITLE=EUTIL.readDataFromExcel("Leads", 4, 4);
		String PHONE=EUTIL.readDataFromExcel("Leads", 4, 5);
		String MOBILE=EUTIL.readDataFromExcel("Leads", 4, 6);
		String EMAIL=EUTIL.readDataFromExcel("Leads", 4, 7);
		String NOOFEMPLOYEES=EUTIL.readDataFromExcel("Leads", 4, 8);
		String STREET=EUTIL.readDataFromExcel("Leads", 4, 9);
		String POBOX=EUTIL.readDataFromExcel("Leads", 4, 10);
		String POSTALCODE=EUTIL.readDataFromExcel("Leads", 4, 11);
		String CITY=EUTIL.readDataFromExcel("Leads", 4, 12);
		String COUNTRY=EUTIL.readDataFromExcel("Leads", 4, 13);
		String STATE=EUTIL.readDataFromExcel("Leads", 4, 14);
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadPage cn = new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME + num, LASTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOOFEMPLOYEES, STREET, POBOX, POSTALCODE, CITY, COUNTRY, STATE);
		System.out.println("tc2 executed!");
		Thread.sleep(2000);
	}
}
