package BHTest;

import BH.Login;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login_Test extends CommonAPI {
    @Test
    public void BH_Cart() throws InterruptedException {
        Login cartb = PageFactory.initElements(driver, Login.class);
        cartb.cart_Test();

    }
    @Test
    public void loginBH()throws InterruptedException {
        Login bhlogin = PageFactory.initElements(driver, Login.class);
        bhlogin.loginBH("sayem991@gmail.com","abc123");
    }
}