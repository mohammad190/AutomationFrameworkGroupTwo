package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Department extends CommonAPI {

    Actions act = new Actions(driver);

    @FindBy(how = How.XPATH, using = ".//div[1]/header/div/div[2]/div[1]/div/a/span[2]")
    public static WebElement departmentsDropDown;

    @FindBy(how = How.XPATH, using = ".//*[@id='nav-link-accountList']/span[2]")
    public static WebElement accNlistsDropDown;

    @FindBy(how = How.XPATH, using = ".//*[@id='nav-flyout-shopAll']/div[2]/span[6]/span")
    public static WebElement fireTvSection;

    @FindBy(how = How.XPATH, using = ".//div[1]/div[2]/div/div[2]/div[1]/div/a[1]")
    public static WebElement fireTvStick;

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    public static WebElement searchInput;

    @FindBy(how = How.XPATH, using = "//a[@tabindex='64']")
    public static WebElement shoppingCart;

    @FindBy(how = How.ID, using = "ap_email")
    public static WebElement emailInput;

    @FindBy(how = How.ID, using = "ap_password")
    public static WebElement passInput;

    @FindBy(how = How.XPATH, using = ".//*[@id='signInSubmit']")
    public static WebElement signInBtn;

    @FindBy(how = How.XPATH, using = ".//*[@id='nav-flyout-ya-signin']/a/span")
    public static WebElement homeSignInBtn;

    public void goToFireTvStick(){
        act.moveToElement(departmentsDropDown).perform();
        act.moveToElement(fireTvSection).perform();
        fireTvStick.click();
    }
    public void signInFromAccNLists(){
        act.moveToElement(accNlistsDropDown).perform();
        homeSignInBtn.click();
    }
    public void logInFromAccNLists(String email, String pass){
        signInFromAccNLists();
        emailInput.sendKeys(email);
        passInput.sendKeys(pass);
        signInBtn.click();
    }
    public void searchFor(String value){
        searchInput.sendKeys(value);
    }

    public void clickOnShoppingCart(){
        shoppingCart.click();
    }
}