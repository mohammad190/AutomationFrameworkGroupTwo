package Test_DropDown_Bank;

import WellsFergo_dropDownMethod.DropDown_Method;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_DropDown_Features extends CommonAPI {

    @Test
    public void DropDownFeatures()throws InterruptedException{
        DropDown_Method dm = PageFactory.initElements(driver,DropDown_Method.class);
        dm.DropDownFeatures();
    }
}
