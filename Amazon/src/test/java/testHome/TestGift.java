package testHome;

import base.CommonAPI;
import home.GiftCards;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestGift extends CommonAPI {
    @Test
    public void GiftCards() throws InterruptedException {
        GiftCards gift = PageFactory.initElements(driver, GiftCards.class);
        gift.Gift_cards();
    }
}