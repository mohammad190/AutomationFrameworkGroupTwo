package Test_DropDown_Bank;

import WellsFergo_dropDownMethod.DropDown_Method;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test_DropDown_Features extends CommonAPI {

    @Test
    public void DropDownFeatures()throws InterruptedException, IOException {
        DropDown_Method dm = PageFactory.initElements(driver,DropDown_Method.class);
        dm.DropDownFeatures();
    }
}
