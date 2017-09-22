package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import testing.WordPressLogin;

public class TestWordPressLogin extends CommonAPI {

    @Test
    public void TestLogin() throws Exception {
        WordPressLogin wordPressLogin = PageFactory.initElements(driver, WordPressLogin.class);
        wordPressLogin.getDataFromExcelFileAndSearch();
    }
}
