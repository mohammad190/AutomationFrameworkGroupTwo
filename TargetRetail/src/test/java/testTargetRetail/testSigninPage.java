package testTargetRetail;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import targetRetail.HomePage;
import targetRetail.SignInPage;

public class testSigninPage extends CommonAPI {
    public void goTosigninPAge() throws InterruptedException {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.signinPg();
    }

    @Test
    public void testforgetPass() throws InterruptedException {
        goTosigninPAge();
        SignInPage sp = PageFactory.initElements(driver, SignInPage.class);
        sp.passRecov();
    }
    @Test
    public void testsignIn() throws InterruptedException {
        goTosigninPAge();
        SignInPage sp = PageFactory.initElements(driver, SignInPage.class);
        sp.signIn("pntautomationgroup2", "Group2@piit");
    }
    @Test
    public void testcreateAccountPage() throws InterruptedException {
        goTosigninPAge();
        SignInPage sp = PageFactory.initElements(driver, SignInPage.class);
        sp.createaccnt();
    }
    @Test
    public void testBackBtn() throws InterruptedException {
        goTosigninPAge();
        SignInPage sp = PageFactory.initElements(driver, SignInPage.class);
        sp.backtomainpg();
    }
}
