package WellsFargo_BankFeatures;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Financial_Education extends CommonAPI {


    @FindBy(how = How.LINK_TEXT,using = "Financial Education")
    WebElement Click_Financial_Education_1;

    @FindBy(how = How.CSS,using = ".navArea1>a")
    WebElement Click_Basic_finances_2;

    @FindBy(how = How.LINK_TEXT,using = "Credit Management")
    WebElement Click_Credit_Management_3;

    @FindBy(how = How.LINK_TEXT,using = "Education Finances")
    WebElement Click_Education_finances_4;

    @FindBy(how = How.LINK_TEXT,using = "Homeownership")
    WebElement Click_HomeOwnership_5;

    @FindBy(how = How.LINK_TEXT,using = "Investing")
    WebElement Click_Investing_6;

    @FindBy(how = How.LINK_TEXT,using = "Retirement")
    WebElement Click_Retirment_7;

    @FindBy(how = How.LINK_TEXT,using = "Insurance and Protection")
    WebElement Click_Insurance_Protection_8;

    @FindBy(how = How.LINK_TEXT,using = "Small Business")
    WebElement Click_Small_business_9;

    public void Financial_Education_Elements()throws InterruptedException{
        Click_Financial_Education_1.click();

        Click_Basic_finances_2.click();

        Click_Credit_Management_3.click();

        Click_Education_finances_4.click();

        Click_HomeOwnership_5.click();

        Click_Investing_6.click();

        Click_Retirment_7.click();

        Click_Insurance_Protection_8.click();

        Click_Small_business_9.click();
    }
}
