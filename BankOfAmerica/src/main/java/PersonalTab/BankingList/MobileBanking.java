package PersonalTab.BankingList;

import PersonalTab.WaitForElement;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class MobileBanking extends CommonAPI {

    /*
        Hard Coded my Phone Number and Email, for Testing Purpose. So When Getting The App,
        I Recieve a Message or Mail depending on the input, so I can confirm that it is
        working. That is why I did not keep it as accessible by others.
     */

    private String phoneNumber = "3479356442";
    private String eMailAddress = "ibrahimhan0894@gmail.com";

    @FindBy(how = How.NAME, using = "anc_features_topnav")
    WebElement Features_Button;

    @FindBy(how = How.NAME, using = "anc_next_feature_button")
    WebElement Next_Feature_Button;

    /// Choose Your Device Related ////
    @FindBy(how = How.ID, using = "choose-device-get-the-app")
    WebElement Choose_Your_Device_Button;

    @FindBy(how = How.ID, using = "device-pulldown")
    WebElement Select_Your_Device_Drop_Down;

    @FindBy(how = How.ID, using = "choose-device")
    WebElement Select_Your_Device_Continue_Button;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter your iPhone phone number']")
    WebElement Select_Your_Device_Phone_Number_Box;

    @FindBy(how = How.ID, using = "mobile_app_download_email_id")
    WebElement Select_Your_Device_Email_Box;

    @FindBy(how = How.NAME, using = "windowsAppStore")
    WebElement Download_From_Windows_Store_Logo;

    @FindBy(how = How.ID, using = "anc_learn_more_about_phone_banking")
    WebElement Learn_About_Your_Text_Banking_Link;

    @FindBy(how = How.XPATH, using = "//form[@class='common-form']//a[text()='Send']")
    WebElement Send_To_Email_Or_Phone_Button;

    public void Get_The_App(String Device) {
        Select device = new Select(Select_Your_Device_Drop_Down);

        Choose_Your_Device_Button.click();

        if (Device.equalsIgnoreCase("iPhone")) {
            device.selectByValue("iPhone");
            Select_Your_Device_Continue_Button.click();
            Select_Your_Device_Phone_Number_Box.sendKeys(phoneNumber);
            waitUntilClickable(Send_To_Email_Or_Phone_Button);
            Send_To_Email_Or_Phone_Button.click();
        } else if (Device.equalsIgnoreCase("iPad")) {
            device.selectByValue("iPad");
            Select_Your_Device_Continue_Button.click();
            Select_Your_Device_Email_Box.sendKeys(eMailAddress);
            Send_To_Email_Or_Phone_Button.click();
        } else if (Device.equalsIgnoreCase("Android")) {
            device.selectByValue("Android");
            Select_Your_Device_Continue_Button.click();
            Select_Your_Device_Phone_Number_Box.sendKeys(phoneNumber);
            Send_To_Email_Or_Phone_Button.click();
        } else if (Device.equalsIgnoreCase("Windows 10")) {
            device.selectByValue("Windows 10");
            Select_Your_Device_Continue_Button.click();
            Download_From_Windows_Store_Logo.click();
        } else if (Device.equalsIgnoreCase("Other")) {
            device.selectByValue("Other");
            Learn_About_Your_Text_Banking_Link.click();
        } else {
            System.err.println("ERROR: Please Choose From: iPhone/iPad/Android/Windows 10/Other.");
        }
    }

    public void Features_Tab() throws InterruptedException {
        Features_Button.click();

        for(int i = 0; i <= 10; i++) {
            Next_Feature_Button.click();
            WaitForElement.waitForElement(Next_Feature_Button);
        }
    }
}

