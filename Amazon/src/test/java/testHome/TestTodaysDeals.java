package testHome;

import base.CommonAPI;
import home.TodaysDeals;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestTodaysDeals extends CommonAPI {
    @Test
    public void TodaysDeals() throws InterruptedException {
        TodaysDeals tdeal = PageFactory.initElements(driver, TodaysDeals.class);
        tdeal.Todays_Deals();

    }
}