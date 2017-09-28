package WellsFargo_BankFeatures;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SBuiness extends CommonAPI {

    @FindBy(how = How.ID,using = "tabNavSmallBusiness")
    WebElement SmallBusiness;

    @FindBy(how = How.ID,using = "otherSvcs")
    WebElement ElectronicsPayment;

    public void SmallBuss(){
        SmallBusiness.click();
        ElectronicsPayment.click();
    }
}
