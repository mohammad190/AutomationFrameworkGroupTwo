package TestCase;

import base.CommonAPI;
import WellsFargo_BankFeatures.SBuiness;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class sBusiness extends CommonAPI {
    @Test
    public void SmallBusiness(){
        SBuiness buiness = PageFactory.initElements(driver,SBuiness.class);
        buiness.SmallBuss();
    }
}
