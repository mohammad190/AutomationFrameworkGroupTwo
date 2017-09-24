package ForgotUserNamePassword;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SetUpUserNamePassword extends CommonAPI {

    @FindBy(how = How.LINK_TEXT,using = "Forgot Password/Username?")
    public static WebElement Go_UserNamePassword;

    @FindBy(how = How.XPATH,using = ".//a[@id='NID1_14_1_1_3_2_3_1']")
    public static WebElement Go_FindUserName;

    @FindBy(how = How.XPATH,using = ".//input[@id='ssn1']")
    public static WebElement Go_SSN_Box_1;

    @FindBy(how = How.XPATH,using = ".//input[@id='ssn2']")
    public static WebElement Go_SSN_Box_2;

    @FindBy(how = How.XPATH,using = ".//input[@id='ssn3']")
    public static WebElement Go_SSN_Box_3;

    @FindBy(how = How.XPATH,using = ".//input[@id='password']")
    public static WebElement Go_Password;

    @FindBy(how = How.ID,using = "cont")
    public static WebElement Go_Continue;

    public static void UserNameAndPasswordFeatures(String SSN1, String SSN2, String SSN3, String Password)throws InterruptedException{
        Go_UserNamePassword.click();
        Thread.sleep(3000);
        Go_FindUserName.click();
        Thread.sleep(3000);
        Go_SSN_Box_1.sendKeys(SSN1);
        Thread.sleep(3000);
        Go_SSN_Box_2.sendKeys(SSN2);
        Thread.sleep(3000);
        Go_SSN_Box_3.sendKeys(SSN3);
        Thread.sleep(3000);
        Go_Password.sendKeys(Password);
        Thread.sleep(3000);
        Go_Continue.click();
        Thread.sleep(3000);
    }
}
