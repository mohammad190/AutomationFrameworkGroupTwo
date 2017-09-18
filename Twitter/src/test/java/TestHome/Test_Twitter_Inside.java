package TestHome;

import Twitter_Features.Inside_Twitter_features;
import Twitter_Features.T_Login_T_LogOut;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_Twitter_Inside extends CommonAPI {


    @Test
    public void Testing_login() throws InterruptedException {
        Inside_Twitter_features inside_twitter_features = PageFactory.initElements(driver, Inside_Twitter_features.class);
        inside_twitter_features.Twitter_Home_Page("sujondpi@yahoo.com", "", "This is my first comment using program for twit");
    }
}
