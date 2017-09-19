package TestCase;

import WellsFargo_BankFeatures.Click_Twitter;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class Test_Bank_Twitter extends CommonAPI {


    public static void TwitterFeatures(){
        Click_Twitter click_twitter = PageFactory.initElements(driver,Click_Twitter.class);
        click_twitter.Twitter_Features();

    }


}
