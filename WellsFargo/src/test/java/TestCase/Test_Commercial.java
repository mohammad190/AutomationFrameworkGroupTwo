package TestCase;

import WellsFargo_BankFeatures.Commercial;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_Commercial extends CommonAPI {

    @Test
    public void CommercialFeatures() throws InterruptedException {
        Commercial commercial  = PageFactory.initElements(driver,Commercial.class);
        commercial.Commercial_1();
    }
}
