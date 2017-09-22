package TestCase;

import WellsFargo_BankFeatures.Click_Twitter;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_Bank_Twitter extends CommonAPI {

    @Test
    public static void TwitterFeatures() throws InterruptedException {
        Click_Twitter click_twitter = PageFactory.initElements(driver,Click_Twitter.class);
        click_twitter.Twitter_Features();

    }


}
