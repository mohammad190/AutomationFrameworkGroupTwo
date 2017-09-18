package PersonalTab.BankingList;

import PersonalTab.MouseScroll;
import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StudentBanking extends CommonAPI {

    @FindBy(how = How.ID, using = "FindLocations_2017StudentBankingHomepage")
    WebElement Find_Locations_Button;

    @FindBy(how = How.ID, using = "rioSearchInput")
    WebElement Find_Locations_Search_Box;

    @FindBy(how = How.ID, using = "rioSearchButton")
    WebElement Find_Locations_Search_Button;

    public void Find_Location(String AddressOrZipCode) throws InterruptedException {
        MouseScroll.mouseScroll(0, 800);
        Find_Locations_Button.click();
        Thread.sleep(2000);
        Find_Locations_Search_Box.sendKeys(AddressOrZipCode);
        Find_Locations_Search_Button.click();
    }
}
