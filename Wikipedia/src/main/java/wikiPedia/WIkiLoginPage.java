package wikiPedia;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WIkiLoginPage extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='pt-login']/a")
    public static WebElement loginPg;
    @FindBy (how = How.XPATH, using = ".//*[@id='wpName1']")
    public static WebElement usrNameBox;
    @FindBy (how = How.XPATH, using = ".//*[@id='wpPassword1']")
    public static WebElement passWordBoxLP;
    @FindBy (how = How.XPATH, using = ".//*[@id='wpRemember']")
    public static WebElement rememberBtn;
    @FindBy (how = How.XPATH, using = ".//*[@id='wpLoginAttempt']")
    public static WebElement loginBtn;
    @FindBy (how = How.XPATH, using = ".//*[@id='userloginForm']/form/div/div[5]/div/a")
    public static WebElement helpWithLoginPage;
    @FindBy (how = How.XPATH, using = ".//*[@id='userloginForm']/form/div/div[6]/div")
    public static WebElement forgatePassPage;
    @FindBy (how = How.XPATH, using = ".//*[@id='mw-createaccount-join']")
    public static WebElement joinWiki;



    public void loggingIn(String userNm, String pass ){
        loginPg.click();
        usrNameBox.sendKeys(userNm);
        passWordBoxLP.sendKeys(pass);
        rememberBtn.click();
        loginBtn.click();
    }
    public  void getHelpwithLogin(){
        loginPg.click();
        helpWithLoginPage.click();

    }
    public void fortgetPass(){
        loginPg.click();
        forgatePassPage.click();
    }
    public  void joinWiki(){
        loginPg.click();
        joinWiki.click();
    }
}
