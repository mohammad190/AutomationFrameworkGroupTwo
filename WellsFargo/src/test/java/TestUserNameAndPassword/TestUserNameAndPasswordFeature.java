package TestUserNameAndPassword;

import ForgotUserNamePassword.SetUpUserNamePassword;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestUserNameAndPasswordFeature extends CommonAPI {

    @Test
    public void UserNameAndPassword()throws Exception {
        SetUpUserNamePassword setUpUserNamePassword = PageFactory.initElements(driver,SetUpUserNamePassword.class);
        setUpUserNamePassword.UserNameAndPasswordFeatures("123","12","1234","258147369");
    }
}
