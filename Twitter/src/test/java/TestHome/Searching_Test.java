package TestHome;

import Twitter_Features.Search_Option;
import WellsFargo_BankFeatures.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Searching_Test extends CommonAPI {

    @Test
    public void Searching()throws InterruptedException{
        Search_Option search_option = PageFactory.initElements(driver,Search_Option.class);
        search_option.Searching("USNews");
    }

}
