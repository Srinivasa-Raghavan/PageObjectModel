package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC006_DuplicateLead";
		testDescription="Duplicate Leads in the application";
		testNodes="Leads";
		category="Smoke";
		authors="Raghavan";
		browserName="chrome";
		dataSheetName="TC006_DuplicateLead";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void duplicateLead(String uName,String pwd,String leadID) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSfaLink()
		.clickLeadsMenu()
		.clickFindLeads()
		.typeFindLeadsID(leadID)
		.clickFindLeadsButton("Find")
		.clickFirstElementinSearchResult()
		.clickDuplicateButton()
		.getFirstName()
		.clickSubmitButton()
		.verifyFirstName(dupFName);
		
	}

}
