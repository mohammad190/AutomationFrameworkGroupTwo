package WellsFargo_BankFeatures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Financial_Education extends CommonAPI {


    @FindBy(how = How.LINK_TEXT,using = "Financial Education")
    public static WebElement Click_Financial_Education_1;

    @FindBy(how = How.CSS,using = ".navArea1>a")
    public static WebElement Click_Basic_finances_2;

    @FindBy(how = How.LINK_TEXT,using = "Credit Management")
    public static WebElement Click_Credit_Management_3;

    @FindBy(how = How.LINK_TEXT,using = "Education Finances")
    public static WebElement Click_Education_finances_4;

    @FindBy(how = How.LINK_TEXT,using = "Homeownership")
    public static WebElement Click_HomeOwnership_5;

    @FindBy(how = How.LINK_TEXT,using = "Investing")
    public static WebElement Click_Investing_6;

    @FindBy(how = How.LINK_TEXT,using = "Retirement")
    public static WebElement Click_Retirment_7;

    @FindBy(how = How.LINK_TEXT,using = "Insurance and Protection")
    public static WebElement Click_Insurance_Protection_8;

    @FindBy(how = How.LINK_TEXT,using = "Small Business")
    public static WebElement Click_Small_business_9;

    public void Financial_Education_Elements()throws InterruptedException{
        Click_Financial_Education_1.click();
        //Thread.sleep(3000);
        Click_Basic_finances_2.click();
        //Thread.sleep(3000);
        Click_Credit_Management_3.click();
        //Thread.sleep(1000);
        Click_Education_finances_4.click();
        //Thread.sleep(1000);
        Click_HomeOwnership_5.click();
        //Thread.sleep(1000);
        Click_Investing_6.click();
        //Thread.sleep(1000);
        Click_Retirment_7.click();
        //Thread.sleep(1000);
        Click_Insurance_Protection_8.click();
        //Thread.sleep(1000);
        Click_Small_business_9.click();
        //Thread.sleep(1000);
    }
}
