package Insurance_Package;

import Insurance.Insurance_features;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_insurance_features extends CommonAPI {

    public class Test_insuranceFeatures extends CommonAPI {

        @Test
        public void InsuranceFeatures() throws InterruptedException {
            Insurance_features insurance_features = PageFactory.initElements(driver, Insurance_features.class);
            insurance_features.Insurance_features();
        }
    }
}
