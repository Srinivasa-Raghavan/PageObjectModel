package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	public CreateLeadPage typeCompanyName(String cName) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleCompanyName,cName);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public CreateLeadPage typeFirstName(String fName) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleFirstName,fName);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	public CreateLeadPage typeLastName(String lName) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleLastName,lName);
		return this;		
	}
		
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	private WebElement eleSourceID;
	
	public CreateLeadPage selectSourceIDbyIndex(String index) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		selectDropDownUsingIndex(eleSourceID, Integer.parseInt(index));
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_marketingCampaignId")
	private WebElement eleMarktCmgn;
	
	public CreateLeadPage selectMktgCmpgnbyVisibleText(String text) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		selectDropDownUsingText(eleMarktCmgn, text);
		return this;		
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmitButton;
	
	public ViewLeadsPage clickSubmitButton() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleSubmitButton);
		return new ViewLeadsPage();		
	}

}
