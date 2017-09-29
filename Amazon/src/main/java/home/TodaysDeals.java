package home;

import base.CommonAPI;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

public class TodaysDeals extends CommonAPI {

    @FindBy(how = How.XPATH, using = "html/body/div[1]/header/div/div[2]/div[3]/div/div/a[2]")
    WebElement Todays_Deals;



    public void Todays_Deals() throws IOException {
        Todays_Deals.click();
        test.log(LogStatus.INFO,"ClickingonTodaysDeals");

        takeScreenShot(driver, "test", "C:\\Users\\SAYEM\\Desktop\\SayemJava\\AutomationFrameworkGroupTwo\\Amazon\\screenshots\\");
        test.log(LogStatus.FAIL, "Passed Test Case");

    }
}
