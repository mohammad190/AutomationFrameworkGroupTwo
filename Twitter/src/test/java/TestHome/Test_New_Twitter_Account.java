package TestHome;

import Twitter_Features.Twitter_New_Account;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_New_Twitter_Account extends CommonAPI {

    @Test
    public void Create_New_Twitter_Account()throws InterruptedException{
        Twitter_New_Account twitter_new_account = PageFactory.initElements(driver,Twitter_New_Account.class);
        twitter_new_account.CreateNew_Twitter_Account("abcdstuv","abcd123@yahoo.com","123456789");
    }
}
