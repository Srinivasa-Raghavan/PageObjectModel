package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Creating Leads in the application";
		testNodes="Leads";
		category="Smoke";
		authors="Raghavan";
		browserName="chrome";
		dataSheetName="TC003_CreateLead";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd,String cName, String fName, String lName, String index, String mktg) {
		
		new LoginPage()
		.enterUserName("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLogIn()
		.clickCRMSfaLink()
		.clickLeadsMenu()
		.clickCreateLeadLink()
		.typeCompanyName("")
		.typeFirstName("")
		.typeLastName("")
		.clickSubmitButton()
		.verifyCompanyName("")
		.verifyFirstName("")
		.verifyLastName("")
		.verifyStatusText("Assigned");
		
	}

}
