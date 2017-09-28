package Investing_Reteriment;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Investing_Retirement_Features extends CommonAPI {


    @FindBy(how = How.XPATH,using = ".//a[@id='investingTab']")
    WebElement click_InvestingRetirements_0;

    @FindBy(how = How.LINK_TEXT,using = "Invest Online")
    WebElement click_InvestOnline_1;

    @FindBy(how = How.LINK_TEXT,using = "Invest With Guidance")
    WebElement click_InvestWithGuidence_2;

    @FindBy(how = How.LINK_TEXT,using = "Invest in Mutual Funds")
    WebElement click_InvestInMutualFunds_3;

    @FindBy(how = How.LINK_TEXT,using = "Compare Ways to Invest")
    WebElement click_CompareWayToInvest_4;

    @FindBy(how = How.LINK_TEXT,using = "IRAs")
    WebElement click_IRAs_5;

    @FindBy(how = How.LINK_TEXT,using = "Investment Services")
    WebElement click_InvestmentService_6;

    @FindBy(how = How.LINK_TEXT,using = "Rollovers (401k and IRA)")
    WebElement click_Rollovers_7;

    @FindBy(how = How.LINK_TEXT,using = "Investing for Education")
    WebElement click_InvestingForEducation_8;

    @FindBy(how = How.LINK_TEXT,using = "Strategy and Research")
    WebElement click_StrategyAndResearch_9;

    @FindBy(how = How.LINK_TEXT,using = "Planning for Retirement")
    WebElement click_PlanningForRetirement_10;

    @FindBy(how = How.LINK_TEXT,using = "Income in Retirement")
    WebElement click_IncomeInRetirement_11;

    @FindBy(how = How.LINK_TEXT,using = "Investing Basics")
    WebElement click_InvestingBasics_12;

    @FindBy(how = How.LINK_TEXT,using = "Contact a Financial Advisor")
    WebElement click_ContactAFinancialAdviser_13;

    @FindBy(how = How.LINK_TEXT,using = "Open an IRA")
    WebElement click_OpenAnIRA_14;

    @FindBy(how = How.LINK_TEXT,using = "Open a WellsTrade® Account")
    WebElement click_OpenAWellsTradeAccount_15;

    @FindBy(how = How.LINK_TEXT,using = "Compare IRAs")
    WebElement click_CompareIRAs_16;

    @FindBy(how = How.LINK_TEXT,using = "My Retirement Plan")
    WebElement click_MyRetirementPlan_17;

    @FindBy(how = How.LINK_TEXT,using = "Employer Plan 401(k) Sign On")
    WebElement click_EmployeePlan_18;

    public void InvestingRetirement_features()throws InterruptedException{
        Actions action = new Actions(driver);
        WebElement element = click_InvestingRetirements_0;
        action.moveToElement(element).perform();

        click_InvestOnline_1.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_InvestWithGuidence_2.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_InvestInMutualFunds_3.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_CompareWayToInvest_4.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_IRAs_5.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_InvestmentService_6.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_Rollovers_7.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_InvestingForEducation_8.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_StrategyAndResearch_9.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_PlanningForRetirement_10.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_IncomeInRetirement_11.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_InvestingBasics_12.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_ContactAFinancialAdviser_13.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_OpenAnIRA_14.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_OpenAWellsTradeAccount_15.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_CompareIRAs_16.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_MyRetirementPlan_17.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_EmployeePlan_18.click();
        driver.navigate().back();
        action.moveToElement(element).perform();
    }
}
