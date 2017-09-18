package WellsFargo_BankFeatures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends CommonAPI{

    @FindBy(how = How.XPATH,using = ".//*[@id='signUp']/a[1]")
    public static WebElement EnrollNow;

    @FindBy(how = How.ID,using = "loansTab")
    public static WebElement get_LOans_credit;

    @FindBy(how = How.ID,using = "insuranceTab")
    public static WebElement get_insurance;

    @FindBy(how = How.ID,using = "investingTab")
    public static WebElement get_investing_retairment;

    @FindBy(how = How.ID,using = "wealthTab")
    public static WebElement Get_wealth_Management;

    @FindBy(how = How.CSS,using = "#rewardsTab")
    public static WebElement get_reward_Benefit;

    @FindBy(how = How.CSS,using = "#headerTools>nav>ul>li>a")
    public static WebElement AboutWellsFargo;

    @FindBy(how = How.CSS,using = "#topSearch>ul>li>a")
    public static WebElement AtmLocation;

    @FindBy(how = How.NAME,using = "btnSignon")
    public static WebElement LearnMore;

    @FindBy(how = How.CSS,using = "#signUp>a")
    public static WebElement FradueInformationCenter;

    @FindBy(how = How.CSS,using = "#signUp>a")
    public static WebElement Privacy_cookies_security;

    @FindBy(how = How.CSS,using = ".thumbText>span")
    public static WebElement BankingMadeEasy;

    @FindBy(how = How.CSS,using = ".thumbText>span")
    public static WebElement GoingToCollage;

    @FindBy(how = How.CSS,using = ".c7")
    public static WebElement GetStarted;

    @FindBy(how = How.CSS,using = ".navList>li>a")
    public static WebElement Carrers;


    public void HomePage1(){
        EnrollNow.click();
    }
    public void HomePage2(){
        get_LOans_credit.click();
    }
    public void HomePage3(){
        get_insurance.click();
    } public void HomePage4(){
        get_investing_retairment.click();
    }
    public void HomePage5(){
        Get_wealth_Management.click();
    }
    public void HomePage6(){
        get_reward_Benefit.click();
    }
    public void HomePage7(){
        AboutWellsFargo.click();
    }
    public void HomePage8(){
        AtmLocation.click();
    }
    public void HomePage9(){
        LearnMore.click();
    }
    public void HomePage10(){
        FradueInformationCenter.click();
    }
    public void HomePage11(){
        Privacy_cookies_security.click();
    }
    public void HomePage12(){
        BankingMadeEasy.click();
    }
    public void HomePage13(){
        GoingToCollage.click();
    }
    public void HomePage14(){
        GetStarted.click();
    }
    public void HomePage(){
        Carrers.click();
    }














    /// /    @FindBy(how = How.XPATH,using = "html/body/div[7]/div/div/div[2]/div/div/div/div")
//    public static WebElement loginBox;
//
//    @FindBy(how = How.XPATH,using = "html/body/div[2]/div/div/div/div/div/div/div[3]/div/div[3]/div")
//    public static WebElement TestCase;
//
//    @FindBy(how = How.NAME,using = "username")
//    public static WebElement usernameBox;
//
//    @FindBy(how = How.NAME,using = "password")
//    public static WebElement passwordBox;
//
//    public void loginCodeFight(String email, String password){
//        loginBox.click();
//        usernameBox.sendKeys(email);
//        passwordBox.sendKeys(password);
//        TestCase.click();
//
//    }
}
