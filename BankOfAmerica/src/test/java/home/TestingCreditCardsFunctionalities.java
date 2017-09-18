package home;

import PersonalTab.CreditCardsList.*;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestingCreditCardsFunctionalities extends CommonAPI {

    @Test
    public void Test_Featured_Credit_Cards() throws InterruptedException {
        CreditCards creditCards = PageFactory.initElements(driver, CreditCards.class);
        FeaturedCreditCards featuredCreditCards = PageFactory.initElements(driver, FeaturedCreditCards.class);
        creditCards.Featured_Credit_Cards();
        /*
            The Checkboxes will Check if you input "Yes" down below, and it will ignore the
            specified CheckBox if you input "No".
            CardType Options in the String Parameters: Visa/MasterCard.
         */
        featuredCreditCards.Filter_Cards_Choose_Options("Yes", "No", "No", "Yes", "No", "Visa");
        //featuredCreditCards.Filter_Cards_Select_All();
    }

    public void Test_Cash_Rewards_Cards() throws  InterruptedException {
        CreditCards creditCards = PageFactory.initElements(driver, CreditCards.class);
        CashRewardsCards cashRewardsCards = PageFactory.initElements(driver, CashRewardsCards.class);
        creditCards.Cash_Rewards_Cards();
        /*
            Options: BOA/Pink Ribbon/MLB/Wild Life/US Pride
         */
        cashRewardsCards.Compare_Two_Cards("BOA", "MLB");
    }

    public void Test_Travel_And_Airline_Rewards_Cards() throws InterruptedException {
        CreditCards creditCards = PageFactory.initElements(driver, CreditCards.class);
        TravelAndAirlineRewardsCards travelAndAirlineRewardsCards = PageFactory.initElements(driver, TravelAndAirlineRewardsCards.class);
        creditCards.Travel_And_Airline_Rewards_Cards();
        /*
            Options: BOA/Alaska/Spirit/Allegiant/Amtrak/Norwegian/Royal/Virgin/Asiana/Celebrity.
         */
        travelAndAirlineRewardsCards.Compare_Two_Cards("Royal", "Alaska");
    }

    public void Test_Lower_Interest_Rate_Cards() throws InterruptedException {
        CreditCards creditCards = PageFactory.initElements(driver, CreditCards.class);
        LowerInterestRateCards lowerInterestRateCards = PageFactory.initElements(driver, LowerInterestRateCards.class);
        creditCards.Lower_Interest_Rate_Cards();
        /*
            In the Method, I am using the Back Button to Test if I am able to cancel an Application Properly.
         */
        lowerInterestRateCards.Save_Application_For_Later("", "", "", "", "");
    }
}
