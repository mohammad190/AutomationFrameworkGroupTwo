package WellsFargo_BankFeatures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SBuiness extends CommonAPI {

    @FindBy(how = How.ID,using = "tabNavSmallBusiness")
    public static WebElement SmallBusiness;

    @FindBy(how = How.ID,using = "otherSvcs")
    public static WebElement ElectronicsPayment;

    public void SmallBuss(){
        SmallBusiness.click();
        ElectronicsPayment.click();
    }
}
