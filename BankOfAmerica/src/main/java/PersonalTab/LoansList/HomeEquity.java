package PersonalTab.LoansList;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeEquity extends CommonAPI {

    @FindBy(id = "schedule_an_appointment_engagment")
    WebElement Schedule_An_Appointment_Link;

    @FindBy(xpath = ".//*[@id='EngagementHomeLoans']/div/div[3]/div[1]/div[3]")
    WebElement Talk_To_A_Lending_Specialist_Link;

    @FindBy(xpath = ".//input[@value='A5100']")
    WebElement Use_Home_Equity_Check_Box;

    @FindBy(id = "secondTopicID[0]")
    WebElement Use_Home_Equity_Check_Box_Two;

    @FindBy(xpath = ".//input[@value='A5200']")
    WebElement Buy_A_Home_Check_Box;

    @FindBy(id = "secondTopicID[1]")
    WebElement Buy_A_Home_Check_Box_Two;

    @FindBy(xpath = ".//input[@value='A5300']")
    WebElement Refinance_Check_Box;

    @FindBy(id = "secondTopicID[2]")
    WebElement Refinance_Check_Box_Two;

    @FindBy(xpath = ".//*[@id='nextBtnSubTopics']/span[2]")
    WebElement Next_Button;

    @FindBy(xpath = ".//div[@class='meeting-tile in-person-tile']")
    WebElement In_Person_Option;

    @FindBy(xpath = ".//div[@class='meeting-tile by-phone-tile mlt-30']")
    WebElement By_Phone_Option;

    @FindBy(id = "findLocTextBox")
    WebElement In_Person_Enter_Zip_Or_City_Box;

    @FindBy(id = "findLink")
    WebElement In_Person_Find_Locations_Button;

    @FindBy(id = "txtFindLoc")
    WebElement By_Phone_Enter_Zip_Code_Box;

    @FindBy(id = "ancSearchLoc")
    WebElement By_Phone_Continue_Button;

    private void If_Statement_Check_Box(int CheckBoxOnetoThree) {

            if (CheckBoxOnetoThree == 1) {
                Use_Home_Equity_Check_Box_Two.click();
                waitUntilClickable(Next_Button);
                Next_Button.click();
            } else if (CheckBoxOnetoThree == 2) {
                Buy_A_Home_Check_Box_Two.click();
                waitUntilClickable(Next_Button);
                Next_Button.click();
            } else if (CheckBoxOnetoThree == 3) {
                Refinance_Check_Box_Two.click();
                waitUntilClickable(Next_Button);
                Next_Button.click();
            } else {
                System.err.println("ERROR: Please Choose 1 - 3");
            }
        }

    public void Choose_Phone_Or_Person(String PersonorPhone, String ZIPorCity) {
        if(PersonorPhone.equalsIgnoreCase("Person")) {
            waitUntilClickable(In_Person_Option);
            In_Person_Option.click();
            In_Person_Enter_Zip_Or_City_Box.sendKeys(ZIPorCity);
            In_Person_Find_Locations_Button.click();
        } else if (PersonorPhone.equalsIgnoreCase("Phone")) {
            waitUntilClickable(By_Phone_Option);
            By_Phone_Option.click();
            By_Phone_Enter_Zip_Code_Box.sendKeys(ZIPorCity);
            By_Phone_Continue_Button.click();
        }
    }

    public void Make_An_Appointment(int CheckBoxOnetoThree, String PersonorPhone, String ZIPorCity) {
        waitUntilClickable(Talk_To_A_Lending_Specialist_Link);
        Talk_To_A_Lending_Specialist_Link.click();
        waitUntilClickable(Schedule_An_Appointment_Link);
        Schedule_An_Appointment_Link.click();
        If_Statement_Check_Box(CheckBoxOnetoThree);
        Choose_Phone_Or_Person(PersonorPhone, ZIPorCity);
    }
}
