package WellsFargo_BankFeatures;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Banking extends CommonAPI {

    public static Actions actions = new Actions(driver);

    @FindBy(how = How.ID,using = "bankingTab")
    public static WebElement banking_features;

    @FindBy(how = How.XPATH,using = ".//*[@id='banking']/div[1]/div[1]/ul/li[1]/a")
    public static WebElement checkingAccount;

    @FindBy(how = How.XPATH,using = ".//*[@id='c28lightbox']/div[2]")
    public static WebElement ZipCode_box;

    @FindBy(how = How.ID,using = "zipCode")
    public static WebElement ZipCode_Button;

    @FindBy(how = How.ID,using = "c28lastFocusable")
    public static WebElement Go_box;

    @FindBy(how = How.CSS,using = ".navItemLeft>div>ul>li>a")
    public static WebElement transfer;


    public void checkingAccountClick(String zipcode)throws InterruptedException{

        banking_features.click();
        checkingAccount.click();
        ZipCode_box.click();
        ZipCode_Button.sendKeys(zipcode);
        Go_box.click();
    }
    public void features()throws InterruptedException{
        Thread.sleep(1000);
        WebElement element = banking_features;
        actions.moveToElement(element).perform();
        Thread.sleep(1000);
        banking_features.click();
        transfer.click();



    }
}


