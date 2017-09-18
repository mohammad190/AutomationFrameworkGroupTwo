package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import testing.WordPressLogin;

public class TestWordPressLogin extends CommonAPI {

    @Test(dataProvider = "loginData")
    public void TestLogin(String username, String password) throws InterruptedException {
        WordPressLogin wordPressLogin = PageFactory.initElements(driver, WordPressLogin.class);
        wordPressLogin.logIn(username, password);
    }
}
