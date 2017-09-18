package WellsFargo_BankFeatures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Commercial extends CommonAPI {

    @FindBy(how = How.ID,using = "tabNavCommercial")
    public static WebElement Commercial;

    @FindBy(how = How.LINK_TEXT,using = "International Offices")
    public static WebElement International_office;

    @FindBy(how = How.LINK_TEXT,using = "Get Report")
    public static WebElement Get_report;

    @FindBy(how = How.LINK_TEXT,using = "Home")
    public static WebElement HomeButton;

    @FindBy(how = How.PARTIAL_LINK_TEXT,using = "Managing Payments")
    public static WebElement Managing_payments;

    @FindBy(how = How.LINK_TEXT,using = "Financing & Trade")
    public static WebElement Financing_trade;

    @FindBy(how = How.PARTIAL_LINK_TEXT,using = "Economic Reports")
    public static WebElement Economic_report;

    public void Commercial_1() throws InterruptedException {
        Commercial.click();
        International_office.click();
        Get_report.click();
        HomeButton.click();
        Managing_payments.click();
        Financing_trade.click();
        Economic_report.click();
        Thread.sleep(3000);

    }

}
