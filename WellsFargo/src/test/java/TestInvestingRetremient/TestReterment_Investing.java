package TestInvestingRetremient;

import Investing_Reteriment.Investing_Retirement_Features;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestReterment_Investing extends CommonAPI {

    @Test
    public void InvestingRetirement_feature()throws InterruptedException{
        Investing_Retirement_Features IRF = PageFactory.initElements(driver,Investing_Retirement_Features.class);
        IRF.InvestingRetirement_features();
    }
}
