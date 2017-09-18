package PersonalTab.LoansList;

import PersonalTab.MouseScroll;
import PersonalTab.WaitForElement;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgage extends CommonAPI {

    @FindBy(xpath = ".//div[@class='a-tag-city-state']//p//a[@id='mortgage-calculator']")
    WebElement Mortgage_Calculator_Link;

    @FindBy(xpath = ".//div[@class='plus-icon']")
    WebElement Plus_Button;

    @FindBy(id = "downpmt-amount")
    WebElement Down_Payment_Box;

    @FindBy(id = "purchcalc-zipcode-fld")
    WebElement Property_ZIP_Code_Box;

    @FindBy(id = "payment-calc-submit")
    WebElement See_Payment_Submit_Button;

    @FindBy(id = "find-a-home")
    WebElement Find_A_Home_Link;

    @FindBy(id = "Criteria/Location")
    WebElement Search_For_Homes_Box;

    @FindBy(linkText = "Search by location")
    WebElement Search_For_Homes_Button;

    @FindBy(id = "hw-address")
    WebElement Find_A_Home_Value_Box;

    @FindBy(linkText = "See your home's value")
    WebElement Find_A_Home_Value_Button;

    public void Mortgage_Calculator(String DownPaymentAmount, String ZipCode) throws InterruptedException {
        MouseScroll.mouseScroll(0, 1200);
        waitUntilClickable(Mortgage_Calculator_Link);
        Mortgage_Calculator_Link.click();

        Thread.sleep(2000);

        Plus_Button.click();
        for(int i = 0; i < 20; i++) { Plus_Button.click(); }

        Down_Payment_Box.sendKeys(DownPaymentAmount);
        Property_ZIP_Code_Box.sendKeys(ZipCode);
        See_Payment_Submit_Button.click();
    }

    public void Find_A_Home(String CityorZipCode, String YourAddress) throws InterruptedException {
        MouseScroll.mouseScroll(0, 1200);
        Thread.sleep(3000);
        Find_A_Home_Link.click();

        WaitForElement.waitForElement(Search_For_Homes_Box);

        Search_For_Homes_Box.sendKeys(CityorZipCode);
        Search_For_Homes_Button.click();

        Find_A_Home_Value_Box.sendKeys(YourAddress);
        Find_A_Home_Value_Button.click();

    }
}
