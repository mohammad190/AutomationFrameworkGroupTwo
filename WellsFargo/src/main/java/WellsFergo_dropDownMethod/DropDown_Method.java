package WellsFergo_dropDownMethod;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Method extends CommonAPI {

    @FindBy(how = How.ID,using = "destination")
    public static WebElement Destination_Box;

    public static void DropDownFeatures()throws InterruptedException{
        Destination_Box.click();
        Select select = new Select(Destination_Box);
        select.selectByValue("AccountSummary");
        Thread.sleep(2000);
        select.selectByValue("Transfer");
        Thread.sleep(2000);
        select.selectByValue("BillPay");
        Thread.sleep(2000);
        select.selectByValue("Brokerage");
        Thread.sleep(2000);
        select.selectByValue("Trade");
        Thread.sleep(2000);
        select.selectByValue("MessageAlerts") ;
        Thread.sleep(2000);
        System.out.println("This all test is passed");

    }
}
