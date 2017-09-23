package TestWealthManagements;

import WealthManageMent_Using_HoverMethod.WealthManagement;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestWealthAndManagements extends CommonAPI {

    @Test
    public void WealthsManagements_feature()throws InterruptedException{
        WealthManagement WM = PageFactory.initElements(driver,WealthManagement.class);
        WM.WealthsManagements_features();
    }
}
