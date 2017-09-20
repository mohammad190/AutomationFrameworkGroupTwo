package Insurance;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Insurance_features extends CommonAPI {

    @FindBy(how = How.ID,using = "insuranceTab")
    public static WebElement click_Insurance_features;

    @FindBy(how = How.XPATH,using = ".//img[@role='button']")
    public static WebElement click_crossBox;



    @FindBy(how = How.LINK_TEXT,using = "Auto Insurance")
    public static WebElement click_AutoInsurance;

    @FindBy(how = How.LINK_TEXT,using = "Homeowners Insurance")
    public static WebElement click_HomeOwnerInsurance;

    @FindBy(how = How.LINK_TEXT,using = "Insurance Overview")
    public static WebElement click_InsuranceOverview;

    @FindBy(how = How.LINK_TEXT,using = "Specialty Vehicle Insurance")
    public static WebElement click_specialityVehicalInsurance;

    @FindBy(how = How.LINK_TEXT,using = "Umbrella Liability Insurance")
    public static WebElement click_UmberellaLibrty_Insurance;

    public static void Insurance_features()throws InterruptedException{

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
        Thread.sleep(3000);





//
//        Actions action = new Actions(driver);
//        WebElement element = click_loans_Tab_1;
//        action.moveToElement(element).perform();
//
//        click_Mortgage_Loan_2.click();
//        driver.navigate().back();
//        action.moveToElement(element).perform();
    }
}
