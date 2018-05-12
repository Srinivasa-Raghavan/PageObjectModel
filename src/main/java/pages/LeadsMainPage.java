package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LeadsMainPage extends ProjectMethods{
	
	public LeadsMainPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLeadLink;
	
	public CreateLeadPage clickCreateLeadLink() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleCreateLeadLink);
		return new CreateLeadPage();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeads;
	
	public FindLeadsPage clickFindLeads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleFindLeads);
		return new FindLeadsPage();		
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLeads;
	
	public MergeLeadsPage clickMergeLeads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleMergeLeads);
		return new MergeLeadsPage();		
	}	
		
	
	

}
