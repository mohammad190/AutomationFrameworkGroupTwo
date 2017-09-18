package targetRetail;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='header']/nav[1]/a[1]")
    public static WebElement homeBtn;
    @FindBy(how = How.ID, using = "js-toggleLeftNavLg")
    public static WebElement ctgryBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='0htu7']/a")
    public static WebElement tagetFindsBtnC;
    @FindBy(how = How.XPATH, using = ".//*[@id='5xt85']/a")
    public static WebElement sportsBtnC;
    @FindBy(how = How.XPATH, using = ".//*[@id='5xt6q']/a")
    public static WebElement tailgatingBtnCS;
    @FindBy(how = How.XPATH, using = ".//*[@id='js-toggleSecondaryNav']")
    public static WebElement dealsBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='secondaryNavigation']/ul/li[2]/a")
    public static WebElement weeklyAdsBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='searchLabel']")
    public static WebElement searchBoxBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='search']")
    public static WebElement searchBox;
    @FindBy(how = How.XPATH, using = ".//*[@id='js-toggleRightNavLg']")
    public static WebElement myAcntBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='rightNav-signIn']")
    public static WebElement signinBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='rightNav-createAccount']")
    public static WebElement createAcntBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='js-toggleMiniCartLg']")
    public static WebElement myCartHover;
    @FindBy(how = How.XPATH, using = ".//*[@id='miniCart']/div[2]/a")
    public static WebElement viewCartBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='headerTop']/header/nav/ul/li[1]/a")
    public static WebElement regestryNlistBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='headerTop']/header/nav/ul/li[2]/a")
    public static WebElement weeklyAdHBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='headerTop']/header/nav/ul/li[3]/a")
    public static WebElement redCardBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='headerTop']/header/nav/ul/li[4]/a")
    public static WebElement giftCardBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='headerTop']/header/nav/ul/li[5]/a")
    public static WebElement findStoreBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='headerTop']/header/nav/ul/li[6]/a")
    public static WebElement crushBtn;

    public void homeBtn(){
        homeBtn.click();
    }
    public void ctgryBtn(){
        ctgryBtn.click();
    }
    public void targetFindsBtn() throws InterruptedException {
        ctgryBtn.click();
        Thread.sleep(500);
        tagetFindsBtnC.click();
    }
    public void tailgatingBtn() throws InterruptedException {
        ctgryBtn.click();
        Thread.sleep(500);
        sportsBtnC.click();
        Thread.sleep(500);
        tailgatingBtnCS.click();
    }
    public void dealsBtn(){
        dealsBtn.click();
    }
    public void weaklyAdsBtn() throws InterruptedException {
        dealsBtn.click();
        Thread.sleep(500);
        weeklyAdsBtn.click();
    }
    public void searchFor(String keyword){
        searchBoxBtn.click();
        searchBox.sendKeys(keyword, Keys.ENTER);
    }
    public void myAcntBtTest(){
        myAcntBtn.click();
    }
    public void signinPg() throws InterruptedException {
        myAcntBtn.click();
        Thread.sleep(500);
        signinBtn.click();
    }
    public void createAcntPg() throws InterruptedException {
        myAcntBtn.click();
        Thread.sleep(500);
        createAcntBtn.click();
    }

    public void  viewCart(){
        Actions hv = new Actions(driver) ;
            hv.moveToElement(myCartHover).build().perform();
            viewCartBtn.click();
    }
    public void regestryNlist(){
        regestryNlistBtn.click();
    }
    public void weeklyAdH(){
        weeklyAdHBtn.click();
    }
    public void redCard(){
        redCardBtn.click();
    }
    public void findStore(){
        findStoreBtn.click();
    }
    public void giftCard(){
        giftCardBtn.click();
    }
    public void crushBtn(){
    crushBtn.click();
    }
}
