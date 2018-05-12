package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	
	public FindLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	private String noRecordstext = "No records to display";
	
	@FindBy(how=How.NAME,using="id")
	private WebElement elefindID;
	
	public FindLeadsPage typeFindLeadsID(String findLeadsID) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(elefindID,findLeadsID);
		return this;		
	}

	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;
	
	@FindBy(how=How.XPATH, using="(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]/div/a")
	private WebElement eleLeadsTableLoad;
	
	@FindBy(how=How.CLASS_NAME, using="x-paging-info")
	private WebElement eleNoRecords;
	
	public FindLeadsPage clickFindLeadsButton(String action) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleFindLeadsButton);
		
		WebDriverWait objExpWait = new WebDriverWait(driver, 25);
		
		if(action.equalsIgnoreCase("Find"))
		{
		//Wait until the page is clickable
		
		objExpWait.until(ExpectedConditions.elementToBeClickable(eleLeadsTableLoad));
		}
		else if(action.equalsIgnoreCase("Verify"))
		{
			objExpWait.until(ExpectedConditions.visibilityOf(eleNoRecords));
		}
		else
		{
			throw new RuntimeException();
		}
		return this;		
	}
	
	public ViewLeadsPage clickFirstElementinSearchResult() {
		click(eleLeadsTableLoad);
		return new ViewLeadsPage();
	}
	
	public FindLeadsPage verifyNoRecordsText()
	{
		verifyExactText(eleNoRecords,noRecordstext);
		return this;
	}
	
	

}
