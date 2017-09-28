package TestCase;

import WellsFargo_BankFeatures.Banking;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_banking extends CommonAPI {

    @Test
    public void checkingAccountClick()throws InterruptedException{
        Banking banking = PageFactory.initElements(driver,Banking.class);
        banking.checkingAccountClick("11432");
    }
    @Test
    public void banking() throws InterruptedException {

        Banking banking = PageFactory.initElements(driver,Banking.class);
        banking.features();

    }
}
