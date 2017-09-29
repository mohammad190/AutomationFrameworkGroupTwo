package testHome;

import base.CommonAPI;
import home.TodaysDeals;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestTodaysDeals extends CommonAPI {
    @Test
    public void TodaysDeals() throws InterruptedException, IOException {
        TodaysDeals tdeal = PageFactory.initElements(driver, TodaysDeals.class);
        tdeal.Todays_Deals();

    }
}