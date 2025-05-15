package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="force__detailPanel"                                
               , summary=""
               , connection="Flosumprovarjenkins"
               , object=""
     )             
public class force__detailPanel {

	@TextType()
	@FindBy(xpath = "//span[text()='Closed DateTime']/following::lightning-formatted-text[1]")
	public WebElement closedDateTime;
	
}
