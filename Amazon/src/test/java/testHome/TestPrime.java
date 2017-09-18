package testHome;

import base.CommonAPI;
import home.TryPrime;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestPrime extends CommonAPI {

    @Test
    public void Try_Prime_Member () throws InterruptedException {
        TryPrime prime = PageFactory.initElements(driver, TryPrime.class);
        prime.T_P_M();
    }
    @Test
    public void Try_Prime_Member_Plan () throws InterruptedException {
        TryPrime primeplan = PageFactory.initElements(driver, TryPrime.class);
        primeplan.T_P_M();
        primeplan.T_P_M_Plan();

    }
}
