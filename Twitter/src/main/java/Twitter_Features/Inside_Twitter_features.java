package Twitter_Features;

import WellsFargo_BankFeatures.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Inside_Twitter_features extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='doc']/div[1]/div/div[1]/div[2]/a[3]")
    public static WebElement get_Login;

    @FindBy(how = How.CSS, using = ".text-input.email-input.js-signin-email")
    public static WebElement get_userName;

    @FindBy(how = How.NAME, using = "session[password]")
    public static WebElement get_password;

    @FindBy(how = How.XPATH, using = ".//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/input[1]")
    public static WebElement get_login_Button;

    @FindBy(how = How.ID, using = "tweet-box-home-timeline")
    public static WebElement click_Twitting_Box;

    @FindBy(how = How.XPATH, using = ".//*[@id='timeline']/div[2]/div/form/div[3]/div[2]/button")
    public static WebElement click_Twit_Button;

    @FindBy(how = How.XPATH, using = ".//*[@id='page-container']/div[1]/div[1]/div/div[1]/div/a")
    public static WebElement get_Sujon_profile;


    public static void Twitter_Home_Page(String email, String password,String Article) throws InterruptedException {
        get_Login.click();

        get_userName.sendKeys(email);

        get_password.sendKeys(password);

        get_login_Button.click();

        click_Twitting_Box.sendKeys(Article);
        click_Twit_Button.click();

        get_Sujon_profile.click();
        Thread.sleep(5000);

    }
}
