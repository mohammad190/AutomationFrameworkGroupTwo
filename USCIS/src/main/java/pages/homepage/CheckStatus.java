package pages.homepage;

import base.CommonAPI;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckStatus extends CommonAPI {

    @FindBy(xpath = "//h2[contains(text(),'Check your Case Status')]")
    WebElement Check_Case_Status_Link;

    @FindBy(id = "receipt_number")
    WebElement Receipt_Number_Box;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement Check_Status_Button;

    public void Check_Case_Status(String filePath, int sheetNumber) throws Exception {
        SearchReceiptNumber searchReceiptNumber = new SearchReceiptNumber();
        String[] value = searchReceiptNumber.getDataFromExcelFile(filePath, sheetNumber);

        Check_Case_Status_Link.click();

        for(int i = 1; i < value.length; i++) {
            Thread.sleep(1000);
            Receipt_Number_Box.sendKeys(value[i]);
            test.log(LogStatus.INFO, "Reading From Excel File.");
            Check_Status_Button.click();
            test.log(LogStatus.INFO, "Clicking On Check Status Button.");
            driver.navigate().back();
            test.log(LogStatus.INFO, "Navigating Back To Previous Site.");
            Receipt_Number_Box.clear();
            test.log(LogStatus.INFO, "Clearing Receipt Number Field.");
            test.log(LogStatus.PASS, "Verified Case Status Check.");
        }
    }
}
