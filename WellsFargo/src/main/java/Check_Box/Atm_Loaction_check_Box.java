package Check_Box;

import base.CommonAPI;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

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

    public void Check_Box_Option() throws InterruptedException, IOException {

        Go_ATM_Loacation.click();
        waitUntilClickable(Go_ATM_Loacation);
        Bank_Only.click();
        waitUntilClickable(Bank_Only);
        within_Location.click();
        waitUntilClickable(within_Location);
        open_Saturday.click();
        waitUntilClickable(open_Saturday);
        bank_Drive_Up.click();
        waitUntilClickable(bank_Drive_Up);
        ATM_DriveUp.click();
        waitUntilClickable(ATM_DriveUp);
        all_Hours.click();
        waitUntilClickable(all_Hours);
        safe_Deposit_Boxes.click();
        waitUntilClickable(safe_Deposit_Boxes);
        accepts_Appointments.click();
        waitUntilClickable(accepts_Appointments);
        notary.click();
        waitUntilClickable(notary);
        foreign_Exchange.click();
        waitUntilClickable(foreign_Exchange);
        sells_Stamps.click();
        waitUntilClickable(sells_Stamps);

        takeScreenShot(driver, "AfterCaseStatus", "C:\\Users\\sujon\\IdeaProjects\\AutomationFrameworkGroupTwo\\WellsFargo\\screenshots\\");
        test.log(LogStatus.PASS, "Verified check box ");

    }
}