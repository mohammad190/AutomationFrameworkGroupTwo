package PersonalTab.LoansList;

import PersonalTab.ActionsClass;
import PersonalTab.MouseScroll;
import PersonalTab.WaitForElement;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loans extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='hp-section-2']/form/ul/li[3]/a")
    WebElement List_Loans_Button;

    @FindBy(how = How.NAME, using = "mortgage")
    WebElement List_Loans_Mortgage;

    @FindBy(how = How.NAME, using = "refinance")
    WebElement List_Loans_Refinance;

    @FindBy(how = How.NAME, using = "home_equity")
    WebElement List_Loans_Home_Equity;

    @FindBy(how = How.NAME, using = "auto_loans")
    WebElement List_Loans_Auto_Loans;

    @FindBy(how = How.NAME, using = "business_loans")
    WebElement List_Loans_Business_Loans;

    @FindBy(how = How.NAME, using = "l2_loans_find_a_home")
    WebElement List_Loans_Find_A_Home;

    public void Loans_Button() {
        WebElement element = List_Loans_Button;
        ActionsClass.action.moveToElement(element).perform();
    }

    public void Mortgage() {
        Loans_Button();
        waitUntilClickable(List_Loans_Mortgage);
        List_Loans_Mortgage.click();
    }

    public void Refinance() {
        Loans_Button();
        waitUntilClickable(List_Loans_Refinance);
        List_Loans_Refinance.click();
    }

    public void Home_Equity() {
        Loans_Button();
        waitUntilClickable(List_Loans_Home_Equity);
        List_Loans_Home_Equity.click();
    }

    public void Auto_Loans() {
        Loans_Button();
        waitUntilClickable(List_Loans_Auto_Loans);
        List_Loans_Auto_Loans.click();
    }

    public void Business_Loans() {
        Loans_Button();
        waitUntilClickable(List_Loans_Business_Loans);
        List_Loans_Business_Loans.click();
    }

    public void Find_A_Home() {
        Loans_Button();
        waitUntilClickable(List_Loans_Find_A_Home);
        List_Loans_Find_A_Home.click();
    }
}
