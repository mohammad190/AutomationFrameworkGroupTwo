package PersonalTab.BankingList;

import PersonalTab.CommonApplicantForm;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CDs extends CommonAPI {

    CommonApplicantForm applicantFormChecking = new CommonApplicantForm();

    @FindBy(how = How.ID, using = "compare-accounts-large")
    WebElement Compare_Accounts_Button;

    @FindBy(how = How.ID, using = "compare-featuredCDOpenNow")
    WebElement Featured_CD_Account_Button;

    @FindBy(how = How.ID, using = "compare-standardCDOpenNow")
    WebElement Standard_Term_CD_Account;

    @FindBy(how = How.ID, using = "isBoaClient")
    WebElement Is_BOA_Customer_Box;

    @FindBy(how = How.ID, using = "go-to-application-mediumup")
    WebElement Go_To_Application_Button;

    public void Compare_Accounts() throws InterruptedException {
        Compare_Accounts_Button.click();
        Thread.sleep(2000);
    }

    private void If_Statement_Check_Box(String customerYESorNO) throws InterruptedException {

        if(customerYESorNO.contains("YES")) {
            Is_BOA_Customer_Box.click();
            Go_To_Application_Button.click();
        } else if (customerYESorNO.contains("NO")) {
            Go_To_Application_Button.click();
        } else {
            System.err.println("ERROR: Please Enter Yes Or No");
        }
        Thread.sleep(2000);
    }

    public void Featured_CD_Account(String customerYESorNO) throws InterruptedException {
        Compare_Accounts();
        Featured_CD_Account_Button.click();
        If_Statement_Check_Box(customerYESorNO);
        Thread.sleep(2000);
        Applicant_Form_FillUp();
    }

    public void Standard_Term_CD_Account(String customerYESorNO) throws InterruptedException {
        Compare_Accounts();
        Standard_Term_CD_Account.click();
        If_Statement_Check_Box(customerYESorNO);
        Thread.sleep(2000);
        Applicant_Form_FillUp();
    }

    public void Applicant_Form_FillUp() {}

}
