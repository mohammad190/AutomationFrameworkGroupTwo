package Check_Box;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Atm_Loaction_check_Box extends CommonAPI {
    @FindBy(how = How.LINK_TEXT, using = "ATMs/Locations")
    WebElement Go_ATM_Loacation;

    @FindBy(how = How.ID, using = "bankOnly")
    WebElement Bank_Only;

    @FindBy(how = How.ID, using = "withinLocation")
    WebElement within_Location;

    @FindBy(how = How.ID,using = "openSaturday")
    WebElement open_Saturday;

    @FindBy(how = How.ID, using = "bankDriveUp")
    WebElement bank_Drive_Up;

    @FindBy(how = How.ID, using = "ATMDriveUp")
    WebElement ATM_DriveUp;

    @FindBy(how = How.ID, using = "allHours")
    WebElement all_Hours;

    @FindBy(how = How.ID, using = "safeDepositBoxes")
    WebElement safe_Deposit_Boxes;

    @FindBy(how = How.ID, using = "acceptsAppointments")
    WebElement accepts_Appointments;

    @FindBy(how = How.ID, using = "notary")
    WebElement notary;

    @FindBy(how = How.ID, using = "foreignExchange")
    WebElement foreign_Exchange;

    @FindBy(how = How.ID, using = "sellsStamps")
    WebElement sells_Stamps;

    public void Check_Box_Option()throws InterruptedException{
        Go_ATM_Loacation.click();
        Thread.sleep(1000);
        Bank_Only.click();
        Thread.sleep(1000);
        within_Location.click();
        Thread.sleep(1000);
        open_Saturday.click();
        Thread.sleep(10000);
        bank_Drive_Up.click();
        Thread.sleep(1000);
        ATM_DriveUp.click();
        Thread.sleep(1000);
        all_Hours.click();
        Thread.sleep(1000);
        safe_Deposit_Boxes.click();
        Thread.sleep(1000);
        accepts_Appointments.click();
        Thread.sleep(1000);
        notary.click();
        Thread.sleep(1000);
        foreign_Exchange.click();
        Thread.sleep(1000);
        sells_Stamps.click();
        Thread.sleep(1000);
    }

}