package WellsFergo_dropDownMethod;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class DropDown_Method extends CommonAPI {

    @FindBy(how = How.ID,using = "destination")
    WebElement Destination_Box;

    public void DropDownFeatures()throws InterruptedException, IOException {
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

        takeScreenShot("AfterCaseStatus", "C:\\Users\\sujon\\IdeaProjects\\AutomationFrameworkGroupTwo\\WellsFargo\\screenshots\\");

        // Dont need to make WebElement public and static, should work without
        // It wasnt working because TakeScreenShot ISNT static in CommonAPI but you called it here
        // inside a static method, thats why. Try now,
        // And also make sure to push let me know when you pushed then you can pull
        // Ive added some few more features
        //

    }

}
