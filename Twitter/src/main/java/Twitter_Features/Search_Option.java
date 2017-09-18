package Twitter_Features;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Search_Option extends CommonAPI {

    @FindBy(how = How.XPATH,using = ".//*[@id='doc']/div[1]/div/div[2]/div/div[1]")
    public static WebElement Search;

    @FindBy(how = How.ID,using = "search-query")
    public static WebElement search_Box;

    public static void Searching(String news)throws InterruptedException{
        Search.click();
        search_Box.sendKeys(news, Keys.ENTER);
        Thread.sleep(3000);
    }
}
