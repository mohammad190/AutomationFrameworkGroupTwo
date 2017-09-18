package TestCase;

import WellsFargo_BankFeatures.CommonAPI;
import WellsFargo_BankFeatures.Financial_Education;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_Financial_Education_Features extends CommonAPI {

    @Test
    public static void Financial_education_elements()throws InterruptedException{
        Financial_Education financial_education = PageFactory.initElements(driver,Financial_Education.class);
        financial_education.Financial_Education_Elements();
    }
}
