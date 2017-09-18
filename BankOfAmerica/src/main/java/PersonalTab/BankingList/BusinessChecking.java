package PersonalTab.BankingList;

import PersonalTab.CommonApplicantForm;
import PersonalTab.MouseScroll;
import PersonalTab.WaitForElement;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.LinkedList;
import java.util.List;

public class BusinessChecking extends CommonAPI {

    CommonApplicantForm commonApplicantForm = new CommonApplicantForm();

    @FindBy(how = How.ID, using = "learn-more-business-fundamentals")
    WebElement Learn_More_Business_Fundamentals_Box;

    @FindBy(how = How.ID, using = "learn-more-business-advantage")
    WebElement Learn_More_Business_Advantage_Box;

    @FindBy(how = How.ID, using = "apply-business-fundamentals")
    WebElement Apply_Now_Business_Fundamentals_Box;

    @FindBy(how = How.ID, using = "apply-business-advantage-checking")
    WebElement Apply_Now_Business_Advantage_Box;

    @FindBy(how = How.ID, using = "cb1")
    WebElement First_Check_Box;

    @FindBy(how = How.ID, using = "cb2")
    WebElement Second_Check_Box;

    @FindBy(how = How.ID, using = "cb3")
    WebElement Third_Check_Box;

    @FindBy(how = How.ID, using = "cb4")
    WebElement Fourth_Check_Box;

    @FindBy(how = How.ID, using = "cb5")
    WebElement Fifth_Check_Box;

    @FindBy(how = How.ID, using = "go-to-application")
    WebElement Go_To_Application_Button;

    private void If_Statement_Check_Box(int CheckBoxOnetoFive) {

        if(CheckBoxOnetoFive == 1) {
            First_Check_Box.click();
            MouseScroll.mouseScroll(0, 600);
            WaitForElement.waitForElement(Go_To_Application_Button).click();
        } else if (CheckBoxOnetoFive == 2) {
            Second_Check_Box.click();
            MouseScroll.mouseScroll(0, 600);
            WaitForElement.waitForElement(Go_To_Application_Button).click();
        } else if (CheckBoxOnetoFive == 3) {
            Third_Check_Box.click();
            MouseScroll.mouseScroll(0, 600);
            WaitForElement.waitForElement(Go_To_Application_Button).click();
        } else if (CheckBoxOnetoFive == 4) {
            Fourth_Check_Box.click();
            MouseScroll.mouseScroll(0, 600);
            WaitForElement.waitForElement(Go_To_Application_Button).click();
        } else if (CheckBoxOnetoFive == 5) {
            Fifth_Check_Box.click();
            MouseScroll.mouseScroll(0, 600);
            WaitForElement.waitForElement(Go_To_Application_Button).click();
        } else {
            System.err.println("ERROR: Please Choose 1 - 5");
        }
    }

    private void Select_All_In_List() throws InterruptedException {
        List<WebElement> elements = new LinkedList<>();
        elements.add(First_Check_Box);
        elements.add(Second_Check_Box);
        elements.add(Third_Check_Box);
        elements.add(Fourth_Check_Box);
        elements.add(Fifth_Check_Box);

        for(WebElement element : elements) {
            element.click();
            Thread.sleep(600);
        }
        Go_To_Application_Button.click();
        Thread.sleep(10000);
    }

    public void Business_Fundamentals_Checking_Select_One_Check_Box(int CheckBoxOnetoFive) throws InterruptedException {
        Learn_More_Business_Fundamentals_Box.click();
        Apply_Now_Business_Fundamentals_Box.click();
        If_Statement_Check_Box(CheckBoxOnetoFive);
    }

    public void Business_Fundamentals_Checking_Select_All_Check_Box() throws InterruptedException {
        Thread.sleep(2000);
        Learn_More_Business_Fundamentals_Box.click();
        Apply_Now_Business_Fundamentals_Box.click();
        Select_All_In_List();
    }

    public void Business_Advantage_Checking(int CheckBoxOnetoFive) throws InterruptedException {
        Thread.sleep(2000);
        Learn_More_Business_Advantage_Box.click();
        Apply_Now_Business_Advantage_Box.click();
        If_Statement_Check_Box(CheckBoxOnetoFive);
    }
}
