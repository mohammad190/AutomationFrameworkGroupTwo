package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TodaysDeals extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//div[1]/header/div/div[2]/div[3]/div/div/a[2]")
    WebElement Todays_Deals;

    public void Todays_Deals() {
        Todays_Deals.click();
    }
}
