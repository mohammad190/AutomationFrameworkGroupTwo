package MovingHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MovingHomePageFeatures extends CommonAPI {

    @FindBy(how = How.XPATH,using = ".//a[@href='#_nextFrame']")
    public static WebElement VisaPage;

    @FindBy(how = How.XPATH,using = ".//a[@href='#_nextFrame']")
    public static WebElement CollagePage;

    @FindBy(how = How.XPATH,using = ".//a[@href='#_nextFrame']")
    public static WebElement CheckingAccountPage;

    public static void HomepageFeatures()throws InterruptedException{
        VisaPage.click();
        Thread.sleep(3000);
        CollagePage.click();
        Thread.sleep(3000);
        CheckingAccountPage.click();
        Thread.sleep(3000);
    }
}
