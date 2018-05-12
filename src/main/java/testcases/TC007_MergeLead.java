package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC007_MergeLead";
		testDescription="Merging Leads in the application";
		testNodes="Leads";
		category="Smoke";
		authors="Raghavan";
		browserName="chrome";
		dataSheetName="TC007_MergeLead";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void mergeLead(String uName,String pwd,String fromleadID, String toLeadID) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSfaLink()
		.clickLeadsMenu()
		.clickMergeLeads()
		.clickFromIcon()
		.switchToFindLeadsWindow()
		.typeFindLeadsID(fromleadID)
		.clickFindLeadsButton()
		.clickFirstElementinSearchResultfromWindow()
		.switchToMergeLeadsPage()
		.clickToIcon()
		.switchToFindLeadsWindow()
		.typeFindLeadsID(toLeadID)
		.clickFindLeadsButton()
		.getMergeToLeadFirstName()
		.clickFirstElementinSearchResultfromWindow()
		.switchToMergeLeadsPage()
		.clickMergeButton()
		.acceptMergeAlert()
		.verifyFirstName(mergeToFName);
	}

}
