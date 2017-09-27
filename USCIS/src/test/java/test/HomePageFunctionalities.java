package test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.homepage.CheckStatus;

public class HomePageFunctionalities extends CommonAPI {

    @Test
    public void Test_Check_Case_Status() throws Exception {
        CheckStatus checkStatus = PageFactory.initElements(driver, CheckStatus.class);
        checkStatus.Check_Case_Status("/src/test/resources/excelfiles/ReceiptNumbers.xlsx", 0);
    }
}
