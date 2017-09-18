package PersonalTab.CreditCardsList;

import PersonalTab.MouseScroll;
import PersonalTab.WaitForElement;
import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CashRewardsCards extends CommonAPI {

    @FindBy(how = How.ID, using = "compare-4020261~KH~en_US")
    WebElement BOA_Cash_Rewards_Card;

    @FindBy(how = How.ID, using = "compare-4020880~PK~en_US")
    WebElement Pink_Ribbon_Cash_Rewards_Card;

    @FindBy(how = How.ID, using = "compare-4020886~B6~en_US")
    WebElement MLB_Card;

    @FindBy(how = How.ID, using = "compare-4020892~CY~en_US")
    WebElement World_Wildlife_Fund_Card;

    @FindBy(how = How.ID, using = "compare-4020895~3W~en_US")
    WebElement US_Pride_Card;

    @FindBy(how = How.ID, using = "compare_cards")
    WebElement Compare_Button;

    private void If_Else_Statement(String CardTypeOne, String CardTypeTwo) {

        if(CardTypeOne.equalsIgnoreCase("BOA")) {
            WaitForElement.waitForElement(BOA_Cash_Rewards_Card).click();
        } else if (CardTypeOne.equalsIgnoreCase("Pink Ribbon")) {
            WaitForElement.waitForElement(Pink_Ribbon_Cash_Rewards_Card).click();
        } else if (CardTypeOne.equalsIgnoreCase("MLB")) {
            WaitForElement.waitForElement(MLB_Card).click();
        } else if (CardTypeOne.equalsIgnoreCase("Wild Life")) {
            WaitForElement.waitForElement(World_Wildlife_Fund_Card).click();
        } else if (CardTypeOne.equalsIgnoreCase("US Pride")) {
            WaitForElement.waitForElement(US_Pride_Card).click();
        } else {
            System.err.println("ERROR: Please Choose From: BOA/Pink Ribbon/MLB/Wild Life/US Pride. ");
        }

        if(CardTypeTwo.equalsIgnoreCase("BOA")) {
            WaitForElement.waitForElement(BOA_Cash_Rewards_Card).click();
        } else if (CardTypeTwo.equalsIgnoreCase("Pink Ribbon")) {
            WaitForElement.waitForElement(Pink_Ribbon_Cash_Rewards_Card).click();
        } else if (CardTypeTwo.equalsIgnoreCase("MLB")) {
            WaitForElement.waitForElement(MLB_Card).click();
        } else if (CardTypeTwo.equalsIgnoreCase("Wild Life")) {
            WaitForElement.waitForElement(World_Wildlife_Fund_Card).click();
        } else if (CardTypeTwo.equalsIgnoreCase("US Pride")) {
            WaitForElement.waitForElement(US_Pride_Card).click();
        } else {
            System.err.println("ERROR: Please Choose From: BOA/Pink Ribbon/MLB/Wild Life/US Pride. ");
        }

        if (CardTypeOne.equals(CardTypeTwo)) {
            System.err.println("ERROR: Cannot Compare Two Same Cards. ");
        } else if (CardTypeTwo.equals(CardTypeOne)) {
            System.err.println("ERROR: Cannot Compare Two Same Cards. ");
        }

        WaitForElement.waitForElement(Compare_Button).click();
    }

    public void Compare_Two_Cards(String CardTypeOne, String CardTypeTwo) {
        If_Else_Statement(CardTypeOne, CardTypeTwo);
    }
}
