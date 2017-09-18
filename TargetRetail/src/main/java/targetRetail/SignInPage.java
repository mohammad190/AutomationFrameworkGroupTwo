package targetRetail;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage extends CommonAPI {


    @FindBy(how = How.ID, using = "username")
    public static WebElement userNameBox;
    @FindBy(how = How.ID, using = "password")
    public static WebElement passwordBox;
    @FindBy(how = How.ID, using = "passwordToggle")
    public static WebElement showPassBtn;
    @FindBy(how = How.ID, using = "login")
    public static WebElement loginBtn;
    @FindBy(how = How.ID, using = "recoveryPassword")
    public static WebElement passwordRecoveryBtn;
    @FindBy(how = How.ID, using = "createAccount")
    public static WebElement createAccountPageBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='root']/div/div[1]/div/div[1]/a")
    public static WebElement backToMainPgBtn;

    public void signIn(String user, String pass){
        userNameBox.sendKeys(user);
        passwordBox.sendKeys(pass);
        showPassBtn.click();
        loginBtn.click();
    }
    public void passRecov(){
        passwordRecoveryBtn.click();
    }
    public void createaccnt(){
        createAccountPageBtn.click();
    }
    public void backtomainpg(){
        backToMainPgBtn.click();
    }

}
