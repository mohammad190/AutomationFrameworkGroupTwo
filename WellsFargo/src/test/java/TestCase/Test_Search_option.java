package TestCase;

import WellsFargo_BankFeatures.Search_Option;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_Search_option extends CommonAPI {

    @Test
    public void search_features()throws InterruptedException{
        Search_Option search_option = PageFactory.initElements(driver, Search_Option.class);
        search_option.search_Features("Reno"+" ","Nevada");
}

}
