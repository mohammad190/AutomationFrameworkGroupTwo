package Twitter_Features;

import WellsFargo_BankFeatures.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Twitter_New_Account extends CommonAPI {

    @FindBy(how = How.LINK_TEXT,using = "Sign up")
    public static WebElement Click_SignUp_Box;

    @FindBy(how = How.ID,using = "full-name")
    public static WebElement Click_FullName_box;

    @FindBy(how = How.ID,using = "email")
    public static WebElement Click_PhoneOrEmail_box;

    @FindBy(how = How.ID,using = "password")
    public static WebElement Click_Password_box;

    @FindBy(how = How.ID,using = "submit_button")
    public static WebElement Click_SignUp_Button;


    public static void CreateNew_Twitter_Account(String fullName, String email, String password )throws InterruptedException{
        Click_SignUp_Box.click();
        Thread.sleep(5000);
        Click_FullName_box.sendKeys(fullName);
        Thread.sleep(5000);
        Click_PhoneOrEmail_box.sendKeys(email);
        Thread.sleep(5000);
        Click_Password_box.sendKeys(password);
        Thread.sleep(5000);
        Click_SignUp_Button.click();
        Thread.sleep(5000);
    }
}
