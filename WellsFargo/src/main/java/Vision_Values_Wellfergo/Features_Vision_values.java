package Vision_Values_Wellfergo;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Features_Vision_values  extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='communityLinks']/li[1]/a")
    WebElement Go_features_Vision_1;

    @FindBy(how = How.LINK_TEXT, using = "Welcome")
    WebElement Go_Welcome_2;

    @FindBy(how = How.LINK_TEXT, using = "Our Vision")
    WebElement Go_Our_vision_3;

    @FindBy(how = How.LINK_TEXT, using = "Our Values")
    WebElement Go_Values_4;

    @FindBy(how = How.LINK_TEXT, using = "Our Culture")
    WebElement Go_OurCulture_5;

//    @FindBy(how = How.LINK_TEXT, using = "Who We Are")
//    public static WebElement Go_WoWeAre_6;

    @FindBy(how = How.XPATH, using = ".//a[@href='javascript:;']")
    WebElement Go_OurStarategy_7;

    @FindBy(how = How.LINK_TEXT, using = "Our Goals")
    WebElement Go_OurGoals_8;

    @FindBy(how = How.LINK_TEXT, using = "Our Future")
    WebElement Go_Ourfuture_9;

    public void Features_vision() throws InterruptedException {

        Go_features_Vision_1.click();
        Thread.sleep(300);
        Go_Welcome_2.click();
        Thread.sleep(300);
        Go_Our_vision_3.click();
        Thread.sleep(300);
        Go_Values_4.click();
        Thread.sleep(300);
        Go_OurCulture_5.click();
        Thread.sleep(300);
//        Go_WoWeAre_6.click();
//        Thread.sleep(2000);
        Go_OurStarategy_7.click();
        Thread.sleep(300);
        Go_OurGoals_8.click();
        Thread.sleep(300);
        Go_Ourfuture_9.click();
        Thread.sleep(300);
    }
}






















//        Select select = new Select(Go_features_Vision_Box);
//        select.selectByValue("Welcome");
//        Thread.sleep(2000);
//        select.selectByValue("Our Vision");
//        Thread.sleep(2000);
//        select.selectByValue("Our Values");
//        Thread.sleep(2000);
//        select.selectByValue("Our Culture");
//        Thread.sleep(2000);
//        select.selectByValue("Who We Are");
//        Thread.sleep(2000);
//        select.selectByValue("Our Strategy");
//        Thread.sleep(2000);
//        select.selectByValue("Our Goals");
//        Thread.sleep(2000);
//        select.selectByValue("Our Future");
//        Thread.sleep(2000);

