package TestCase;

import WellsFargo_BankFeatures.Site_Map;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_SiteMap extends CommonAPI {

    @Test
    public static void BankSite_Map(){
        Site_Map site_map = PageFactory.initElements(driver,Site_Map.class);
        site_map.BankSite_Map();
    }
}
