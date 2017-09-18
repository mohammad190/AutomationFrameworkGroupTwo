package wikiPedia;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WikiCreateAccount extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='pt-createaccount']/a")
    public static WebElement createAccountPG;
    @FindBy (how = How.ID, using = "wpName2")
    public static WebElement userNameBox;
    @FindBy (how = How.XPATH, using = ".//*[@id='wpPassword2']")
    public static WebElement passwordBox;
    @FindBy (how = How.XPATH, using = ".//*[@id='wpRetype']")
    public static WebElement passwordBoxRetype;
    @FindBy (how = How.XPATH, using = ".//*[@id='wpEmail']")
    public static WebElement emailBox;
    @FindBy (how = How.XPATH, using = " .//*[@id='mw-input-captchaWord']")
    public static WebElement capthaBox;
    @FindBy (how = How.XPATH, using = " .//*[@id='wpCreateaccount']")
    public static WebElement createAccountBtn;


    public void createAccount(String userName, String Pass, String email, String captcha) {
        createAccountPG.click();
        userNameBox.sendKeys(userName);
        passwordBox.sendKeys(Pass);
        passwordBoxRetype.sendKeys(Pass);
        emailBox.sendKeys(email);
        capthaBox.sendKeys(captcha);
        createAccountBtn.click();
    }

}
