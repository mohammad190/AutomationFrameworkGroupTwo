package testing;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.DataReader;

public class WordPressLogin extends CommonAPI {

    DataReader dr = new DataReader();

    @FindBy(id = "user_login")
    WebElement Username_Box;

    @FindBy(id = "user_pass")
    WebElement Password_Box;

    @FindBy(id = "wp-submit")
    WebElement Login_Button;

    @FindBy(css = "#twotabsearchtextbox")
    WebElement Search_Box;

    @FindBy(css = ".nav-input")
    WebElement search_Button;

    public void logIn(String username, String password) throws InterruptedException {
        Username_Box.sendKeys(username);
        Password_Box.sendKeys(password);
        Login_Button.click();
        Thread.sleep(5000);
    }

    public void searchItem(String item) {
        Search_Box.sendKeys(item);
        search_Button.click();
    }

    public String[] getDataFromExcel() throws Exception {
        String path = "C:\\Users\\Local Account\\IdeaProjects\\PNTAutomationGroupTwo\\WordPressTesting\\src\\test\\resources\\LoginCredentials.xlsx";
        String[] st = dr.fileReader(path);
        return st;
    }

    public void getDataFromExcelFileAndSearch() throws Exception {
        String[] data = getDataFromExcel();

        for(int i = 1; i < data.length; i++) {
            searchItem(data[i]);
            Thread.sleep(6000);
            Search_Box.clear();
        }
    }
}
