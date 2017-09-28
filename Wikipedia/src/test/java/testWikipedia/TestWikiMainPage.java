package testWikipedia;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import wikiPedia.WikiMainPage;

public class TestWikiMainPage extends CommonAPI {
    public void mainPage(){
        driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
            }
    @Test
    public void testTalk(){
        mainPage();
        WikiMainPage wikiMainPage = PageFactory.initElements(driver, WikiMainPage.class);
        wikiMainPage.talk();
    }

    @Test
    public void searchCont(){
        mainPage();
        WikiMainPage wikiMainPage = PageFactory.initElements(driver, WikiMainPage.class);
        wikiMainPage.contribution();
    }

    @Test
    public void loginPage(){
        mainPage();
        WikiMainPage wikiMainPage = PageFactory.initElements(driver,WikiMainPage.class);
       wikiMainPage.goToLoginPage();
    }
    @Test
    public void createAccountPage(){
        mainPage();
        WikiMainPage wikiMainPage = PageFactory.initElements(driver,WikiMainPage.class);
        wikiMainPage.goToCreateAccountPage();
    }
    @Test
    public void testViewHistorybtn(){
        mainPage();
        WikiMainPage wikiMainPage = PageFactory.initElements(driver,WikiMainPage.class);
        wikiMainPage.viewHisBtn();
    }

}
