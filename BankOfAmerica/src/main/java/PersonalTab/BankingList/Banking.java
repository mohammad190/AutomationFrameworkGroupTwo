package PersonalTab.BankingList;

import PersonalTab.ActionsClass;
import PersonalTab.WaitForElement;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Banking extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-2']/form/ul/li[1]/a")
    WebElement List_Banking_Button;

    @FindBy(how = How.ID, using = "zipCodeModalInputField")
    WebElement General_Banking_ZipCode;

    @FindBy(how = How.ID, using = "go-button-zip-modal")
    WebElement General_Banking_Go;

    @FindBy(how = How.NAME, using = "checking_")
    WebElement List_Banking_Checking;

    @FindBy(how = How.NAME, using = "savings")
    WebElement List_Banking_Savings;

    @FindBy(how = How.NAME, using = "cds")
    WebElement List_Banking_CDs;

    @FindBy(how = How.NAME, using = "business_checking")
    WebElement List_Banking_Business_Checking;

    @FindBy(how = How.NAME, using = "l2_banking_student_banking")
    WebElement List_Banking_Student_Banking;

    @FindBy(how = How.NAME, using = "online_banking")
    WebElement List_Banking_Online_Banking;

    @FindBy(how = How.NAME, using = "mobile_banking")
    WebElement List_Banking_Mobile_Banking;

    @FindBy(how = How.NAME, using = "12_banking_more_products")
    WebElement List_Banking_More_Products;

    @FindBy(how = How.NAME, using = "preferred_rewards_")
    WebElement List_Banking_Preferred_Rewards;

    @FindBy(how = How.NAME, using = "explore_popular_features")
    WebElement List_Banking_Explore_Popular_Features;

    public void Banking_Button() {
        WaitForElement.waitForElement(List_Banking_Button);
        WebElement element = List_Banking_Button;
        ActionsClass.action.moveToElement(element).perform();
    }

    public void Enter_Zip_And_Go() {
            General_Banking_ZipCode.sendKeys("11373");
            General_Banking_Go.click();
    }

    public void Checking(){
        Banking_Button();
        waitUntilClickable(List_Banking_Checking);
        List_Banking_Checking.click();
        Enter_Zip_And_Go();
    }

    public void Savings() {
        Banking_Button();
        waitUntilClickable(List_Banking_Savings);
        List_Banking_Savings.click();
        Enter_Zip_And_Go();
    }

    public void CDs() {
        Banking_Button();
        waitUntilClickable(List_Banking_CDs);
        List_Banking_CDs.click();
        Enter_Zip_And_Go();
    }

    public void Business_Checking() {
        Banking_Button();
        waitUntilClickable(List_Banking_Business_Checking);
        List_Banking_Business_Checking.click();
        Enter_Zip_And_Go();
    }

    public void Student_Banking() {
        Banking_Button();
        waitUntilClickable(List_Banking_Student_Banking);
        List_Banking_Student_Banking.click();
    }

    public void Online_Banking() {
        Banking_Button();
        waitUntilClickable(List_Banking_Online_Banking);
        List_Banking_Online_Banking.click();
    }

    public void Mobile_Banking() {
        Banking_Button();
        waitUntilClickable(List_Banking_Mobile_Banking);
        List_Banking_Mobile_Banking.click();
    }

    public void More_Products() {
        Banking_Button();
        waitUntilClickable(List_Banking_More_Products);
        List_Banking_More_Products.click();
    }

    public void Preferred_Rewards() {
        Banking_Button();
        waitUntilClickable(List_Banking_Preferred_Rewards);
        List_Banking_Preferred_Rewards.click();
    }

    public void Explore_Popular_Features() {
        Banking_Button();
        waitUntilClickable(List_Banking_Explore_Popular_Features);
        List_Banking_Explore_Popular_Features.click();
    }
}
