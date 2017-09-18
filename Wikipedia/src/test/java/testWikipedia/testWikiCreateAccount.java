package testWikipedia;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import wikiPedia.WIkiLoginPage;
import wikiPedia.WikiCreateAccount;

public class testWikiCreateAccount extends CommonAPI {
    public void mainPage(){
        driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
    }


    @Test

    public void loggingIn(){
        mainPage();
        WikiCreateAccount wikiCreateAccount = PageFactory.initElements(driver, WikiCreateAccount.class);
        wikiCreateAccount.createAccount("pntautomationgroup2", "Group2@piit", "Group2piit@gmail.com",
                "akjsdbih");
    }
}
