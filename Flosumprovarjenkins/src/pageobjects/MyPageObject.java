package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="Flosumprovarjenkins"
     )             
public class MyPageObject {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Accounts']")
	public WebElement accounts;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Gmail']")
	public WebElement gmail;
	@LinkType()
    @FindBy(xpath = "//a[normalize-space(.)='Accounts']")
    public WebElement AccountsTab;
    @LinkType()
    @FindBy(xpath = "//a[normalize-space(.)='New']")
    public WebElement NewButton;
    @TextType()
    @FindBy(xpath="//label[text()='Industry']/following::div[contains(@class,'slds-form-element__help')][1]") 
    public WebElement IndustryErrorMessage;
    @TextType()
    @FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open')]//input[@name='Name']")
    public WebElement AccountName;
    @TextType()
    @FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open')]//button[@aria-label='Industry']")
    public WebElement Industry;
    @ButtonType()
    @FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open')]//button[normalize-space(.)='Save']")
    public WebElement SaveButton;
	@LinkType()
	@FindBy(xpath = "//table/tbody/tr[1]/th//a")
	public WebElement FirstAccountRecord;	
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space()='Account Status']/following-sibling::div//lightning-base-combobox//input")
	public WebElement AccountStatus;
			
}
