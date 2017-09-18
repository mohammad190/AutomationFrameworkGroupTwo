package home;

import PersonalTab.CommonApplicantForm;
import PersonalTab.LoansList.HomeEquity;
import PersonalTab.LoansList.Loans;
import PersonalTab.LoansList.Mortgage;
import PersonalTab.LoansList.Refinance;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestingLoanFunctionalities extends CommonAPI {

    @Test
    public void Test_Mortgage() throws InterruptedException {
        Loans loans = PageFactory.initElements(driver, Loans.class);
        Mortgage mortgage = PageFactory.initElements(driver, Mortgage.class);
        loans.Mortgage();
        mortgage.Mortgage_Calculator("65000", "11373");
    }

    public void Test_Refinance() throws InterruptedException {
        CommonApplicantForm commonApplicantForm = PageFactory.initElements(driver, CommonApplicantForm.class);
        Loans loans = PageFactory.initElements(driver, Loans.class);
        Refinance refinance = PageFactory.initElements(driver, Refinance.class);
        loans.Refinance();
        refinance.Getting_Pre_Qualified_Continue(1);
        commonApplicantForm.Enter_Applicant_Information("Testing", "123", "", "", "", "", "", "", "", "", "");
    }

    public void Test_Home_Equity() throws InterruptedException {
        Loans loans = PageFactory.initElements(driver, Loans.class);
        HomeEquity homeEquity = PageFactory.initElements(driver, HomeEquity.class);
        loans.Home_Equity();
        homeEquity.Make_An_Appointment(1, "Person", "11373");
        //homeEquity.Choose_Phone_Or_Person("Person", "11373");
    }
}
