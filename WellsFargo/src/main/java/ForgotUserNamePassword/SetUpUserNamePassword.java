package ForgotUserNamePassword;

import base.CommonAPI;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SetUpUserNamePassword extends CommonAPI {

    @FindBy(how = How.LINK_TEXT,using = "Forgot Password/Username?")
    WebElement Go_UserNamePassword;

    @FindBy(how = How.XPATH,using = ".//a[@id='NID1_14_1_1_3_2_3_1']")
    WebElement Go_FindUserName;

    @FindBy(how = How.XPATH,using = ".//input[@id='ssn1']")
    WebElement Go_SSN_Box_1;

    @FindBy(how = How.XPATH,using = ".//input[@id='ssn2']")
    WebElement Go_SSN_Box_2;

    @FindBy(how = How.XPATH,using = ".//input[@id='ssn3']")
    WebElement Go_SSN_Box_3;

    @FindBy(how = How.XPATH,using = ".//input[@id='password']")
    WebElement Go_Password;

    @FindBy(how = How.ID,using = "cont")
    WebElement Go_Continue;

    public void UserNameAndPasswordFeatures(String SSN1, String SSN2, String SSN3, String Password)throws Exception {
        Go_UserNamePassword.click();
        test.log(LogStatus.INFO, "Clicking UserNamePassword");
        Thread.sleep(500);
        Go_FindUserName.click();
        test.log(LogStatus.INFO, "Clicking Find UserName");
        Thread.sleep(500);
        Go_SSN_Box_1.sendKeys(SSN1);
        test.log(LogStatus.INFO, "Entering Numbers In SSN Box 1");
        Thread.sleep(500);
        Go_SSN_Box_2.sendKeys(SSN2);
        test.log(LogStatus.INFO, "Entering Numbers In SSN Box 2");
        Thread.sleep(500);
        Go_SSN_Box_3.sendKeys(SSN3);
        test.log(LogStatus.INFO, "Entering Numbers In SSN Box 3");
        Thread.sleep(500);
        Go_Password.sendKeys(Password);
        test.log(LogStatus.INFO, "Entering Password");
        Thread.sleep(500);
        Go_Continue.click();
        test.log(LogStatus.INFO, "Clicking On Go.");
        Thread.sleep(500);

        takeScreenShot(driver, "AfterCaseStatus", "C:\\Users\\sujon\\IdeaProjects\\AutomationFrameworkGroupTwo\\WellsFargo\\screenshots\\");

        test.log(LogStatus.PASS, "Verified SSN Something ");
        // test.log is basically same as saying, system.out.println();
        // except test.log will put everything in your reports folder as HTML
        //
        // So basically you dont have to use this everywhere, but you can use this to verify
        // steps and have it as report in HTML.
        // If a testcase fails, it will automatically take screenshot.
        // Also if you want to change the html path or name, just do it in the .xml file

        // Does that make sense? and is it helpful bhai?its really helpful

        // Awesome! I am adding more features later on, will give updates, but for now add these things
        // in some places and make your code a bit more clean, when we present our project in bootcamp

    }
}
