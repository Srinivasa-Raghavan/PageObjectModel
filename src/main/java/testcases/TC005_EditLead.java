package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_EditLead";
		testDescription="Editing Leads in the application";
		testNodes="Leads";
		category="Smoke";
		authors="Raghavan";
		browserName="chrome";
		dataSheetName="TC005_EditLead";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void editLead(String uName,String pwd,String editID,String cName, String fName, String lName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSfaLink()
		.clickLeadsMenu()
		.clickFindLeads()
		.typeFindLeadsID(editID)
		.clickFindLeadsButton("Find")
		.clickFirstElementinSearchResult()
		.clickEditButton()
		.updateCompanyName(cName)
		.updateFirstName(fName)
		.updateLastName(lName)
		.clickUpdateButton()
		.verifyCompanyName(cName)
		.verifyFirstName(fName)
		.verifyLastName(lName)
		.verifyStatusText("Assigned");
		
		
	}

}
