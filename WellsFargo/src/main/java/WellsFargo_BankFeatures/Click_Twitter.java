package WellsFargo_BankFeatures;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Click_Twitter extends CommonAPI {

    @FindBy(how = How.LINK_TEXT,using = "Diversity & Accessibility")
    WebElement Twitter;

    public void Twitter_Features() throws InterruptedException {
        Thread.sleep(2000);
        Twitter.click();





//
//    @FindBy(how = How.XPATH,using = ".//a[@href='https://twitter.com/wellsfargo']")
//    public static WebElement Twitter;
//
//    public static void Twitter_Features(){
//        Twitter.click();
    }
}
