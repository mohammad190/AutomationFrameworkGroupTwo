package WellsFargo_BankFeatures;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Search_Option extends CommonAPI {

    @FindBy(how = How.XPATH,using = ".//input[@name='q']")
    public static WebElement Search_Box;


    @FindBy(how = How.NAME,using = "btnG")
    public static WebElement Search_button;

    public static void search_Features(String BaranchName, String BranchLocation)throws InterruptedException{
        Search_Box.sendKeys(BaranchName,BranchLocation);
        Search_button.click();
        Thread.sleep(3000);
    }
}
