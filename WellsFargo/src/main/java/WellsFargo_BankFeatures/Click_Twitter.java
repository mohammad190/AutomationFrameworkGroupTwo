package WellsFargo_BankFeatures;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Click_Twitter extends CommonAPI {

    @FindBy(how = How.XPATH,using = ".//a[@href='https://twitter.com/wellsfargo']")
    public static WebElement Twitter;

    public static void Twitter_Features(){
        Twitter.click();
    }
}
