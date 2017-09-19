package PersonalTab.BankingList;

import PersonalTab.CommonApplicantForm;
import PersonalTab.MouseScroll;
import PersonalTab.WaitForElement;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Checking extends CommonAPI {

    @FindBy(id = "compare-accounts-large")
    WebElement Compare_Accounts_Button;

    @FindBy(id = "interestCheckingAccountLink")
    WebElement Interest_Checking_Account_Button;

    @FindBy(how = How.ID, using = "coreCheckingAccountLink")
    WebElement Core_Checking_Account_Button;

    //// Common Elements for Core and Interest Checking ////
    @FindBy(id = "rb-savings-regular-account")
    WebElement Regular_Savings_Account_Box;

    @FindBy(id = "rb-savings-rewards-account")
    WebElement Rewards_Savings_Account_Box;

    @FindBy(id = "rb-savings-account-none")
    WebElement Checking_Savings_Account_Box;

    @FindBy(linkText = "Go to Application")
    WebElement Go_To_Application_Button;

    private void Compare_Accounts() {
        waitUntilClickable(Compare_Accounts_Button);
        Compare_Accounts_Button.click();
    }

    private void If_Statement_Check_Box(String checkBox) {

        if(checkBox.equalsIgnoreCase("Regular")) {
            Regular_Savings_Account_Box.click();
            MouseScroll.mouseScroll(0, 400);
            WaitForElement.waitForElement(Go_To_Application_Button).click();
        } else if (checkBox.equalsIgnoreCase("Rewards")) {
            Rewards_Savings_Account_Box.click();
            MouseScroll.mouseScroll(0, 400);
            WaitForElement.waitForElement(Go_To_Application_Button).click();
        } else if (checkBox.equalsIgnoreCase("checking")) {
            Checking_Savings_Account_Box.click();
            MouseScroll.mouseScroll(0, 400);
            WaitForElement.waitForElement(Go_To_Application_Button).click();
        } else {
            System.err.println("ERROR: Please Choose Valid Check Box");
        }
    }

    public void Core_Checking(String RegularRewardsOrchecking) {
        Compare_Accounts();
        waitUntilClickable(Core_Checking_Account_Button);
        Core_Checking_Account_Button.click();
        If_Statement_Check_Box(RegularRewardsOrchecking);
    }

    public void Interest_Checking(String RegularRewardsOrchecking) {
        Compare_Accounts();
        waitUntilClickable(Interest_Checking_Account_Button);
        Interest_Checking_Account_Button.click();
        If_Statement_Check_Box(RegularRewardsOrchecking);
    }
}
