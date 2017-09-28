package WealthManageMent_Using_HoverMethod;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WealthManagement extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//a[@id='wealthTab']")
    WebElement click_WealthManagements_1;

    @FindBy(how = How.LINK_TEXT, using = "The Private Bank")
    WebElement click_ThePrivateBank_2;

    @FindBy(how = How.LINK_TEXT, using = "Wells Fargo Advisors")
    WebElement click_WellsFergoAdvisior_3;

    @FindBy(how = How.LINK_TEXT, using = "Abbot Downing")
    WebElement click_AbbotDowing_4;

    @FindBy(how = How.LINK_TEXT, using = "All Wealth Management Services")
    WebElement click_AllWealthManagementsService_5;

    @FindBy(how = How.LINK_TEXT, using = "Wealth Planning")
    WebElement click_WealthPlanning_6;

    @FindBy(how = How.LINK_TEXT, using = "Private Banking")
    WebElement click_PrivateBanking_7;

    @FindBy(how = How.LINK_TEXT, using = "Investment Management")
    WebElement click_InvestmentManagement_8;

    @FindBy(how = How.LINK_TEXT, using = "Specialized Wealth Services")
    WebElement click_SpecializedManagement_9;

    @FindBy(how = How.LINK_TEXT, using = "Trust Services")
    WebElement click_TrustService_10;

    @FindBy(how = How.LINK_TEXT, using = "Strategy and Research")
    WebElement click_StrategyAndReserce_11;

    @FindBy(how = How.LINK_TEXT, using = "Wealth Management Insights")
    WebElement click_WealthManagementsInsights_12;

    @FindBy(how = How.LINK_TEXT, using = "Conversations Magazine")
    WebElement click_ConversationMagazine_13;

    @FindBy(how = How.LINK_TEXT, using = "Contact The Private Bank")
    WebElement click_contactThePrivateBank_14;

    @FindBy(how = How.LINK_TEXT, using = "Contact Wells Fargo Advisors")
    WebElement click_ContactWellsFergoAdvisor_15;

    @FindBy(how = How.LINK_TEXT, using = "Contact Abbot Downing")
    WebElement click_ContactAbbotDowing_16;

    public void WealthsManagements_features() throws InterruptedException {
        Actions action = new Actions(driver);
        WebElement element = click_WealthManagements_1;
        action.moveToElement(element).perform();

        click_ThePrivateBank_2.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_WellsFergoAdvisior_3.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_AbbotDowing_4.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_AllWealthManagementsService_5.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_WealthPlanning_6.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_PrivateBanking_7.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_InvestmentManagement_8.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_SpecializedManagement_9.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_TrustService_10.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_StrategyAndReserce_11.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_WealthManagementsInsights_12.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_ConversationMagazine_13.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_contactThePrivateBank_14.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_ContactWellsFergoAdvisor_15.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_ContactAbbotDowing_16.click();
        driver.navigate().back();
        action.moveToElement(element).perform();
        Thread.sleep(300);
    }
}
