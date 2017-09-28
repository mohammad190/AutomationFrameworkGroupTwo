package MovingHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MovingHomePageFeatures extends CommonAPI {

    @FindBy(how = How.XPATH,using = ".//a[@href='#_nextFrame']")
    WebElement VisaPage;

    @FindBy(how = How.XPATH,using = ".//a[@href='#_nextFrame']")
    WebElement CollagePage;

    @FindBy(how = How.XPATH,using = ".//a[@href='#_nextFrame']")
    WebElement CheckingAccountPage;

    public void HomepageFeatures()throws InterruptedException{
        VisaPage.click();
        Thread.sleep(200);
        CollagePage.click();
        Thread.sleep(200);
        CheckingAccountPage.click();
        Thread.sleep(200);
    }
}
