package PersonalTab.BankingList;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OnlineBanking extends CommonAPI {

    @FindBy(how = How.NAME, using = "sitekey_display_module_open_button")
    WebElement Sign_In_To_Online_Banking_Button;

    @FindBy(how = How.NAME, using = "sign-in-help")
    WebElement Sign_In_Help_Options_Button;

    //// Common Elements ////
    @FindBy(how = How.ID, using = "tlpvt-account-num")
    WebElement Complete_Card_Or_Account_Number_Box;

    @FindBy(how = How.ID, using = "tlpvt-personalSSN-tin")
    WebElement Complete_SSN_Box;

    @FindBy(how = How.ID, using = "forgot-submit")
    WebElement Common_Continue_Box;

    @FindBy(how = How.ID, using = "forgot-cancel")
    WebElement Common_Cancel_Box;

    @FindBy(how = How.NAME, using = "What_if_I_don't_have_a_Social_Security_number_or_Tax_ID_number?")
    WebElement Dont_Have_SSN_Link;

    @FindBy(how = How.NAME, using = "faq_no_ssn_contact_us")
    WebElement Contact_Us_Link;

    /// Forgot Online ID Related ////
    @FindBy(how = How.NAME, using = "forgot-online-id")
    WebElement Forgot_Online_ID_Button;

    @FindBy(how = How.ID, using = "tlpvt-pwd")
    WebElement Your_Passcode_box;

    //// Forgot Passcode Related ////
    @FindBy(how = How.NAME, using = "reset-passcode")
    WebElement Forgot_Passcode_Button;

    @FindBy(how = How.NAME, using = "tlpvt-id")
    WebElement Your_Online_ID_Box;

    /// Forgot Online ID And Passcode Related ////
    @FindBy(how = How.NAME, using = "reset-id-passcode")
    WebElement Forgot_Online_ID_And_Passcode_Button;

    public void Sign_In_And_Help_Options() {
        Sign_In_To_Online_Banking_Button.click();
        Sign_In_Help_Options_Button.click();
    }

    public void Forgot_Online_ID_Continue(String CardNR, String SSN, String passCode) {
        Sign_In_And_Help_Options();
        Forgot_Online_ID_Button.click();
        Complete_Card_Or_Account_Number_Box.sendKeys(CardNR);
        Complete_SSN_Box.sendKeys(SSN);
        Your_Passcode_box.sendKeys(passCode);
        Common_Continue_Box.click();
    }

    public void Forgot_Online_ID_Cancel(String CardNR, String SSN, String passCode) {
        Sign_In_And_Help_Options();
        Forgot_Online_ID_Button.click();
        Complete_Card_Or_Account_Number_Box.sendKeys(CardNR);
        Complete_SSN_Box.sendKeys(SSN);
        Your_Passcode_box.sendKeys(passCode);
        Common_Cancel_Box.click();
    }

    public void Forgot_Online_ID_Contact_Us() {
        Sign_In_And_Help_Options();
        Forgot_Online_ID_Button.click();
        Dont_Have_SSN_Link.click();
        Contact_Us_Link.click();
    }

    public void Forgot_Passcode_Continue(String cardNR, String SSN, String ID) {
        Sign_In_And_Help_Options();
        Forgot_Passcode_Button.click();
        Complete_Card_Or_Account_Number_Box.sendKeys(cardNR);
        Complete_SSN_Box.sendKeys(SSN);
        Your_Online_ID_Box.sendKeys(ID);
        Common_Continue_Box.click();
    }

    public void Forgot_Passcode_Cancel(String cardNR, String SSN, String ID) {
        Sign_In_And_Help_Options();
        Forgot_Passcode_Button.click();
        Complete_Card_Or_Account_Number_Box.sendKeys(cardNR);
        Complete_SSN_Box.sendKeys(SSN);
        Your_Online_ID_Box.sendKeys(ID);
        Common_Cancel_Box.click();
    }

    public void Forgot_Passcode_Contact_Us() {
        Sign_In_And_Help_Options();
        Forgot_Passcode_Button.click();
        Dont_Have_SSN_Link.click();
        Contact_Us_Link.click();
    }

    public void Forgot_Online_ID_And_Passcode_Continue(String cardNR, String SSN) {
        Sign_In_And_Help_Options();
        Forgot_Online_ID_And_Passcode_Button.click();
        Complete_Card_Or_Account_Number_Box.sendKeys(cardNR);
        Complete_SSN_Box.sendKeys(SSN);
        Common_Continue_Box.click();
    }

    public void Forgot_Online_ID_And_Passcode_Cancel(String cardNR, String SSN) {
        Sign_In_And_Help_Options();
        Forgot_Online_ID_And_Passcode_Button.click();
        Complete_Card_Or_Account_Number_Box.sendKeys(cardNR);
        Complete_SSN_Box.sendKeys(SSN);
        Common_Cancel_Box.click();
    }

    public void Forgot_Online_ID_And_Passcode_Contact_Us() {
        Sign_In_And_Help_Options();
        Forgot_Online_ID_And_Passcode_Button.click();
        Dont_Have_SSN_Link.click();
        Contact_Us_Link.click();
    }
}
