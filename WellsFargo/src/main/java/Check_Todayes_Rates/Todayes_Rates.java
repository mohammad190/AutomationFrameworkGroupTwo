package Check_Todayes_Rates;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Todayes_Rates extends CommonAPI {

    @FindBy(how = How.ID,using = "taskbar")
    WebElement go_Taskbar;

    @FindBy(how = How.XPATH, using = ".//div[@aria-controls='checkTodaysRates']")
    WebElement Go_Todayes_Rates;


    //@FindBy(how = How.XPATH,using = "")

    @FindBy(how = How.ID, using = "check_rates_dropdown")
    WebElement Click_Todayes_Rates_Box;

    @FindBy(how = How.ID, using = "check_rates_dropdown")
    WebElement Click_Go;

    public void DropDownFeatures() throws InterruptedException {
        go_Taskbar.click();
        Thread.sleep(300);

        //Select select = new Select(Click_Todayes_Rates_Box);

        Go_Todayes_Rates.click();
        Thread.sleep(300);


        Select select = new Select(Click_Go);

        Click_Go.click();

        select.selectByValue("Mortgage");
        Thread.sleep(300);

        select.selectByValue("Home Equity");
        Thread.sleep(3000);

        select.selectByValue("CDs");
        Thread.sleep(300);

        select.selectByValue("Credit Card");
        Thread.sleep(300);

        select.selectByValue("Auto Loans");
        Thread.sleep(300);

        select.selectByValue("Student Loans");
        Thread.sleep(300);

        select.selectByValue("Personal Loans");
        Thread.sleep(300);







    }
}
