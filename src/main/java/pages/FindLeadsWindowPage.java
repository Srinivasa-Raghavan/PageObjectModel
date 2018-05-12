package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wdMethods.ProjectMethods;

public class FindLeadsWindowPage extends ProjectMethods{
	
	public FindLeadsWindowPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.NAME,using="id")
	private WebElement elefindID;
	
	public FindLeadsWindowPage typeFindLeadsID(String findLeadsID) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(elefindID,findLeadsID);
		return this;		
	}

	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;
	
	@FindBy(how=How.XPATH, using="//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a")
	private WebElement eleLeadsTableLoad;
	
	public FindLeadsWindowPage clickFindLeadsButton() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleFindLeadsButton);
		
		WebDriverWait objExpWait = new WebDriverWait(driver, 25);
		objExpWait.until(ExpectedConditions.elementToBeClickable(eleLeadsTableLoad));
		return this;		
	}
	
	public MergeLeadsPage clickFirstElementinSearchResultfromWindow() {
		clickWithNoSnap(eleLeadsTableLoad);
		return new MergeLeadsPage();
	}
	
	@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")
	private WebElement eleFirstNameText;
	
	public FindLeadsWindowPage getMergeToLeadFirstName() {
		
		mergeToFName = getText(eleFirstNameText);
		//System.out.println("This"+mergeToFName);
		return this;
	}
}
