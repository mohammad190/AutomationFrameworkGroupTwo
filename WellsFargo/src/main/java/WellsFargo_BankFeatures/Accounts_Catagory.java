package WellsFargo_BankFeatures;

import base.CommonAPI;
import org.apache.commons.lang3.math.IEEE754rUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Accounts_Catagory extends CommonAPI {

    @FindBy(how = How.ID,using = "destination")
    public static WebElement AccountType;

    @FindBy(how = How.ID,using = "userid")
    public static WebElement put_userId;

    @FindBy(how = How.ID,using = "password")
    public static WebElement put_Password;

    @FindBy(how = How.ID,using = "btnSignon")
    public static WebElement signInButton;

    public static void AccountTrade(String value)throws InterruptedException{
        AccountType.sendKeys(value);
        Thread.sleep(3000);
    }
    public static void user_ID(String name)throws InterruptedException{
        put_userId.sendKeys(name);
        Thread.sleep(3000);
    }
    public static void user_password(String password)throws InterruptedException{
        put_Password.sendKeys(password);
        Thread.sleep(3000);
    }
    public static void SignIn()throws InterruptedException{
        signInButton.click();
        Thread.sleep(3000);
    }
}
