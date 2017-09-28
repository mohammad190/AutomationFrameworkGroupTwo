package Insurance;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Insurance_features extends CommonAPI {

    @FindBy(how = How.ID,using = "insuranceTab")
    WebElement click_Insurance_features;

    @FindBy(how = How.XPATH,using = ".//img[@role='button']")
    WebElement click_crossBox;

    @FindBy(how = How.LINK_TEXT,using = "Auto Insurance")
    WebElement click_AutoInsurance;

    @FindBy(how = How.LINK_TEXT,using = "Homeowners Insurance")
    WebElement click_HomeOwnerInsurance;

    @FindBy(how = How.LINK_TEXT,using = "Insurance Overview")
    WebElement click_InsuranceOverview;

    @FindBy(how = How.LINK_TEXT,using = "Specialty Vehicle Insurance")
    WebElement click_specialityVehicalInsurance;

    @FindBy(how = How.LINK_TEXT,using = "Umbrella Liability Insurance")
    WebElement click_UmberellaLibrty_Insurance;

    public void Insurance_features()throws InterruptedException {

        Actions action = new Actions(driver);
        WebElement element = click_Insurance_features;
        action.moveToElement(element).perform();


        click_InsuranceOverview.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_AutoInsurance.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_specialityVehicalInsurance.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_HomeOwnerInsurance.click();
        driver.navigate().back();
        action.moveToElement(element).perform();

        click_UmberellaLibrty_Insurance.click();
        driver.navigate().back();
        //action.moveToElement(element).perform();
        Thread.sleep(300);
    }
}
