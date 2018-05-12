package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadsPage extends ProjectMethods{
	
	public ViewLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleCompanyName;
	
	public ViewLeadsPage verifyCompanyName(String cName) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		verifyPartialText(eleCompanyName,cName);
		return this;		
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleFirstName;
	
	public ViewLeadsPage verifyFirstName(String fName) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		verifyExactText(eleFirstName,fName);
		return this;		
	}
	
	@FindBy(how=How.ID,using="viewLead_lastName_sp")
	private WebElement eleLastName;
	
	public ViewLeadsPage verifyLastName(String lName) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		verifyExactText(eleLastName,lName);
		return this;		
	}
		
	@FindBy(how=How.ID,using="viewLead_statusId_sp")
	private WebElement eleStatus;
	
	public ViewLeadsPage verifyStatusText(String status) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		verifyExactText(eleStatus, status);
		return this;		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleDeleteButton;
	
	public LeadsMainPage clickDeleteButton() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleDeleteButton);
		return new LeadsMainPage();		
	}

	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateButton;
	
	public DuplicatePage clickDuplicateButton() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleDuplicateButton);
		return new DuplicatePage();		
	}

	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEditButton;
	
	public EditLeadPage clickEditButton() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleEditButton);
		return new EditLeadPage();		
	}
}
