package PersonalTab.CreditCardsList;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LowerInterestRateCards extends CommonAPI {

    @FindBy(how = How.ID, using = "home_4020243~CF~en_US")
    WebElement Apply_Now_Button;

    @FindBy(how = How.ID, using = "xIORgd")
    WebElement Save_For_Later_Button;

    @FindBy(how = How.ID, using = "zz_snr_firstName_v_1-label")
    WebElement First_Name_Box;

    @FindBy(how = How.ID, using = "zz_snr_lastName_v_1-label")
    WebElement Last_Name_Box;

    @FindBy(how = How.ID, using = "zz_snr_emailAddress_v_1-label")
    WebElement Email_Box;

    @FindBy(how = How.ID, using = "zz_snr_dateOfBirth_v_1-label")
    WebElement Date_Of_Birth_Box;

    @FindBy(how = How.ID, using = "zz_snr_mothersMaidenName_v_1-label")
    WebElement Mothers_Maiden_Name;

    @FindBy(how = How.ID, using = "dX6Je0")
    WebElement Save_My_Application_Button;

    @FindBy(how = How.ID, using = "xIORjd")
    WebElement Return_To_Application_Button;

    @FindBy(how = How.ID, using = "xIORmd")
    WebElement Exit_Without_Saving;

    public void Apply_And_Go_Back() {
        Apply_Now_Button.click();
        driver.navigate().back();
    }

    public void Save_Application_For_Later(String firstName, String lastName, String eMail, String DOB, String MothersMaidenName) {
        Apply_And_Go_Back();
        Save_For_Later_Button.click();
        First_Name_Box.sendKeys(firstName);
        Last_Name_Box.sendKeys(lastName);
        Email_Box.sendKeys(eMail);
        Date_Of_Birth_Box.sendKeys(DOB);
        Mothers_Maiden_Name.sendKeys(MothersMaidenName);
        Save_My_Application_Button.click();
    }

    public void Return_To_Application() {
        Apply_And_Go_Back();
        Return_To_Application_Button.click();
    }

    public void Exit_Without_Saving() {
        Apply_And_Go_Back();
        Exit_Without_Saving.click();
    }
}
