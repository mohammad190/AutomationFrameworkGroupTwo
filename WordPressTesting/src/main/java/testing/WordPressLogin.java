package testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WordPressLogin {

    @FindBy(id = "user_login")
    WebElement Username_Box;

    @FindBy(id = "user_pass")
    WebElement Password_Box;

    @FindBy(id = "wp-submit")
    WebElement Login_Button;

    public void logIn(String username, String password) throws InterruptedException {
        Username_Box.sendKeys(username);
        Password_Box.sendKeys(password);
        Login_Button.click();
        Thread.sleep(5000);
    }
}
