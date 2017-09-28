package testTargetRetail;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import targetRetail.HomePage;

public class testHomePage extends CommonAPI {
    @Test (enabled = false)
    public void testHomeBtn(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.homeBtn();
    }
    @Test
    public void testCatagoryBtn(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.ctgryBtn();
    }
    @Test
    public void testTargetFindsBtn() throws InterruptedException {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.targetFindsBtn();
    }
    @Test
    public void testTailgating() throws InterruptedException {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.tailgatingBtn();
    }
    @Test
    public void testDealsBtn(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.dealsBtn();
    }
    @Test
    public void testWeeklyAdsFromDeals() throws InterruptedException {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.weaklyAdsBtn();
    }
    @Test
    public void testSearch(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.searchFor("Lego");
    }
    @Test
    public void testMyAccountBtn(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.myAcntBtTest();
    }
    @Test
    public void testSignInPage() throws InterruptedException {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.signinPg();
    }
    @Test
    public void testCreateAccountPage() throws InterruptedException {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.createAcntPg();
    }
    @Test
    public void testViewCart(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.viewCart();
    }
    @Test
    public void testRegestryAndList(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.regestryNlist();
    }
    @Test
    public void testWeeklyAdFromHeader(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.weeklyAdH();
    }
    @Test
    public void testRedCardBtn(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.redCard();
    }
    @Test
    public void testFindStoreBtn(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.findStore();
    }
    @Test
    public void testGiftCardBtn(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.giftCard();
    }
    @Test
    public void testCrushBtn(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.crushBtn();
    }
    @Test
    public void testRecallBtn(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.recallBtn();
    }

}
