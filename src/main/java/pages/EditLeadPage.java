package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	
	public EditLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCompanyName;
	
	public EditLeadPage updateCompanyName(String cName) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleCompanyName,cName);
		return this;		
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement eleFirstName;
	
	public EditLeadPage updateFirstName(String fName) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleFirstName,fName);
		return this;		
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_lastName")
	private WebElement eleLastName;
	
	public EditLeadPage updateLastName(String lName) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleLastName,lName);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='submitButton'])[1]")
	private WebElement eleSubmitButton;
	
	public ViewLeadsPage clickUpdateButton() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleSubmitButton);
		return new ViewLeadsPage();		
	}

}
