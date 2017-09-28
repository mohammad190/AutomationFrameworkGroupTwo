package home;

import PersonalTab.BankingList.*;
import PersonalTab.CommonApplicantForm;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestingBankingFunctionalities extends CommonAPI {

    public void Test_Checking() throws InterruptedException {
        Banking banking = PageFactory.initElements(driver, Banking.class);
        Checking checking = PageFactory.initElements(driver, Checking.class);
        CommonApplicantForm commonApplicantForm = PageFactory.initElements(driver, CommonApplicantForm.class);
        banking.Checking();
        checking.Core_Checking("Regular");
        commonApplicantForm.Enter_Applicant_Information("Ibrahim", "Khan", "Vietor Ave", "Elmhurst", "1234567890", "ik@live.se", "ik@live.se", "Yes", "01214140000", "Yes", "01011994");
    }

    public void Test_Savings() throws InterruptedException {
        Banking banking = PageFactory.initElements(driver, Banking.class);
        Savings savings = PageFactory.initElements(driver, Savings.class);
        banking.Savings();
        savings.Core_Checking("Rewards");
    }

    public void Test_CDs() throws InterruptedException {
        Banking banking = PageFactory.initElements(driver, Banking.class);
        CDs cDs = PageFactory.initElements(driver, CDs.class);
        banking.CDs();
        cDs.Featured_CD_Account("NO");
    }

    public void Test_Business_Checking() throws InterruptedException {
        Banking banking = PageFactory.initElements(driver, Banking.class);
        BusinessChecking businessChecking = PageFactory.initElements(driver, BusinessChecking.class);
        banking.Business_Checking();
        businessChecking.Business_Fundamentals_Checking_Select_All_Check_Box();
    }

    public void Test_Student_Banking() throws InterruptedException {
        Banking banking = PageFactory.initElements(driver, Banking.class);
        StudentBanking studentBanking = PageFactory.initElements(driver, StudentBanking.class);
        banking.Student_Banking();
        studentBanking.Find_Location("11373");
    }

    public void Test_Online_Banking() throws InterruptedException {
        Banking banking = PageFactory.initElements(driver, Banking.class);
        OnlineBanking onlineBanking = PageFactory.initElements(driver, OnlineBanking.class);
        banking.Online_Banking();
        onlineBanking.Forgot_Passcode_Continue("", "", "");
        onlineBanking.Forgot_Passcode_Cancel("", "", "");
    }

    @Test
    public void Test_Mobile_Banking() throws InterruptedException,IOException {
        Banking banking = PageFactory.initElements(driver, Banking.class);
        MobileBanking mobileBanking = PageFactory.initElements(driver, MobileBanking.class);
        banking.Mobile_Banking();
        /*
            Choose From: iPhone, iPad, Android, Windows 10, Other
         */
        mobileBanking.Get_The_App("iPhone");
    }
}
