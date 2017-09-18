package PersonalTab.CreditCardsList;

import PersonalTab.WaitForElement;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TravelAndAirlineRewardsCards extends CommonAPI {

    @FindBy(how = How.ID, using = "compare-4016361~AF~en_US")
    WebElement BOA_Travel_Card;

    @FindBy(how = How.ID, using = "compare-4020588~SY~en_US")
    WebElement Alaska_Airlines_Card;

    @FindBy(how = How.ID, using = "compare-4016560~VE~en_US")
    WebElement Spirit_Airlines_Card;

    @FindBy(how = How.ID, using = "compare-4016568~C2~en_US")
    WebElement Allegiant_Card;

    @FindBy(how = How.ID, using = "compare-4016565~BH~en_US")
    WebElement Amtrak_Card;

    @FindBy(how = How.ID, using = "compare-4016585~8M~en_US")
    WebElement Norwegian_Cruise_Card;

    @FindBy(how = How.ID, using = "compare-4019716~7W~en_US")
    WebElement Royal_Caribbean_Card;

    @FindBy(how = How.ID, using = "compare-4016594~UJ~en_US")
    WebElement Virgin_Atlantic_Card;

    @FindBy(how = How.ID, using = "compare-4016578~5V~en_US")
    WebElement Asiana_Visa_Card;

    @FindBy(how = How.ID, using = "compare-4016282~NG~en_US")
    WebElement Celebrity_Cruises_Card;

    @FindBy(how = How.ID, using = "compare_cards")
    WebElement Compare_Button;

    private void If_Else_Statement(String CardTypeOne, String CardTypeTwo) throws InterruptedException {

        if(CardTypeOne.equalsIgnoreCase("BOA")) { WaitForElement.waitForElement(BOA_Travel_Card).click(); }
        else if (CardTypeOne.equalsIgnoreCase("Alaska")) { WaitForElement.waitForElement(Alaska_Airlines_Card).click(); }
        else if (CardTypeOne.equalsIgnoreCase("Spirit")) { WaitForElement.waitForElement(Spirit_Airlines_Card).click(); }
        else if (CardTypeOne.equalsIgnoreCase("Allegiant")) { WaitForElement.waitForElement(Allegiant_Card).click(); }
        else if (CardTypeOne.equalsIgnoreCase("Amtrak")) { WaitForElement.waitForElement(Amtrak_Card).click(); }
        else if (CardTypeOne.equalsIgnoreCase("Norwegian")) { WaitForElement.waitForElement(Norwegian_Cruise_Card).click(); }
        else if (CardTypeOne.equalsIgnoreCase("Royal")) { WaitForElement.waitForElement(Royal_Caribbean_Card).click(); }
        else if (CardTypeOne.equalsIgnoreCase("Virgin")) { WaitForElement.waitForElement(Virgin_Atlantic_Card).click(); }
        else if (CardTypeOne.equalsIgnoreCase("Asiana")) { WaitForElement.waitForElement(Asiana_Visa_Card).click(); }
        else if (CardTypeOne.equalsIgnoreCase("Celebrity")) { WaitForElement.waitForElement(Celebrity_Cruises_Card).click(); }
        else { System.err.println("ERROR: Please Choose From: BOA/Alaska/Spirit/Allegiant/Amtrak/Norwegian/Royal/Virgin/Asiana/Celebrity. "); }

        Thread.sleep(2000);

        if(CardTypeTwo.equalsIgnoreCase("BOA")) { WaitForElement.waitForElement(BOA_Travel_Card).click(); }
        else if (CardTypeTwo.equalsIgnoreCase("Alaska")) { WaitForElement.waitForElement(Alaska_Airlines_Card).click(); }
        else if (CardTypeTwo.equalsIgnoreCase("Spirit")) { WaitForElement.waitForElement(Spirit_Airlines_Card).click(); }
        else if (CardTypeTwo.equalsIgnoreCase("Allegiant")) { WaitForElement.waitForElement(Allegiant_Card).click(); }
        else if (CardTypeTwo.equalsIgnoreCase("Amtrak")) { WaitForElement.waitForElement(Amtrak_Card).click(); }
        else if (CardTypeTwo.equalsIgnoreCase("Norwegian")) { WaitForElement.waitForElement(Norwegian_Cruise_Card).click(); }
        else if (CardTypeTwo.equalsIgnoreCase("Royal")) { WaitForElement.waitForElement(Royal_Caribbean_Card).click(); }
        else if (CardTypeTwo.equalsIgnoreCase("Virgin")) { WaitForElement.waitForElement(Virgin_Atlantic_Card).click(); }
        else if (CardTypeTwo.equalsIgnoreCase("Asiana")) { WaitForElement.waitForElement(Asiana_Visa_Card).click(); }
        else if (CardTypeTwo.equalsIgnoreCase("Celebrity")) { WaitForElement.waitForElement(Celebrity_Cruises_Card).click(); }
        else { System.err.println("ERROR: Please Choose From: BOA/Alaska/Spirit/Allegiant/Amtrak/Norwegian/Royal/Virgin/Asiana/Celebrity. "); }


        if (CardTypeOne.equals(CardTypeTwo)) {
            System.err.println("ERROR: Cannot Compare Two Same Cards. ");
        } else if (CardTypeTwo.equals(CardTypeOne)) {
            System.err.println("ERROR: Cannot Compare Two Same Cards. ");
        }

        Thread.sleep(2000);
        Compare_Button.click();
        Thread.sleep(2000);

    }

    public void Compare_Two_Cards(String CardTypeOne, String CardTypeTwo) throws InterruptedException {
        If_Else_Statement(CardTypeOne, CardTypeTwo);
    }
}
