package PersonalTab.CreditCardsList;

import PersonalTab.MouseScroll;
import PersonalTab.WaitForElement;
import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.LinkedList;
import java.util.List;

public class FeaturedCreditCards extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='all-cards-tab']")
    WebElement View_All_Cards_Button;

    @FindBy(how = How.ID, using = "filter-cards")
    WebElement Filter_Cards_Button;

    @FindBy(how = How.ID, using = "noAnnualFee")
    WebElement Filter_Cards_No_Annual_Fee_Check_Box;

    @FindBy(how = How.ID, using = "zeroAprBalance")
    WebElement Filter_Cards_Low_Intro_APR_Balance_Transfer_Check_Box;

    @FindBy(how = How.ID, using = "noForeignTransactionFee")
    WebElement Filter_Cards_No_Foreign_Transaction_Check_Box;

    @FindBy(how = How.ID, using = "zeroAprPurchase")
    WebElement Filter_Cards_Low_Intro_APR_Purchases_Check_Box;

    @FindBy(how = How.ID, using = "preferredRewards")
    WebElement Filter_Cards_Preferred_Rewards_Check_Box;

    @FindBy(how = How.ID, using = "visa")
    WebElement Filter_Cards_Visa_Check_Box;

    @FindBy(how = How.ID, using = "masterCard")
    WebElement Filter_Cards_Master_Card_Check_Box;

    @FindBy(how = How.ID, using = "searchCards")
    WebElement Filter_Cards_View_Cards_Button;

    private void Filter_Options() throws InterruptedException {
        MouseScroll.mouseScroll(0, -250);
        waitUntilClickable(View_All_Cards_Button);
        View_All_Cards_Button.click();
        waitUntilClickable(Filter_Cards_Button);
        Filter_Cards_Button.click();
        Thread.sleep(10000);
    }

    private void If_Else_Statement(String AnnualFee, String BalanceTransfers, String ForeignTransaction, String APRPurchases, String PrefRewards, String CardType) throws InterruptedException {

        if(AnnualFee.equalsIgnoreCase("Yes")) {
            Filter_Cards_No_Annual_Fee_Check_Box.click();
        } else if (AnnualFee.equalsIgnoreCase("No")){
            System.out.println("Reminder: Annual Fee Not Checked.");
        } else {
            System.err.println("ERROR: Please Answer With Yes/No.");
        }


        if (BalanceTransfers.equalsIgnoreCase("Yes")) {
            Filter_Cards_Low_Intro_APR_Balance_Transfer_Check_Box.click();
        } else if (BalanceTransfers.equalsIgnoreCase("No")) {
            System.out.println("Reminder: APR Balance Transfers Not Checked.");
        } else {
            System.err.println("ERROR: Please Answer With Yes/No.");
        }


        if (ForeignTransaction.equalsIgnoreCase("Yes")) {
            Filter_Cards_No_Foreign_Transaction_Check_Box.click();
        } else if (BalanceTransfers.equalsIgnoreCase("No")) {
            System.out.println("Reminder: Foreign Transfers Not Checked.");
        } else {
            System.err.println("ERROR: Please Answer With Yes/No.");
        }


        if (APRPurchases.equalsIgnoreCase("Yes")) {
            Filter_Cards_Low_Intro_APR_Purchases_Check_Box.click();
        } else if (APRPurchases.equalsIgnoreCase("No")) {
            System.out.println("Reminder: APR Purchases Not Checked.");
        } else {
            System.err.println("ERROR: Please Answer With Yes/No.");
        }


        if (PrefRewards.equalsIgnoreCase("Yes")) {
            Filter_Cards_Preferred_Rewards_Check_Box.click();
        } else if (PrefRewards.equalsIgnoreCase("No")) {
            System.out.println("Reminder: Preferred Rewards Not Checked.");
        } else {
            System.err.println("ERROR: Please Answer With Yes/No.");
        }


        if (CardType.equalsIgnoreCase("Visa")) {
            Filter_Cards_Visa_Check_Box.click();
        } else if (BalanceTransfers.equalsIgnoreCase("MasterCard")) {
            Filter_Cards_Master_Card_Check_Box.click();
        } else {
            System.err.println("ERROR: Please Answer With Visa/MasterCard.");
        }

    }

    public void Filter_Cards_Select_All() throws InterruptedException {
        List<WebElement> elements = new LinkedList<>();
        elements.add(Filter_Cards_No_Annual_Fee_Check_Box);
        elements.add(Filter_Cards_Low_Intro_APR_Balance_Transfer_Check_Box);
        elements.add(Filter_Cards_No_Foreign_Transaction_Check_Box);
        elements.add(Filter_Cards_Low_Intro_APR_Purchases_Check_Box);
        elements.add(Filter_Cards_Preferred_Rewards_Check_Box);
        elements.add(Filter_Cards_Visa_Check_Box);
        elements.add(Filter_Cards_View_Cards_Button);
        Filter_Options();
       for(WebElement els : elements) {
           els.click();
           Thread.sleep(1000);
       }

       /*
       boolean isChecked = false;
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
        int size = radioButtons.size();

        for(int i = 0; i < size; i++) {
            isChecked = radioButtons.get(i).isSelected();

            if(!isChecked) {
                radioButtons.get(i).click();
                Thread.sleep(2000);
            }
        }
        */
    }

    public void Filter_Cards_Choose_Options(String AnnualFee, String BalanceTransfers, String ForeignTransaction, String APRPurchases, String PrefRewards, String CardType) throws InterruptedException {
        Filter_Options();
        If_Else_Statement(AnnualFee, BalanceTransfers, ForeignTransaction, APRPurchases, PrefRewards, CardType);
        Filter_Cards_View_Cards_Button.click();
        Thread.sleep(4000);
    }
}
