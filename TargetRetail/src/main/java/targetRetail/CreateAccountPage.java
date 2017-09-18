package targetRetail;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAccountPage extends CommonAPI {
    @FindBy(how = How.ID, using = "username")
    public static WebElement emailBox;
    @FindBy(how = How.ID, using = "password")
    public static WebElement passwordBox;
    @FindBy(how = How.ID, using = "passwordToggle")
    public static WebElement showPassBtn;
    @FindBy(how = How.ID, using = "firstname")
    public static WebElement firstNameBtn;
    @FindBy(how = How.ID, using = "lastname")
    public static WebElement lastNameBtn;
    @FindBy(how = How.ID, using = "createAccount")
    public static WebElement createAcntBtn;
    @FindBy(how = How.ID, using = "switchToLogin")
    public static WebElement signInPage;
    @FindBy(how = How.XPATH, using = ".//*[@id='root']/div/div[1]/div/div/div[1]/a")
    public static WebElement backToMainPgBtn;


    public void signIn(String email, String pass, String firstname, String lastName){
        emailBox.sendKeys(email);
        passwordBox.sendKeys(pass);
        showPassBtn.click();
        firstNameBtn.sendKeys(firstname);
        lastNameBtn.sendKeys(lastName);
        createAcntBtn.click();
    }

      public void singInPg(){
        signInPage.click();
    }
    public void backtomainpg(){
        backToMainPgBtn.click();
    }



}
