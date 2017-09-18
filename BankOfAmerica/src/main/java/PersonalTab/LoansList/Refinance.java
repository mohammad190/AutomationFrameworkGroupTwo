package PersonalTab.LoansList;

import PersonalTab.MouseScroll;
import PersonalTab.WaitForElement;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.LinkedList;
import java.util.List;

public class Refinance extends CommonAPI {

    @FindBy(id = "prequalify-now-medium")
    WebElement Prequalify_Now_Button;

    @FindBy(xpath = ".//input[@value='PropertyPurchaseWithContract']")
    WebElement Purchase_A_Home_Check_Box;

    @FindBy(xpath = "//input[@value='PropertyPurchase']")
    WebElement Prequalify_To_Purchase_A_Home_Check_Box;

    @FindBy(xpath = ".//input[@value='RateRefinance']")
    WebElement Refinance_Existing_Balance_Check_Box;

    @FindBy(xpath = ".//input[@value='CashOut']")
    WebElement Refinance_And_Take_Additional_Cash_Out_Check_Box;

    @FindBy(linkText = "Continue")
    WebElement Continue_Button;

    @FindBy(linkText = "Cancel and exit")
    WebElement Cancel_And_Exit_Button;

    private void If_Statement_Check_Box(int CheckBoxOnetoFour) throws InterruptedException {

        Thread.sleep(2000);

        if(CheckBoxOnetoFour == 1) {
            MouseScroll.mouseScroll(0, 300);
            Purchase_A_Home_Check_Box.click();
            MouseScroll.mouseScroll(0, 600);
            waitUntilClickable(Continue_Button);
            Continue_Button.click();
        } else if (CheckBoxOnetoFour == 2) {
            MouseScroll.mouseScroll(0, 300);
            Prequalify_To_Purchase_A_Home_Check_Box.click();
            MouseScroll.mouseScroll(0, 600);
            waitUntilClickable(Continue_Button);
            Continue_Button.click();
        } else if (CheckBoxOnetoFour == 3) {
            MouseScroll.mouseScroll(0, 300);
            Refinance_Existing_Balance_Check_Box.click();
            MouseScroll.mouseScroll(0, 600);
            waitUntilClickable(Continue_Button);
            Continue_Button.click();
        } else if (CheckBoxOnetoFour == 4) {
            MouseScroll.mouseScroll(0, 300);
            Refinance_And_Take_Additional_Cash_Out_Check_Box.click();
            MouseScroll.mouseScroll(0, 600);
            waitUntilClickable(Continue_Button);
            Continue_Button.click();
        } else {
            System.err.println("ERROR: Please Choose 1 - 4");
        }
    }

    public void Getting_Pre_Qualified_Continue(int CheckBoxOnetoFour) throws InterruptedException {
        waitUntilClickable(Prequalify_Now_Button);
        Prequalify_Now_Button.click();
        If_Statement_Check_Box(CheckBoxOnetoFour);
        Thread.sleep(5000);
    }

    public void Getting_Pre_Qualified_Cancel() {
        waitUntilClickable(Prequalify_Now_Button);
        Prequalify_Now_Button.click();
        MouseScroll.mouseScroll(0, 800);
        Cancel_And_Exit_Button.click();
    }
}
