package testTargetRetail;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import targetRetail.CreateAccountPage;
import targetRetail.HomePage;

public class testCreateAccount extends CommonAPI {

    public void goToCreateAccountPAge() throws InterruptedException {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.createAcntPg();
    }

    @Test
    public void testCreateAccount() throws InterruptedException {
        goToCreateAccountPAge();
        CreateAccountPage cp = PageFactory.initElements(driver, CreateAccountPage.class);
        cp.signIn("pntautomationgroup2@gmail.com", "Group2@piit", "SeleniumGroupTwo", "PeopleNTech");
    }
    @Test
    public void testGotoSignInPgAccount() throws InterruptedException {
        goToCreateAccountPAge();
        CreateAccountPage cp = PageFactory.initElements(driver, CreateAccountPage.class);
        cp.singInPg();
    }
    @Test
    public void testMainPageAccount() throws InterruptedException {
        goToCreateAccountPAge();
        CreateAccountPage cp = PageFactory.initElements(driver, CreateAccountPage.class);
        cp.backtomainpg();
    }
}
