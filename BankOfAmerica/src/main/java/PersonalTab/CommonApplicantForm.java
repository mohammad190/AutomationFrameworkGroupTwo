package PersonalTab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class CommonApplicantForm {

    /*
        Main Applicant
     */

    @FindBy(xpath = ".//input[@name='zz_name_tb_fnm']")
    WebElement First_Name_Box;

    @FindBy(id = ".//input[@name='zz_name_tb_lnm']")
    WebElement Last_Name_Box;

    @FindBy(id = "zz_addr_tb_line1_v_1-label")
    WebElement Address_Box;

    @FindBy(id = "zz_addr_tb_city_v_1-label")
    WebElement City_Box;

    @FindBy(id = "zz_phn_tb_ppno_v_1-label")
    WebElement Phone_Number_Box;

    @FindBy(id = "zz_phn_lb_ppnotp_v_1")
    WebElement Phone_Number_Drop_Down;

    @FindBy(id = "zz_email_tb_addr_v_1-label")
    WebElement Email_Box;

    @FindBy(id = "zz_email_tb_readdr_v_1-label")
    WebElement Re_Email_Box;

    @FindBy(id = "zz_citz_lb_uscit_yes_v_1-real")
    WebElement Us_Citizen_Yes;

    @FindBy(id = "zz_citz_lb_uscit_no_v_1-real")
    WebElement Us_Citizen_No;

    @FindBy(id = "zz_citz_tb_ssn_v_1-label")
    WebElement Us_Citizen_Social_Security_Box;

    @FindBy(id = "zz_citz_lb_dualcit_yes_v_1-real")
    WebElement Us_Dual_Citizen_Yes;

    @FindBy(id = "zz_citz_lb_dualcit_no_v_1-real")
    WebElement Us_Dual_Citizen_No;

    @FindBy(id = "zz_citz_lb_dualcitzcntry_v_1")
    WebElement Us_Country_Of_Dual_Citizenship_Drop_Down;

    @FindBy(id = "zz_addr_lb_rescty_v_1")
    WebElement Us_Country_Of_Residence_Drop_Down;

    @FindBy(id = "zz_citz_tb_dob_v_1-label")
    WebElement Date_Of_Birth_Box;

    @FindBy(id = "zz_emp_lb_srcinc_v_1")
    WebElement Source_Of_Income_Drop_Down;

    /*
        Co-Applicant
     */

    @FindBy(name = "zz_add_coApp")
    WebElement Co_Applicant_Check_Box;

    @FindBy(name = "zz_name_tb_fnm")
    WebElement Co_Applicant_First_Name_Box;

    @FindBy(name = "zz_name_tb_lnm")
    WebElement Co_Applicant_Last_Name_Box;

    @FindBy(name = "zz_phn_tb_ppno")
    WebElement Co_Applicant_Phone_Number_Box;

    @FindBy(name = "zz_phn_lb_ppnotp")
    WebElement Co_Applicant_Phone_Number_Drop_Down;

    @FindBy(name = "zz_email_tb_addr")
    WebElement Co_Applicant_Email_Box;

    @FindBy(name = "zz_email_tb_readdr")
    WebElement Co_Applicant_Re_Email_Box;

    @FindBy(name = "zz_citz_lb_uscit")
    WebElement Co_Applicant_Citizen_Yes;

    @FindBy(name = "zz_citz_lb_uscit")
    WebElement Co_Application_Citizen_No;

    @FindBy(name = "lAAUpg1-label")
    WebElement Co_Applicant_Social_Security_Box;

    @FindBy(name = "tZ6Zeg1-real")
    WebElement Co_Applicant_Dual_Citizen_Yes;

    @FindBy(name = "tZ6Zfg1-real")
    WebElement Co_Application_Dual_Citizen_No;

    @FindBy(name = "lAAUbg1")
    WebElement Co_Applicant_Dual_Citizen_Drop_Down;

    @FindBy(name = "lAAU7g1")
    WebElement Co_Applicant_Country_Of_Residence_Drop_Down;

    @FindBy(name = "lAAU3g1-label")
    WebElement Co_Applicant_Date_Of_Birth_Box;

    @FindBy(name = "lAAUc92")
    WebElement Co_Applicant_Source_Of_Income_Drop_Down;

    @FindBy(name = "tZ6Zj1")
    WebElement Continue_Box;

    public void Enter_Applicant_Information(String firstName, String lastName, String address, String city, String phoneNum, String email, String reEmail, String USCitizenYESorNO, String SSN, String DualCitizenYESorNO, String DOB) throws InterruptedException {

        Select phoneType = new Select(Phone_Number_Drop_Down);
        Select dualDropDown = new Select(Us_Country_Of_Dual_Citizenship_Drop_Down);
        Select dualDropDownTwo = new Select(Us_Country_Of_Residence_Drop_Down);
        Select sourceOfIncome = new Select(Source_Of_Income_Drop_Down);

        First_Name_Box.sendKeys(firstName);
        Last_Name_Box.sendKeys(lastName);
        Address_Box.sendKeys(address);
        City_Box.sendKeys(city);
        Phone_Number_Box.sendKeys(phoneNum);
        phoneType.selectByIndex(1);
        Email_Box.sendKeys(email);
        Re_Email_Box.sendKeys(reEmail);

        if (USCitizenYESorNO.equalsIgnoreCase("Yes")) {
            Us_Citizen_Yes.click();
            Us_Citizen_Social_Security_Box.sendKeys(SSN);
        } else if (USCitizenYESorNO.equalsIgnoreCase("No")) {
            Us_Citizen_No.click();
        } else {
            System.err.println("ERROR: Please Say Yes Or No.");
        }

        if (DualCitizenYESorNO.equalsIgnoreCase("Yes")) {
            Us_Dual_Citizen_Yes.click();
            dualDropDown.selectByVisibleText("Sweden");
            dualDropDownTwo.selectByVisibleText("United States");
        } else if (DualCitizenYESorNO.equalsIgnoreCase("No")) {
            Us_Dual_Citizen_No.click();
        } else {
            System.err.println("ERROR: Please Say Yes Or No.");
        }

        Date_Of_Birth_Box.sendKeys(DOB);
        sourceOfIncome.selectByIndex(3);
        Continue_Box.click();

    }

    public void Enter_Co_Applicant_Information(String firstName, String lastName, String phoneNum, String email, String reEmail, String USCitizenYESorNO, String SSN, String DualCitizenYESorNO, String DOB) {

        Select phoneType = new Select(Co_Applicant_Phone_Number_Drop_Down);
        Select dualDropDown = new Select(Co_Applicant_Dual_Citizen_Drop_Down);
        Select dualDropDownTwo = new Select(Co_Applicant_Country_Of_Residence_Drop_Down);
        Select sourceOfIncome = new Select(Co_Applicant_Source_Of_Income_Drop_Down);

        Co_Applicant_Check_Box.click();
        Co_Applicant_First_Name_Box.sendKeys(firstName);
        Co_Applicant_Last_Name_Box.sendKeys(lastName);
        Co_Applicant_Phone_Number_Box.sendKeys(phoneNum);
        phoneType.selectByIndex(1);
        Co_Applicant_Email_Box.sendKeys(email);
        Co_Applicant_Re_Email_Box.sendKeys(reEmail);

        if (USCitizenYESorNO.equalsIgnoreCase("Yes")) {
            Co_Applicant_Citizen_Yes.click();
            Co_Applicant_Social_Security_Box.sendKeys(SSN);
        } else if (USCitizenYESorNO.equalsIgnoreCase("No")) {
            Co_Application_Citizen_No.click();
        } else {
            System.err.println("ERROR: Please Say Yes Or No.");
        }

        if (DualCitizenYESorNO.equalsIgnoreCase("Yes")) {
            Co_Applicant_Dual_Citizen_Yes.click();
            dualDropDown.selectByVisibleText("Sweden");
            dualDropDownTwo.selectByVisibleText("United States");
        } else if (DualCitizenYESorNO.equalsIgnoreCase("No")) {
            Co_Application_Dual_Citizen_No.click();
            dualDropDownTwo.selectByVisibleText("United States");
        } else {
            System.err.println("ERROR: Please Say Yes Or No.");
        }

        Co_Applicant_Date_Of_Birth_Box.sendKeys(DOB);
        sourceOfIncome.selectByIndex(3);
        Continue_Box.click();

    }
}
