package PersonalTab.LoansList;

import PersonalTab.MouseScroll;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.LinkedList;
import java.util.List;

public class AutoLoans extends CommonAPI {

    @FindBy(id = "currencyInputField")
    WebElement Loan_Amount_Box;

    @FindBy(id = "dropdown-loan")
    WebElement Loan_Type_Drop_Down;

    @FindBy(xpath = ".//*[@id='dropdown-loan']/option[1]")
    WebElement New_Car_Dealer_Option;

    @FindBy(xpath = ".//*[@id='dropdown-loan']/option[2]")
    WebElement Used_Car_Dealer_Option;

    @FindBy(xpath = ".//*[@id='dropdown-loan']/option[3]")
    WebElement Refinance_Option;

    @FindBy(xpath = ".//*[@id='dropdown-loan']/option[4]")
    WebElement Buy_Out_Your_Lease_Option;

    @FindBy(xpath = ".//*[@id='dropdown-loan']/option[5]")
    WebElement Private_Party_Option;

    @FindBy(id = "calculate")
    WebElement Calculate_Button;

    public void Estimate_Montly_Car_Payment(String LoanAmount) {

        List<WebElement> elements = new LinkedList<>();
        elements.add(New_Car_Dealer_Option);
        elements.add(Used_Car_Dealer_Option);
        elements.add(Refinance_Option);
        elements.add(Buy_Out_Your_Lease_Option);
        elements.add(Private_Party_Option);

        MouseScroll.mouseScroll(0, 500);

        Loan_Amount_Box.clear();
        Loan_Amount_Box.sendKeys(LoanAmount);

        for(WebElement els : elements) {
                Loan_Type_Drop_Down.click();
                els.click();
                Calculate_Button.click();
        }

    }
}
