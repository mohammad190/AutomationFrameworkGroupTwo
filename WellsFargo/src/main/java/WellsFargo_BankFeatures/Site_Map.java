package WellsFargo_BankFeatures;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Site_Map extends CommonAPI {

    @FindBy(how = How.LINK_TEXT,using = "Sitemap")
    public static WebElement Click_SiteMap;


    public static void BankSite_Map(){
        Click_SiteMap.click();
    }
}
