package BH;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login extends CommonAPI {
    @FindBy(how = How.XPATH, using = "html/body/div[1]/div[1]/header/section[2]/div[2]/div[2]/a")
    WebElement BH_Cart;

    public void cart_Test() {
        BH_Cart.click();

    }
    @FindBy(how = How.XPATH, using = "html/body/div[1]/div[2]/div[1]/div/div[1]/div/div[2]/p[2]/a[2]/img")
    public static WebElement loginbox;

    @FindBy(how = How.ID, using = "email-input")
    public static WebElement emailBox;

    @FindBy(how = How.ID, using = "password-input")
    public static WebElement passBox;

    @FindBy(how = How.XPATH, using = "html/body/div[1]/form/button")
    public static WebElement loginBox;

    @FindBy(how = How.XPATH, using = "html/body/div[1]/div[1]/p/a")
    public static WebElement createNewACC;


    public void loginBH(String email, String password) {
        loginBox.click();
        emailBox.sendKeys(email);
        passBox.sendKeys(password);
        loginBox.click();
        createNewACC.click();
    }

}