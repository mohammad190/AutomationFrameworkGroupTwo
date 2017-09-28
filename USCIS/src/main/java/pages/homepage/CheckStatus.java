package pages.homepage;

import base.CommonAPI;
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
            Thread.sleep(1000);
            Check_Status_Button.click();
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            Receipt_Number_Box.clear();
        }

        takeScreenShot("AfterCaseStatus", "/Users/ibrahimkhan/IdeaProjects/AutomationFrameworkGroupTwo/USCIS/screenshots/");

    }
}
