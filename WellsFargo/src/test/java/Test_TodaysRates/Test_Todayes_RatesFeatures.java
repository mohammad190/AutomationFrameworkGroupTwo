package Test_TodaysRates;

import Check_Todayes_Rates.Todayes_Rates;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_Todayes_RatesFeatures extends CommonAPI {

    @Test
    public void DropdownFeatures()throws InterruptedException{
        Todayes_Rates Tr = PageFactory.initElements(driver,Todayes_Rates.class);
        Tr.DropDownFeatures();

    }
}


