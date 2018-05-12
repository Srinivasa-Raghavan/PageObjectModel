package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{
	
	public MergeLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleFromIcon;
	
	public MergeLeadsPage clickFromIcon() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		clickWithNoSnap(eleFromIcon);
		return this;		
	}
	
	public FindLeadsWindowPage switchToFindLeadsWindow()
	{
		switchToWindow(1);
		return new FindLeadsWindowPage();
	}
	
	public MergeLeadsPage switchToMergeLeadsPage()
	{
		switchToWindow(0);
		return new MergeLeadsPage();
	}
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleTOIcon;
	
	public MergeLeadsPage clickToIcon() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		clickWithNoSnap(eleTOIcon);
		return this;		
	}

	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleMergeButton;
	
	public MergeLeadsPage clickMergeButton() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		clickWithNoSnap(eleMergeButton);
		return this;		
	}
	
	public ViewLeadsPage acceptMergeAlert() throws InterruptedException
	{
		acceptAlert();
		Thread.sleep(3000);
		return new ViewLeadsPage();
	}
	
	
	

}
