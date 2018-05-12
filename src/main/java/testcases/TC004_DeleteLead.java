package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_DeleteLead";
		testDescription="Deleting Leads in the application";
		testNodes="Leads";
		category="Smoke";
		authors="Raghavan";
		browserName="chrome";
		dataSheetName="TC004_DeleteLead";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void deleteLead(String uName,String pwd,String deleteID) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSfaLink()
		.clickLeadsMenu()
		.clickFindLeads()
		.typeFindLeadsID(deleteID)
		.clickFindLeadsButton("Find")
		.clickFirstElementinSearchResult()
		.clickDeleteButton()
		.clickFindLeads()
		.typeFindLeadsID(deleteID)
		.clickFindLeadsButton("Verify")
		.verifyNoRecordsText();
		
		
	}

}
