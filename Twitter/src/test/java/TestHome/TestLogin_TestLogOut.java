package TestHome;

import Twitter_Features.T_Login_T_LogOut;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLogin_TestLogOut extends CommonAPI {


    @Test
    public void Testing_login() throws InterruptedException {
        T_Login_T_LogOut t_login = PageFactory.initElements(driver, T_Login_T_LogOut.class);
        t_login.userName_Box("sujondpi@yahoo.com","");
    }
}
