package PersonalTab.CreditCardsList;

import PersonalTab.ActionsClass;
import PersonalTab.WaitForElement;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreditCards extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-2']/form/ul/li[2]/a")
    WebElement List_Credit_Cards_Button;

    @FindBy(how = How.NAME, using = "featured_credit_cards")
    WebElement List_Credit_Cards_Featured_Credit_Cards;

    @FindBy(how = How.NAME, using = "cash_rewards_cards")
    WebElement List_Credit_Cards_Cash_Rewards_Cards;

    @FindBy(how = How.NAME, using = "travel_amp_airline_rewards_cards")
    WebElement List_Credit_Cards_Travel_And_Airline_Rewards_Cards;

    @FindBy(how = How.NAME, using = "lower_interest_rate_cards")
    WebElement List_Credit_Cards_Lower_Interest_Rate_Cards;

    @FindBy(how = How.NAME, using = "cards_to_build_or_rebuild_credit")
    WebElement List_Credit_Cards_Cards_To_Build_Or_Rebuild_Credit;

    @FindBy(how = How.NAME, using = "small_business_cards")
    WebElement List_Credit_Cards_Small_Business_Cards;

    @FindBy(how = How.NAME, using = "shop_all_credit_cards")
    WebElement List_Credit_Cards_Shop_All_Credit_Cards;

    @FindBy(how = How.NAME, using = "check_for_customized_offers")
    WebElement List_Credit_Cards_Check_For_Customized_Offers;

    @FindBy(how = How.NAME, using = "manage_your_credit_card_account")
    WebElement List_Credit_Cards_Manage_Your_Credit_Card_Account;

    public void Credit_Cards_Button() {
        WaitForElement.waitForElement(List_Credit_Cards_Button);
        WebElement element = List_Credit_Cards_Button;
        ActionsClass.action.moveToElement(element).perform();
    }

    public void Featured_Credit_Cards() {
        Credit_Cards_Button();
        waitUntilClickable(List_Credit_Cards_Featured_Credit_Cards);
        List_Credit_Cards_Featured_Credit_Cards.click();
    }

    public void Cash_Rewards_Cards() {
        Credit_Cards_Button();
        waitUntilClickable(List_Credit_Cards_Cash_Rewards_Cards);
        List_Credit_Cards_Cash_Rewards_Cards.click();
    }

    public void Travel_And_Airline_Rewards_Cards() {
        Credit_Cards_Button();
        waitUntilClickable(List_Credit_Cards_Travel_And_Airline_Rewards_Cards);
        List_Credit_Cards_Travel_And_Airline_Rewards_Cards.click();
    }

    public void Lower_Interest_Rate_Cards() {
        Credit_Cards_Button();
        waitUntilClickable(List_Credit_Cards_Lower_Interest_Rate_Cards);
        List_Credit_Cards_Lower_Interest_Rate_Cards.click();
    }
}
