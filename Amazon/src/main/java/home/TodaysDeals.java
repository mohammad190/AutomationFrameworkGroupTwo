package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TodaysDeals extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//div//a[@href='/gp/goldbox/ref=nav_cs_gb/138-7718627-8681933']")
    WebElement Todays_Deals;

    public void Todays_Deals() {
        Todays_Deals.click();
    }
}
