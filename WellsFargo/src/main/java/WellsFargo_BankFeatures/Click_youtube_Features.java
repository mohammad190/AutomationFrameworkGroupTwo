package WellsFargo_BankFeatures;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Click_youtube_Features extends CommonAPI {
    @FindBy(how = How.XPATH,using = ".//a[@href='https://www.youtube.com/user/wellsfargo']")
    public static WebElement Bank_youtube;

    public static void Features_youtube() throws InterruptedException {
        MouseScroll.mouseScroll(0,2200);
        Thread.sleep(5000);
        Bank_youtube.click();
    }
}
