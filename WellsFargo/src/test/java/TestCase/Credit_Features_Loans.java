package TestCase;

import base.CommonAPI;
import WellsFargo_BankFeatures.Loans_Credit;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Credit_Features_Loans extends CommonAPI {

    @Test
    public void Features_Loans_Credit()throws InterruptedException{

        Loans_Credit loans_credit = PageFactory.initElements(driver,Loans_Credit.class);
        loans_credit.Features_Loans_Credit();
    }
}
