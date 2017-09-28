package WellsFargo_BankFeatures;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Accounts_Catagory extends CommonAPI {

    @FindBy(how = How.ID,using = "destination")
    WebElement AccountType;

    @FindBy(how = How.ID,using = "userid")
    WebElement put_userId;

    @FindBy(how = How.ID,using = "password")
    WebElement put_Password;

    @FindBy(how = How.ID,using = "btnSignon")
    WebElement signInButton;

    public void AccountTrade(String value)throws InterruptedException{
        AccountType.sendKeys(value);
        Thread.sleep(300);
    }
    public void user_ID(String name)throws InterruptedException{
        put_userId.sendKeys(name);
        Thread.sleep(300);
    }
    public void user_password(String password)throws InterruptedException{
        put_Password.sendKeys(password);
        Thread.sleep(300);
    }
    public void SignIn()throws InterruptedException{
        signInButton.click();
        Thread.sleep(300);
    }
}
