package WellsFargo_BankFeatures;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Banking extends CommonAPI {

    public static Actions actions = new Actions(driver);

    @FindBy(how = How.ID,using = "bankingTab")
    WebElement banking_features;

    @FindBy(how = How.XPATH,using = ".//*[@id='banking']/div[1]/div[1]/ul/li[1]/a")
    WebElement checkingAccount;

    @FindBy(how = How.XPATH,using = ".//*[@id='c28lightbox']/div[2]")
    WebElement ZipCode_box;

    @FindBy(how = How.ID,using = "zipCode")
    WebElement ZipCode_Button;

    @FindBy(how = How.ID,using = "c28lastFocusable")
    WebElement Go_box;

    @FindBy(how = How.CSS,using = ".navItemLeft>div>ul>li>a")
    WebElement transfer;


    public void checkingAccountClick(String zipcode)throws InterruptedException{

        banking_features.click();
        checkingAccount.click();
        ZipCode_box.click();
        ZipCode_Button.sendKeys(zipcode);
        Go_box.click();
    }
    public void features()throws InterruptedException{
        Thread.sleep(100);
        WebElement element = banking_features;
        actions.moveToElement(element).perform();
        Thread.sleep(100);
        banking_features.click();
        transfer.click();
    }
}


