package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicatePage extends ProjectMethods{
	
	public DuplicatePage() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmitButton;
	
	public ViewLeadsPage clickSubmitButton() throws InterruptedException {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleSubmitButton);
		Thread.sleep(3000);
		return new ViewLeadsPage();		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public DuplicatePage getFirstName() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		dupFName = getAttribute(eleFirstName, "value");
		//System.out.println("This"+dupFName);
		return this;		
	}


}
