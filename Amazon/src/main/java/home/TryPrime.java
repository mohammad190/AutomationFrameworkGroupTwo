package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TryPrime extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//div[1]/header/div/div[1]/div[1]/div/a[2]")
    WebElement Prime_Member;

    public void T_P_M() {
        Prime_Member.click();
    }

    @FindBy(how = How.XPATH, using = ".//div[1]/div[4]/div[1]/div[3]/div/div/div[1]/div[2]/span/a/span/span/input")
    WebElement Prime_Member_Plan;

    public void T_P_M_Plan() {
        Prime_Member_Plan.click();
    }
}