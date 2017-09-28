package Features_Frequently_Ask_question;

import base.CommonAPI;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

public class FAQ_s extends CommonAPI {

    @FindBy(how = How.LINK_TEXT, using = "ATMs/Locations")
     WebElement Go_ATM_Loacation;

    @FindBy(how = How.LINK_TEXT, using = "FAQs")
    WebElement Go_FAQs;

    @FindBy(how = How.XPATH, using = ".//a[@aria-controls='NID1_14_1_1_1_2']\n")
     WebElement Go_Top_question;

    @FindBy(how = How.XPATH, using = ".//a[@aria-controls='NID1_14_1_1_2_2']")
     WebElement Go_WellsFergo_online;

    @FindBy(how = How.XPATH, using = ".//a[@aria-controls='NID1_14_1_1_3_2']")
     WebElement Go_Loans_credit;

    @FindBy(how = How.XPATH, using = ".//a[@aria-controls='NID1_14_1_1_4_2']")
    WebElement Go_Investing;

    @FindBy(how = How.XPATH, using = ".//a[@aria-controls='NID1_14_1_1_5_2']")
    WebElement Go_Retirement;

    @FindBy(how = How.XPATH, using = ".//a[@aria-controls='NID1_14_1_1_6_2']")
      WebElement Go_Insurance_protection;

    @FindBy(how = How.XPATH, using = ".//a[@aria-controls='NID1_14_1_1_7_2']")
      WebElement Go_About_wellsFargo;


    public void Features_FAQ_s() throws InterruptedException, IOException {
        Go_ATM_Loacation.click();
        Thread.sleep(500);
        Go_FAQs.click();
        Thread.sleep(500);
        Go_Top_question.click();
        Thread.sleep(500);
        Go_WellsFergo_online.click();
        Thread.sleep(500);
        Go_Loans_credit.click();
        Thread.sleep(500);
        Go_Investing.click();
        Thread.sleep(500);
        Go_Retirement.click();
        Thread.sleep(500);
        Go_Insurance_protection.click();
        Thread.sleep(500);
        Go_About_wellsFargo.click();
        Thread.sleep(500);

        takeScreenShot(driver, "AfterCaseStatus", "C:\\Users\\sujon\\IdeaProjects\\AutomationFrameworkGroupTwo\\WellsFargo\\screenshots\\");
        test.log(LogStatus.PASS, "Verified some features Something ");
    }

}
