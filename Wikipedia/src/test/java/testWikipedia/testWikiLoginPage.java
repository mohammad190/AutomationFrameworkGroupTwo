package testWikipedia;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import wikiPedia.WIkiLoginPage;
import wikiPedia.WikiMainPage;

public class testWikiLoginPage extends CommonAPI {

    public void mainPage(){
        driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
    }


    @Test

    public void loggingIn(){
        mainPage();
        WIkiLoginPage wIkiLoginPage= PageFactory.initElements(driver, WIkiLoginPage.class);
       wIkiLoginPage.loggingIn("pntautomationgroup2","Group2@piit");
    }

    @Test

    public void getHelpWithLogin(){
        mainPage();
        WIkiLoginPage wIkiLoginPage= PageFactory.initElements(driver, WIkiLoginPage.class);
       wIkiLoginPage.getHelpwithLogin();
    }

    @Test
    public void ForgetPass(){
        mainPage();
        WIkiLoginPage wIkiLoginPage= PageFactory.initElements(driver, WIkiLoginPage.class);
        wIkiLoginPage.fortgetPass();
    }
    @Test
    public void joinWikiPage(){
        mainPage();
        WIkiLoginPage wIkiLoginPage= PageFactory.initElements(driver, WIkiLoginPage.class);
        wIkiLoginPage.joinWiki();
    }
}
