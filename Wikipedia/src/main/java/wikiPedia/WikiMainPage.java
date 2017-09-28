package wikiPedia;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WikiMainPage extends CommonAPI {

    @FindBy (how = How.XPATH, using = ".//*[@id='pt-anontalk']/a")
    public static WebElement talkBtn;
    @FindBy (how = How.XPATH, using = ".//*[@id='pt-anoncontribs']/a")
    public static WebElement contributionBtn;
    @FindBy (how = How.XPATH, using = ".//*[@id='pt-createaccount']/a")
    public static WebElement createAccountPG;
    @FindBy (how = How.XPATH, using = ".//*[@id='pt-login']/a")
    public static WebElement loginPg;
    @FindBy (how = How.ID, using = "searchInput")
    public static WebElement searchBox;
    @FindBy (how = How.CLASS_NAME, using = "searchButton")
    public static WebElement searchBtn;
    @FindBy (how = How.ID, using = "ca-history")
    public static WebElement viewHistoryBtn;



    public void talk(){
        talkBtn.click();
    }

    public void contribution(){
        contributionBtn.click();
    }

    public void goToCreateAccountPage(){
        createAccountPG.click();
        }
    public void goToLoginPage(){
        loginPg.click();
    }
    public void searchfor(String Keys){
        searchBox.sendKeys(Keys);
        searchBtn.click();

    }
    public void viewHisBtn(){
        viewHistoryBtn.click();
    }

}
