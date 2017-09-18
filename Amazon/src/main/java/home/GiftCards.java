package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GiftCards extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//div[1]/header/div/div[2]/div[3]/div/div/a[3]")
    WebElement Gift_Cards;

    public void Gift_cards() {
        Gift_Cards.click();
    }
}
