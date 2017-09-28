package ForgotUserNamePassword;

import base.CommonAPI;
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
        Thread.sleep(500);
        Go_FindUserName.click();
        Thread.sleep(500);
        Go_SSN_Box_1.sendKeys(SSN1);
        Thread.sleep(500);
        Go_SSN_Box_2.sendKeys(SSN2);
        Thread.sleep(500);
        Go_SSN_Box_3.sendKeys(SSN3);
        Thread.sleep(500);
        Go_Password.sendKeys(Password);
        Thread.sleep(500);
        Go_Continue.click();
        Thread.sleep(500);

        takeScreenShot("AfterCaseStatus", "C:\\Users\\sujon\\IdeaProjects\\AutomationFrameworkGroupTwo\\WellsFargo\\screenshots\\");
        // Try to make the code more clean
        // Dont use this much of Thread.sleep, one single test case will take too much time otherwise
        // Try to avoid using Thread.sleep
        // Just use this screenshot method wherever you need it,
        // Push and pull, Ive added a feature where it takes screenshot automatically for you
        // If test case fails

        // Is there aything else you need help with sujon bhai, not now, ok take care bhai
    }
}
